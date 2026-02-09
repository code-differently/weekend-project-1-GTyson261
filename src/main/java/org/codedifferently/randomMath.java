package org.codedifferently;

import java.util.Random;

public class randomMath {
// I added the method to generate a random visit ID using the Random class.
    public static int visitor(Random random){
        return random.nextInt(90000)+10000;
    }
    // I added the method to generate a random price for each item using the Random class and rounding it to 2 decimal places.
    public static double itemPrice(Random random){
        double price = random.nextDouble() * 20 +5;
        return Math.round(price*100.0)/100.0;
    }
    // I added the method to calculate the subtotal by adding the prices of the three items and rounding it to 2 decimal places.
    public static double subTotal(double a,double b,double c){
        double subTotal = a+b+c;
        return Math.round(subTotal*100.0)/100.0;
    }

   // I added the method to calculate the tax by multiplying the subtotal by the tax rate and rounding it to 2 decimal places.
    public static double tax(double subTotal, double rate){
        return Math.round(subTotal*rate*100.0)/100.0;
    }
}
