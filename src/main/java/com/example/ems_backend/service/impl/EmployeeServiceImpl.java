package com.example.ems_backend.service.impl;


// Ensure correct package and import


import com.example.ems_backend.EmployeeRepository;
import com.example.ems_backend.dto.EmployeeDto;
import com.example.ems_backend.entity.Employee;
import com.example.ems_backend.exception.ResourceNotFoundException;
import com.example.ems_backend.mapper.EmployeeMapper;
import com.example.ems_backend.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        // Use the EmployeeMapper to map DTO to Entity
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);

        // Save the employee entity
        Employee savedEmployee = employeeRepository.save(employee);

        // Return the saved entity as a DTO
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Employee does not exist with the given id: " + employeeId));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        // Use mapToEmployeeDto instead of mapToEmployee
        return employees.stream()
                .map(EmployeeMapper::mapToEmployeeDto)
                .collect(Collectors.toList());
    }

    @Override
    public EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedemployee) {
       Employee employee= employeeRepository.findById(employeeId).orElseThrow(()->new ResourceNotFoundException("Employee does not exist with given id :"+employeeId));

       employee.setFirstName(updatedemployee.getFirstName());
        employee.setLastName(updatedemployee.getLastName());
        employee.setEmail(updatedemployee.getEmail());

      Employee updatedEmployeeObj=  employeeRepository.save(employee);
       return EmployeeMapper.mapToEmployeeDto(updatedEmployeeObj);
    }

    @Override
    public void deleteEmployee(Long employeeId) {
        Employee employee= employeeRepository.findById(employeeId).orElseThrow(()->new ResourceNotFoundException("Employee does not exist with given id :"+employeeId));
employeeRepository.deleteById(employeeId);
    }
}
