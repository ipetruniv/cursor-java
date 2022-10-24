package com.java.ipetruniv;

/**
 * Simple calculator
 */
public class calculator {
    public static void main(String[] args) {
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        int result = number1 + number2;
        System.out.println(args[0] + " + " + args[1] + " = " +  Integer.toString(result));
        //System.out.println(result);
    }
}
