package com.example.zadanie_nba;

class PremiumDebitCard extends DebitCard { //Подкласс DebitCard
    private String bonusProgram;
    private double capital;

    public PremiumDebitCard(String bonusProgram) {
        this.bonusProgram = bonusProgram;
    }

    @Override
    public boolean pay(double amount) {
        switch (bonusProgram) {
            case "C":
            if (balance >= amount) {
                balance -= amount;
                capital += amount * 0.1;
                return true;
            }else System.out.println("операция не прошла");
        }
        return false;
    }

    @Override
    public String getAvailableFunds() {
        return "Balance: " + balance + ", Capital: " + capital;
    }

}