package com.example.zadanie_nba;

class CreditCard extends BankCard {
    public final double creditLimit;
    public double creditLimitNow;

    public CreditCard(double creditLimit) {
        this.creditLimit = creditLimit;
        creditLimitNow = creditLimit;
    }

    @Override
    public void topUp(double amount) {
        if (creditLimitNow < creditLimit ){
//            System.out.println("1.1 этап");
            if (creditLimitNow + amount < creditLimit){
                balance = 0;
                creditLimitNow = creditLimitNow + amount;
//                System.out.println("2.1 этап");
            } else if (creditLimitNow + amount > creditLimit){
                balance = creditLimitNow + amount - creditLimit;
                creditLimitNow = creditLimit;
//                System.out.println("2.2 этап");
            }
        }else if (creditLimitNow >= this.creditLimitNow){
//            System.out.println("1.2");
            balance += amount;
        }
    }

    @Override
    public boolean pay(double amount) {//Пополнение
        if (balance >= amount) { // Хвататет ли баланса для оплаты
            balance -= amount;
            return true;
        } else if (balance + creditLimitNow >= amount) { //Хватает ли баланса и кредитного лимита для оплаты
            double creditPart = amount - balance;

            balance = 0;
            creditLimitNow -= creditPart;
            return true;
        }
        return false;
    }

    @Override
    public String getAvailableFunds() { //Получение информации о балансе и о кредитном лимите
        return "Balance: " + balance + ", Credit Limit: " + creditLimitNow;
    }
}
