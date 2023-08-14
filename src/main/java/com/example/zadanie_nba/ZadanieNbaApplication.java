package com.example.zadanie_nba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZadanieNbaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZadanieNbaApplication.class, args);
        System.out.println("ПРИМЕР ДЕБИТОВОЙ КАРТЫ");
        BankCard debitCard = new DebitCard();
        System.out.println("Debit Card:");
        System.out.println(debitCard.getAvailableFunds());
        debitCard.topUp(5000);
        System.out.println(debitCard.getAvailableFunds() + "\n");

        System.out.println("ПРИМЕР КРЕДИТНОЙ КАРТЫ");
        BankCard creditCard = new CreditCard( 10000);
        System.out.println("Credit Card:");
        System.out.println(creditCard.getAvailableFunds());
        creditCard.topUp(5000);// пополнили на 5000
        System.out.println(creditCard.getAvailableFunds());
        creditCard.pay(5000);// заплатили 5000
        System.out.println(creditCard.getAvailableFunds());
        creditCard.pay(3000);// заплатили 3000
        System.out.println(creditCard.getAvailableFunds());
        creditCard.topUp(2000);// пополнили на 2000
        System.out.println(creditCard.getAvailableFunds());
        creditCard.topUp(2000);// пополнили на 2000
        System.out.println(creditCard.getAvailableFunds());
        creditCard.topUp(2000);// пополнили на 2000
        System.out.println(creditCard.getAvailableFunds());
        creditCard.topUp(20000);// пополнили на 2000
        System.out.println(creditCard.getAvailableFunds());
        creditCard.pay(5000);// заплатили 5000
        System.out.println(creditCard.getAvailableFunds());
        creditCard.pay(10000);// заплатили 10000
        System.out.println(creditCard.getAvailableFunds());
        creditCard.pay(10000);// заплатили 10000
        System.out.println(creditCard.getAvailableFunds() + "\n");

        System.out.println("ПРИМЕР ПРЕМИУНОЙ КРЕДИТНОЙ КАРТЫ С БОНУСАМИ");
        PremiumCreditCard premiumCreditCard1 = new PremiumCreditCard(10000, "A");
        premiumCreditCard1.topUp(10000);
        System.out.println(premiumCreditCard1.getAvailableFunds());
        premiumCreditCard1.pay(5000);
        System.out.println(premiumCreditCard1.getAvailableFunds());
        premiumCreditCard1.pay(10000);
        System.out.println(premiumCreditCard1.getAvailableFunds());
        System.out.println(premiumCreditCard1.getBonusProgram() + "\n");

        System.out.println("ПРИМЕР ПРЕМИУНОЙ КРЕДИТНОЙ КАРТЫ С КЭШБЭКОМ");
        PremiumCreditCard premiumCreditCard2 = new PremiumCreditCard(10000, "B");
        premiumCreditCard2.topUp(10000);
        System.out.println(premiumCreditCard2.getAvailableFunds());
        premiumCreditCard2.pay(5000);
        System.out.println(premiumCreditCard2.getAvailableFunds());
        premiumCreditCard2.pay(10000);
        System.out.println(premiumCreditCard2.getAvailableFunds());
        System.out.println(premiumCreditCard2.getBonusProgram() + "\n");

        System.out.println("ПРИМЕР ПРЕМИУНОЙ ДЕБЕТОВОЙ КАРТЫ С НАКОПИТЕЛЬНЫМ СЧЕТОМ");
        PremiumDebitCard premiumDebitCard = new PremiumDebitCard("C");
        premiumDebitCard.topUp(10000);
        System.out.println(premiumDebitCard.getAvailableFunds());
        premiumDebitCard.pay(5000);
        System.out.println(premiumDebitCard.getAvailableFunds());
        premiumDebitCard.pay(5001);
        System.out.println(premiumDebitCard.getAvailableFunds());




        //        premiumCreditCard.topUp(10000);
//        System.out.println(premiumCreditCard.getAvailableFunds());
//        premiumCreditCard.pay(5000);
//        System.out.println(premiumCreditCard.getAvailableFunds());



//        PremiumDebitCard premiumDebitCard = new PremiumDebitCard("Bonus Program A");
//        System.out.println("Premium Debit Card - Bonus Program: " + premiumDebitCard.getBonusProgram());

        //       PremiumCreditCard premiumCreditCard = new PremiumCreditCard(5000, "Bonus Program B");
        //       System.out.println("Premium Credit Card - Bonus Program: " + premiumCreditCard.getBonusProgram());

    }

}
