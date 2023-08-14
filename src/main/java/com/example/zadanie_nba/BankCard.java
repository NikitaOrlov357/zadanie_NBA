package com.example.zadanie_nba;

abstract class BankCard { //Класс для ВСЕХ карт
    protected double balance;

    public abstract void topUp(double amount);  //пополнение
    public double getBalance() { //получения текущего баланса
        return balance;
    }
    public abstract boolean pay(double amount); //оплата
    public abstract String getAvailableFunds(); //доступные средства
}
