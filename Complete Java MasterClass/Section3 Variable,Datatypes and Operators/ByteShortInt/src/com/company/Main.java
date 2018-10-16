package com.company;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;

        // byte has a width of 8
        byte myByteValue = -128;

        // short has width of 16
        short myShortValue = 32767;

	    byte byteValue = 10;
	    short shortValue = 20;
	    int intValue = 50;

	    long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
	    short shortTotal = (short) (100 + 10 * (byteValue + shortValue +intValue));
        System.out.println("longTotal = " + longTotal);
        System.out.println("shortTotal = " + shortTotal);
    }
}
