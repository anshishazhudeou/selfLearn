package com.company;

public class Main {

    public static void main(String[] args) {
	    com.company.Car porsche = new com.company.Car();
        com.company.Car holden = new com.company.Car();
        System.out.println("Model is " + porsche.getModel());
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
        System.out.println(1);
    }
}
