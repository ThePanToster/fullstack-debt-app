package com.example.pasir_zabkiewicz_albert.dto;

import lombok.Data;

@Data
public class BalanceDTO {
    private Double totalIncome;

    private Double totalExpense;

    private Double balance;

    public BalanceDTO(Double totalIncome, Double totalExpense, Double balance) {
        this.totalIncome = totalIncome;
        this.totalExpense = totalExpense;
        this.balance = balance;
    }
}
