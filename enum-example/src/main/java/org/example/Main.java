package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter vamount and currency code:");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] parameters = userInput.split(" ");
        Integer amount = Integer.valueOf(parameters[0]);
        String currencyCode = parameters[1];
        Currency instance = Currency.valueOf(currencyCode);
        String endingMessage = instance.getEndingMessage(amount);
        double convertedAmount = instance.convert(100.0, Currency.USD);
        System.out.println(convertedAmount);
        System.out.println(amount + " " + currencyCode);
        System.out.println(amount + " " + endingMessage);
    }
}
