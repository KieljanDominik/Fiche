package com.example.fishe.service;

import com.example.fishe.dao.CardDAO;
import com.example.fishe.entity.Card;
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
    public Card save(Card card) {
    return     cardDAO.save(card);
    }
}
