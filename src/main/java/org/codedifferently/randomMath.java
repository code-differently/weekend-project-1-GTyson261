package org.codedifferently;

import java.util.Random;

public class randomMath {

    public static int visittoryid(Random random){
        return random.nextInt(90000)+10000;
    }
    public static double itemPrice(Random random){
        double price = random.nextDouble() * 20 +5;
        return Math.round(price*100.0)/100.0;
    }
    public static double subTotal(double a,double b,double c){
        double subTotal = a+b+c;
        return Math.round(subTotal*100.0)/100.0;
    }
    public static double tax(double subTotal, double rate){
        return Math.round(subTotal*rate*100.0)/100.0;
    }
}
