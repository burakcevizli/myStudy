package com.burakcev.example.student;

import jakarta.validation.constraints.NotEmpty;

public record StudentDto(

        @NotEmpty(message = "Firstname should not be empty")
        String firstname,

        @NotEmpty(message = "Last name boş olamaz")
        String lastname,

        String email,

        Integer schoolId
) {
}
