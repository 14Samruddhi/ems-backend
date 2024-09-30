package com.example.ems_backend; // Ensure this is the correct package

import com.example.ems_backend.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // You can add custom query methods here if needed
}
