package com.company.set.homework.bardy;

public class Car {
    private int numberOfTires;
    private String colour;

    public Car(int numberOfTires, String colour) {
        this.numberOfTires = numberOfTires;
        this.colour = colour;
    }

    public int getNumberOfTires() {
        return numberOfTires;
    }

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
