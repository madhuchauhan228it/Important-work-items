package service;

import java.util.List;

public interface EmployeeRepository {
    Employee save(Employee employee);
    Employee update(Employee employee,Long id);
    Employee findById(Long id);
    List<Employee>findAll();
    void delete(Long id);

}
