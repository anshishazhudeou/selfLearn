package com.company;

public class Main {

    public static void main(String[] args) {
        // width of 16 (2 bytes)
	    char myChar = '&'; // can store one letter

        boolean myBoolean = false;
        boolean isMale = true;

        // 1. Find the code for the registered symbol on the same line as the copyright symbol.
        // 2. create a variable of type char and assign it the unicode value for that symbol
        // 3. Display in on screen
        char copyright = '\u00AE';
        System.out.println("copyright = " + copyright);

    }
}
