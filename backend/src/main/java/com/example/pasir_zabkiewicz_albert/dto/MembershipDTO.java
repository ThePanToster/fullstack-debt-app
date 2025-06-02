package com.example.pasir_zabkiewicz_albert.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MembershipDTO {

    @NotNull(message = "Email użytkownika nie może być pusty")
    private String userEmail;

    @NotNull(message = "ID grupy nie może być pusty")
    private Long groupId;
}
