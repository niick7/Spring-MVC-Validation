package com.example.validation_demo.model;

import com.example.validation_demo.validation.CourseCode;
import jakarta.validation.constraints.*;

public class Customer {
    private String firstName;

    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    private String lastName;

    @NotNull
    @Min(value=0)
    @Max(value=10)
    private int freePasses;

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "Only 5 characters or digits")
    private String postalCode;

    // CourseCode is a custom Java Validation
    @CourseCode(value="LUV", message="must start with LUV")
    private String courseCode;

    public Customer() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Min(value = 0)
    @Max(value = 10)
    public int getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(@Min(value = 0) @Max(value = 10) int freePasses) {
        this.freePasses = freePasses;
    }

    public @Pattern(regexp = "^[a-zA-Z0-9]{5}") String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(@Pattern(regexp = "^[a-zA-Z0-9]{5}") String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
