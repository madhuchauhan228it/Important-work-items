package com.sunglowsys.test;

import com.sunglowsys.domain.Address;
import com.sunglowsys.domain.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveStudents {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Address address = new Address("kasganj","Mohnpura","aligarh","up");
        Student student = new Student("Bhanu Pratap","Singh","Omchauhan220it@gamil.com","9997657776","Male",address);

        session.save(student);
        transaction.commit();
        session.close();
        System.out.println("Students data  saved successfully");


    }
}
