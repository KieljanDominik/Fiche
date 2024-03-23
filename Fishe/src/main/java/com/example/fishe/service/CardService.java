package com.example.fishe.service;

import com.example.fishe.entity.Card;
import com.example.fishe.exceptions.EmptyCardException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CardService {
    List<Card> getAllCards();

    Card save(Card card);
}
