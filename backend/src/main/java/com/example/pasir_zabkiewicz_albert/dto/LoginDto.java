package com.example.pasir_zabkiewicz_albert.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;

@Getter
public class LoginDto {
    @NotBlank
    private String email;

    @NotBlank
    private String password;
}
