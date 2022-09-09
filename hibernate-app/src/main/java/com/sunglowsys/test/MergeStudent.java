package com.sunglowsys.test;
import com.sunglowsys.domain.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class MergeStudent {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Session session = factory.openSession();

        Student student = (Student)session.get(Student.class,new Long(3));

        student.setFirstName("Rudra");
        session.close();
        Session session1 = factory.openSession();
        Transaction txn1 = session1.beginTransaction();
        Student student1 = (Student)session1.get(Student.class,new Long(3));

        student1.setFirstName("Madhu");
        session1.merge(student1);
        txn1.commit();
        session1.close();
            System.out.println("Data updated Successfully");


    }
}
