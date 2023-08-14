package com.example.zadanie_nba;

class DebitCard extends BankCard { //Подкласс BankCard
    @Override
    public void topUp(double amount) {
        balance += amount;
    }
    @Override
    public boolean pay(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    @Override
    public String getAvailableFunds() {
        return "Balance: " + balance;
    }
}
