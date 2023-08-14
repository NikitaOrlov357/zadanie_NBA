package com.example.zadanie_nba;

class PremiumCreditCard extends CreditCard { //Подкласс CreditCard
    private String bonusProgram;
    private double bonusPoints;
    public double creditLimitNow;

    public PremiumCreditCard(double creditLimit, String bonusProgram) {
        super(creditLimit);
        this.bonusProgram = bonusProgram;
        creditLimitNow = creditLimit;
    }

    public String getBonusProgram() {
        return bonusProgram;
    }

    @Override
    public boolean pay(double amount) {
        switch (bonusProgram){
            case "A":
//                System.out.println("работает А");
                if (balance >= amount ) {
//                    System.out.println("AAAA");
                    balance -= amount;
                    bonusPoints = amount * 0.01 + bonusPoints;
                    return true;
                } else if (balance + creditLimitNow >= amount ) {
//                    System.out.println("aaaa");
                    double creditPart = amount - balance;
                    balance = 0;
                    creditLimitNow -= creditPart;
                    bonusPoints = amount * 0.01 + bonusPoints;
                    return true;
                }else System.out.println("операция не прошла");
                break;


            case "B":
//                System.out.println("работает В");
                if (balance >= amount && amount >= 5000) {
//                    System.out.println("BBBB");
                    balance -= amount;
                    balance = balance + amount * 0.05;
                    return true;
                } else if (balance + creditLimitNow >= amount) {
//                    System.out.println("работает bbbb");
                    double creditPart = amount - balance;
                    balance = 0;
                    creditLimitNow -= creditPart;
                    creditLimitNow = creditLimitNow + amount * 0.05;
                    return true;
                } else System.out.println("операция не прошла");
        }
        return false;
    }


    @Override
    public String getAvailableFunds() { //Получение информации о балансе, о кредитном лимите и о бонусах
        if (bonusProgram.equals("A")){
            return "Balance: " + balance + ", Credit Limit: " + creditLimitNow + ", Bonus Points: " +  bonusPoints;
        }else if (bonusProgram.equals("B")){
            return "Balance: " + balance + ", Credit Limit: " + creditLimitNow;
        }
        return "сломал";
    }
}