package org.example;

import java.io.InputStream;
import java.util.Scanner;

public class TerminalAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the account number");
        Integer account = scanner.nextInt();

        System.out.println("Please enter the agency");
        String agency = scanner.next();

        System.out.println("Please enter the customer's name");
        String custName = scanner.next();

        System.out.println("Please enter the balance");
        Double balance = scanner.nextDouble();

        String finalString = "";

        finalString = finalString.concat("Hello ")
                .concat(custName)
                .concat(", thank you for creating an account at our bank, your agency is ")
                .concat(agency)
                .concat(", account ")
                .concat(String.valueOf(account))
                .concat(" and your balance ")
                .concat(String.valueOf(balance))
                .concat(" is now available for withdrawal.");

        System.out.println(finalString);
    }
}