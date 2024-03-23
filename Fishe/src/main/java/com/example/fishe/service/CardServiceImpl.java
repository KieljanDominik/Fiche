package com.example.fishe.service;

import com.example.fishe.dao.CardDAO;
import com.example.fishe.entity.Card;
import com.example.fishe.exceptions.EmptyCardException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CardServiceImpl implements CardService{

    public CardDAO cardDAO;

    @Autowired
    public CardServiceImpl(CardDAO cardDAO) {
        this.cardDAO = cardDAO;
    }

    @Override
    public List<Card> getAllCards() {
        return cardDAO.getAllCards();
    }
    @Transactional
    @Override
    public Card save(Card card)  {

            if(card.getQuestion().isEmpty()||card.getAnswer().isEmpty())
            {
                throw new EmptyCardException("Question and answer cannot be empty.");

            }
            else
                return cardDAO.save(card);

    }
}
