package tech.getarrays.employeemanager.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tech.getarrays.employeemanager.exception.EmployeeManagerException;
import tech.getarrays.employeemanager.model.Employee;
import tech.getarrays.employeemanager.repo.EmployeeRepo;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class EmployeeService {

    private final EmployeeRepo repo;

    public EmployeeService(EmployeeRepo repo) {
        this.repo = repo;
    }

    public Employee add(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return repo.save(employee);
    }

    public List<Employee> findAllEmployees() {
        return repo.findAll();
    }

    public Employee update(Employee employee) {
        return repo.save(employee);
    }

    public void deleteEmployeeById(Long id) {
        repo.deleteEmployeeById(id);
    }

    public Employee findEmployeeById(Long id) {
        return repo.findEmployeeById(id).orElseThrow(() -> new EmployeeManagerException("Employee of id " + id + " not found"));
    }
}
