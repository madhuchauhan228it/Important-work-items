package com.sunglowsys.test;
import com.sunglowsys.domain.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateStudents {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();

        Student student = session.get(Student.class,new Long(1));
        student.setFirstName("Madhu");
        session.close();

        Session session1 = factory.openSession();
        Transaction txn1 = session1.beginTransaction();

        Student student1 = (Student) session1.get(Student.class,new Long(1));
        student1.setFirstName("Neha");

        session1.update(student1);
        txn1.commit();
        session1.close();
        System.out.println("Data updated Successfully");
    }
}
