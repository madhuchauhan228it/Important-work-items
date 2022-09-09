package com.sunglowsys.test;
import com.sunglowsys.domain.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class GetStudent {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory factory = configuration.buildSessionFactory();
        Session session = factory.openSession();
         Transaction transaction = session.beginTransaction();

        Object object = session.get(Student.class,new Long(1));

        Student student = (Student) object;
        System.out.println(student.getId()+"= "+student.getFirstName()+""+student.getLastName()+","+student.getEmail()+","+student.getMobile()+","+student.getGender());
        transaction.commit();
        session.close();

    }
}
