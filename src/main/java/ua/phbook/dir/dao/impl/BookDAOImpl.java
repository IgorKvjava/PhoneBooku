package ua.phbook.dir.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.*;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ua.phbook.dir.dao.interfaces.BookDAO;
import ua.phbook.dir.entities.PhoneBook;

import java.util.List;

@Component
public class BookDAOImpl implements BookDAO{


    @Autowired
    private SessionFactory sessionFactory;

    private List<PhoneBook> phBook;

    @Override
    public List<PhoneBook> getBooks() {
        phBook =(List<PhoneBook>) sessionFactory.getCurrentSession()
                .createCriteria(PhoneBook.class)
                .setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);

        return phBook;
    }
}
