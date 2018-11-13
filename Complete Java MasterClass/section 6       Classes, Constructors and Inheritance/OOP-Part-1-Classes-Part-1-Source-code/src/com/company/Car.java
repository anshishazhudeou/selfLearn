package com.company;

/**
 * Created by dev on 8/3/15.
 */
public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        String valideModel = model.toLowerCase();
        if (valideModel.equals("porsche") || valideModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "unkwon";
        }
    }

    public String getModel() {
        return this.model;
    }


}
