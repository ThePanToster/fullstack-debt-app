package com.example.pasir_zabkiewicz_albert.dto;

import com.example.pasir_zabkiewicz_albert.model.TransactionType;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
public class TransactionDTO {

    @NotNull(message = "Kwota nie może być pusta")
    @Min(value = 1, message = "Kwota musi być większa niż 0")
    private Double amount;

    @NotNull
    private TransactionType type;

    @Size(max = 50)
    private String tags;

    @Size(max = 255)
    private String notes;

    private LocalDateTime timestamp;
}
