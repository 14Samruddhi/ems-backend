package com.example.ems_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email; // Changed to lowercase for convention
    private String address; // New field
    private String contactNumber; // New field
    private double ctc; // New field
    private String designation; // New field
    private String workLocation; // New field
}
