package com.example.fishe.dao;

import com.example.fishe.entity.Card;

import java.util.List;

public interface CardDAO {

    List<Card> getAllCards();

    Card save(Card card);

}
