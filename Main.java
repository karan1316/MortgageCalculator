package com.javalearning;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       final int months_In_Year = 12;// final used to make the value constant
       final int percent = 100;
       int principal = 0;
       float monthlyInterest = 0;
       byte years = 0;
       int noOfMonthlyPayments = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Principal (1k - 10L): ");
             principal = scanner.nextInt();
            if (principal >=1000 && principal <= 10_00_000)
                break;
            System.out.println("Enter a value between 1000 and 1000000");
        }
        while(true) {
            System.out.print("Annual Interest Rate: ");
            float annualInterest = scanner.nextFloat();
            if (annualInterest >=1 && annualInterest <=30) {
                monthlyInterest = annualInterest / percent / months_In_Year;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }
        while (true) {
            System.out.print("Time(Years): ");
            years = scanner.nextByte();
            if(years >=1 && years <= 30) {
                noOfMonthlyPayments = years * months_In_Year;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }
        double mortgage = principal * (monthlyInterest * Math.pow(1+monthlyInterest,noOfMonthlyPayments)/
                                       Math.pow(1+monthlyInterest,noOfMonthlyPayments));
        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));





    }
}
