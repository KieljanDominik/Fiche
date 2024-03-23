package com.example.fishe.dao;

import com.example.fishe.entity.Card;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CardDAOImpl implements CardDAO{
public EntityManager entityManager;

    @Autowired
    public CardDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Card> getAllCards() {
        TypedQuery<Card> query = entityManager.createQuery("from Card ",Card.class);
        return query.getResultList();
    }

    @Override
    public Card save(Card card) {
        return entityManager.merge(card);
    }

    @Override
    public Card findById(int id) {
        return entityManager.find(Card.class,id);

    }
}
