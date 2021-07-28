package com.company.set.homework.bardy;

public class Bardy extends Car {

    private int numberOFSeats;
    private boolean isGoldPlated;

    public Bardy(int numberOfTires, String colour, int numberOFSeats, boolean isGoldPlated) {
        super(numberOfTires, colour);
        this.numberOFSeats = numberOFSeats;
        this.isGoldPlated = isGoldPlated;
    }

    public int getNumberOFSeats() {
        return numberOFSeats;
    }

    public void setNumberOFSeats(int numberOFSeats) {
        this.numberOFSeats = numberOFSeats;
    }

    public boolean isGoldPlated() {
        return isGoldPlated;
    }

    public void setGoldPlated(boolean goldPlated) {
        isGoldPlated = goldPlated;
    }
}
