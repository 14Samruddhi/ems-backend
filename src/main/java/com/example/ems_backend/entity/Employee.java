package com.example.ems_backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email_id", nullable = false, unique = true)
    private String email; // Changed to lowercase for convention

    @Column(name = "address", nullable = false)
    private String address; // New field

    @Column(name = "contact_number", nullable = false)
    private String contactNumber; // New field

    @Column(name = "ctc", nullable = false)
    private double ctc; // New field

    @Column(name = "designation", nullable = false)
    private String designation; // New field

    @Column(name = "work_location", nullable = false)
    private String workLocation; // New field
}
