package com.example.ems_backend.mapper;

import com.example.ems_backend.dto.EmployeeDto;
import com.example.ems_backend.entity.Employee;

public class EmployeeMapper {
    public static EmployeeDto mapToEmployeeDto(Employee employee) {
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail(),
                employee.getAddress(),
                employee.getContactNumber(),
                employee.getCtc(),
                employee.getDesignation(),
                employee.getWorkLocation()
        );
    }

    public static Employee mapToEmployee(EmployeeDto employeeDto) {
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail(),
                employeeDto.getAddress(),
                employeeDto.getContactNumber(),
                employeeDto.getCtc(),
                employeeDto.getDesignation(),
                employeeDto.getWorkLocation()
        );
    }
}
