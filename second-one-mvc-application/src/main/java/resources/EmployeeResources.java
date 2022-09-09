package resources;

import service.Employee;
import com.sunglowsys.service.EmployeeService;
import service.EmployeeRepository;

public class EmployeeResources {
    private final EmployeeService employeeService;

    public EmployeeResources(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    public Employee createEmployee(Employee employee) {
        return employeeService.save(employee);
    public Employee updateEmployee(Employee employee) {

        return employeeService.update(employee);
    }
    public Employee findById(Employee) {

    }


}
