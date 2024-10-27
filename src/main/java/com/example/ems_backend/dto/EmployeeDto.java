
package com.example.ems_backend.dto;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import lombok.Data;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "First name is required")
    @Size(max = 50, message = "First name cannot be more than 50 characters")
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @NotBlank(message = "Last name is required")
    @Size(max = 50, message = "Last name cannot be more than 50 characters")
    @Column(name = "last_name", nullable = false)
    private String lastName;

    @NotBlank(message = "Email is required")
    @Email(message = "Email should be valid")
    @Column(name = "email_id", nullable = false, unique = true)
    private String email;

    @NotBlank(message = "Address is required")
    @Size(max = 100, message = "Address cannot exceed 100 characters")
    @Column(name = "address", nullable = false)
    private String address;

    @NotBlank(message = "Contact number is required")
    @Pattern(regexp = "^\\d{10}$", message = "Contact number should be 10 digits")
    @Column(name = "contact_number", nullable = false)
    private String contactNumber;

    @DecimalMin(value = "0.0", inclusive = false, message = "CTC should be greater than 0")
    @Column(name = "ctc", nullable = false)
    private double ctc;

    @NotBlank(message = "Designation is required")
    @Column(name = "designation", nullable = false)
    private String designation;

    @NotBlank(message = "Work location is required")
    @Column(name = "work_location", nullable = false)
    private String workLocation;
}
