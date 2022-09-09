package com.sunglowsys.test;
import com.sunglowsys.domain.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class DeleteStudent {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
        Transaction txn = session.beginTransaction();
        Object obj = session.get(Student.class,new Long(4));
        Student student = (Student)obj;

        session.delete(student);
        txn.commit();
        System.out.println("Data Updated Successfully");
        session.close();
    }
}
