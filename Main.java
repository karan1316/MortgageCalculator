package com.javalearning;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       final int months_In_Year = 12;// final used to make the value constant
       final int percent = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / percent / months_In_Year;

        System.out.print("Time(Years): ");
        byte years = scanner.nextByte();
        int noOfMonthlyPayments = years * months_In_Year;
        double mortgage = principal * (monthlyInterest * Math.pow(1+monthlyInterest,noOfMonthlyPayments)/
                                       Math.pow(1+monthlyInterest,noOfMonthlyPayments));

        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));





    }
}