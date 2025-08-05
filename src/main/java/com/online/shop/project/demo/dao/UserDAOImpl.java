package com.online.shop.project.demo.dao;

import com.online.shop.project.demo.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO{

    private EntityManager entityManager;

    @Autowired
    public UserDAOImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }


    @Override
    @Transactional
    public void saveUser(User theUser) {
        entityManager.persist(theUser);
    }

    @Override
    public User findUserById(int theId) {
        return entityManager.find(User.class, theId);
    }

    @Override
    public User findUserByEmail(String theEmail) {
        return entityManager.find(User.class, theEmail);
    }

    @Override
    public List<User> findAllUsers() {
        TypedQuery<User> theQuery = entityManager.createQuery("FROM User", User.class);
        return theQuery.getResultList();
    }

    @Override
    public List<User> findUserByLastName(String theLastName) {
        TypedQuery<User> typedQuery = entityManager.createQuery(
                "select s FROM User WHERE s.lastName=:theData", User.class
        );
        typedQuery.setParameter("theData", theLastName);
        return typedQuery.getResultList();
    }

    @Override
    @Transactional
    public void updateUser(User theUser) {
        entityManager.merge(theUser);
    }

    @Override
    @Transactional
    public void deleteUserById(int theId) {
        User theUser = entityManager.find(User.class, theId);
        entityManager.remove(theUser);
    }
}
