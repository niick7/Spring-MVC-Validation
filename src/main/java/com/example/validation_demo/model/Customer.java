package com.example.validation_demo.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Customer {
    private String firstName;

    @NotNull(message = "is required")
    @Size(min=1, message = "is required")
    private String lastName;

    @Min(value=0)
    @Max(value=10)
    private int freePasses;

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
}
