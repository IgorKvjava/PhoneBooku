package ua.phbook.dir.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ua.phbook.dir.dao.interfaces.GenreDAO;
import ua.phbook.dir.entities.Users;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GenreDAOImpl implements GenreDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public List<Users> getGenres() {
        return sessionFactory.getCurrentSession().createCriteria(Users.class).list();
    }





}
