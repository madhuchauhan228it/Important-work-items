package com.sunglowys.repostery;

import com.sunglowys.domain.Employee;
import com.sunglowys.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class EmployeeRepositoryImpl implements EmployeeRepository{

    private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    @Override
    public Employee save(Employee employee) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        Integer id = (Integer) session.save(employee);
        session.close();
        Employee result = session.get(Employee.class,id);
        return result;
    }

    @Override
    public Employee update(Employee employee, Integer id) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Employee employee1 = session.get(Employee.class,id);
        employee1.setEmpName(employee.getEmpName());
        session.update(employee1);
        session.getTransaction().commit();
        session.close();
        System.out.println("Updated");
        return employee1;
    }

    @Override
    public Employee findById(Integer id) {
        return null;
    }

    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
