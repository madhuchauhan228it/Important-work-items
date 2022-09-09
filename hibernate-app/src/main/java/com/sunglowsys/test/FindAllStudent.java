package com.sunglowsys.test;
import com.sunglowsys.domain.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.io.Serializable;
import java.util.List;

public class FindAllStudent {
    private static Serializable id;

    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("from Student where id=?");
        Student student = session.get(Student.class,id);

        System.out.println(student);
        transaction.commit();
        session.close();


    }
}
