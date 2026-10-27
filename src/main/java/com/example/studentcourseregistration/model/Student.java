
package com.example.studentcourseregistration.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class Student {

    private Long studentId;

    @NotBlank(message = "Student name cannot be empty")
    private String studentName;

    @NotBlank(message = "Course name cannot be empty")
    private String courseName;

    @Email(message = "Enter valid email")
    @NotBlank(message = "Email cannot be empty")
    private String email;

    @Min(value = 18, message = "Age must be above 18")
    private int age;
}
