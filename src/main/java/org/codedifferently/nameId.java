package org.codedifferently;


import java.util.Random;

public class nameId {
    // I added the method to apply the coupon code and calculate the total after the discount is applied.
    public static double couponCode(String coupon,double total){
        if (coupon.trim().equalsIgnoreCase("Vip0")){
            total -= Math.min(10,total*0.1);
        }
        return Math.round(Math.abs(total)*100.0)/100.0;
    }
//I added the method to generate the code for the reciept using the name and the visit ID.
    public static String code(String name, int id) {
        String personName = name.trim().toUpperCase();
        return personName.charAt(0) + personName.substring(personName.length() - 1) + id;

    }
// I added the method to generate a random tag for the reciept using the Random class.
    public static String tag(Random random){
        int pick = random.nextInt(4);
        if (pick==0){
            return "Did you win?";
        } else if (pick==1){
            return "Better luck next time!";
        }
        else if (pick==2){
            return "You are a winner!";
        }
        else {
            return "Try again!";
        }
}

}
