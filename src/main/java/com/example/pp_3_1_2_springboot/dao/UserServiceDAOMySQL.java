package com.example.pp_3_1_2_springboot.dao;

import com.example.pp_3_1_2_springboot.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional(readOnly = true)
public class UserServiceDAOMySQL implements UserServiceDAO {
    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<User> getAll() {
        return entityManager.createQuery("select u from User as u").getResultList();
    }

    @Override
    public User get(Long id) {
        return entityManager.find(User.class, id);
    }

    @Transactional
    @Override
    public void add(User user) {
        entityManager.persist(user);
    }

    @Transactional
    @Override
    public void update(Long id, User user) {
        entityManager.merge(user);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        entityManager.remove(get(id));
    }
}
