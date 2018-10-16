package com.company;

public class Main {

    public static void main(String[] args) {
        // width of int = 32 (4 bytes)
	    int myIntValue = 5 / 2;
        // width of float = 32 (4 bytes)
	    float myFloatValue = 5f / 3f;
        // width of double = 64 (8 bytes)
	    double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        // Covert a given number of pounds to kilograms
        // 1. create a variable to store the number of pounds
        // 2. calculate the number of kilograms for the number above and store in a variable.
        // 3. print out the result.
        //
        // NOTES: 1 pound is euqal to 0.45359237 kilograms

        double numPounds = 200;
        double convertedKilograms = numPounds * 0.45359237d;
        System.out.println(convertedKilograms);
        // 90.7185
        //double pi = 3_000_000.141_5927d; // we can use undersocre to make the large value more clearer
    }
}
