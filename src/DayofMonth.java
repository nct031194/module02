package com.codegym;
import java.util.Date;
import java.util.Scanner;

public class DayofMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month;
        System.out.print("Which month that you want to count days? ");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid month");
            scanner.next();
        }
        month = scanner.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("this " + month + "month have 31 days");
                break;
            case 2:
                System.out.println("this " + month + "month have 28 or 29 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("this " + month + "month have 30 days");
                break;
            default:
                System.out.println("invalid month");
        }
    }
}
