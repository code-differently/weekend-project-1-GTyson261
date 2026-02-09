package org.codedifferently;


import java.util.Random;

public class nameId {

    public static String code(String name, int id) {
        String personName = name.trim().toUpperCase();
        return personName.charAt(0) + personName.substring(personName.length() - 1) + id;

    }
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
