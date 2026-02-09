package org.codedifferently;

import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
       // Scanner to  add inputs
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Enter your name please: ");
        String name = scanner.nextLine();


        System.out.println("Enter how much you are spending");
        double budget = scanner.nextDouble();
        scanner.nextLine();


        System.out.println("Enter coupon code if you have one");
        String coupon = scanner.nextLine();
        scanner.close();
//I called the methods from the other classes to generate the random values and do the calculations
        int visited = randomMath.visitor(random);
        double item1 = randomMath.itemPrice(random);
        double item2 = randomMath.itemPrice(random);
        double item3 = randomMath.itemPrice(random);

        double subTotal = randomMath.subTotal(item1, item2, item3);

        double taxRate = Math.max(0.05, random.nextDouble() * 0.1);
        double tax = randomMath.tax(subTotal, taxRate);

        double total = subTotal + tax;
        total = nameId.couponCode(coupon, total);
        total = Math.round(total * 100.0) / 100.0;

        String code = nameId.code(name, visited);
        String tag = nameId.tag(random);
// I added the print statements to display the reciept and the results of the calculations.
        System.out.println("Welcome to the winning store : " + name);
        System.out.println("Your visit ID is: " + visited);
        System.out.println("Your code for your reciept is: " + code);
        System.out.println("||||||||||||||||||||||");
        System.out.println("Item 1: $" + item1);
        System.out.println("Item 2: $" + item2);
        System.out.println("Item 3: $" + item3);
        System.out.println("''''''''''''''''''''''''");
        System.out.println("Subtotal: $" + subTotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + (subTotal + tax));
// I added the if statement to compare the total with the budget and display the appropriate message.
        if (budget >= total) {
            System.out.println("Money remaining: $"
                    + (Math.round((budget - total) * 100.0) / 100.0));
        } else {
            System.out.println("You are over budget by: $"
                    + (Math.round((total - budget) * 100.0) / 100.0));
        }
        System.out.println("\n" + tag);
    }
}