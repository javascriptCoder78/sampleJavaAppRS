package com.sample.rs.SampleJavaAppRS.repository;



import com.sample.rs.SampleJavaAppRS.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

