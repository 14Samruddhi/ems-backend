package com.example.ems_backend.service;

import com.example.ems_backend.dto.EmployeeDto;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long employeeId);

    List<EmployeeDto> getAllEmployees();
    EmployeeDto updateEmployee (Long employeeId, EmployeeDto updatedemployee );
    void deleteEmployee(Long employeeId);
}
