package org.example.DB;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;

public class AccountingDao {
    public AccountingEntity findById(int id) {
        return HibernateSessionFactory.getSessionFactory().openSession().get(AccountingEntity.class, id);
    }

    public void save(AccountingEntity accounting) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(accounting);
        transaction.commit();
        session.close();
    }

    public void update(AccountingEntity accounting) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(accounting);
        transaction.commit();
        session.close();
    }

    public void delete(AccountingEntity accounting) {
        Session session = HibernateSessionFactory.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(accounting);
        transaction.commit();
        session.close();
    }

    public ArrayList<AccountingEntity> findAll() {
        ArrayList<AccountingEntity> accountingEntities = new ArrayList<AccountingEntity>();
        return (ArrayList<AccountingEntity>) HibernateSessionFactory.getSessionFactory().openSession().createQuery("from AccountingEntity ").list();

    }
}
