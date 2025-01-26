package com.sample.rs.SampleJavaAppRS;

import com.sample.rs.SampleJavaAppRS.model.Employee;
import com.sample.rs.SampleJavaAppRS.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SampleRestService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/getEmployees")
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }


}
