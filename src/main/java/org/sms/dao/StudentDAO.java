package org.sms.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.sms.model.Person;
import org.sms.util.HibernateUtil;

import java.util.List;

//Student dao
public class StudentDAO {

    //Saving student
    public void save(Person student) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        session.persist(student);

        tx.commit();
        session.close();
    }

    //Fetching all students
    public List<Person> getAll() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Student", Person.class).list();
        }
    }
}
