package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result  = result + 1;
        System.out.println("Result is now" + result);
        ++result;
        System.out.println("Result is now" + result);
        --result;
        System.out.println("Result is now" + result);
        result += 2;
        System.out.println("Result is now" + result);
        result *= 10;
        System.out.println("Result is now" + result);


        boolean isAlien = false;
        if (isAlien)
            System.out.println("It is not an alient!");


        int topScore = 80;
        if (topScore >= 100)
            System.out.println("You got the high score!");

        int secondTopScore = 60;
        if((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than top score and less than 100");

        if ((topScore > 90) || (secondTopScore <= 90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is an error");

        boolean isCar = false;
        if(isCar == true)
            System.out.println("This is not suppposed to happen");

        isCar = true;
        boolean wasCar = isCar? true : false;  // evalue isCar first. If it's true return true. Otherwise, return false.
        if(wasCar)
            System.out.println("wasCar is true");


        // 1. create a double variable with the value 20
        // 2. create a second variable of type double with the value 80
        // 3. add both numbers up and multiply by 25
        // 4. use the remainder operator to figure out the remainder from
        //      the sum of #3 divided by 40
        // 5. write an "if" statement that displays a message "Total was over the limit"
        //      if the remaining total (#4) is equal to 20 or less

        double firstDouble = 20;
        double secondDouble = 80;
        double total = (firstDouble + secondDouble) * 25;
        double remainder = (total % 3) / 40;
        System.out.println("myTotal = " + total);

        if (remainder <= 20)
            System.out.println("Total was over the limit");
        else
            System.out.println("Total was not over the limit");




    }
}
