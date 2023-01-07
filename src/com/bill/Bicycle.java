package com.bill;

public class Bicycle {
    // three fields
    public int cadence;
    public int speed;
    public int gear;

    // constructor
//    public Bicycle(int cadence, int speed, int gear) {
//        this.cadence = cadence;
//        this.speed = speed;
//        this.gear = gear;
//    }

    public Bicycle(int startingCadence, int startingSpeed, int startingGear) {
        this.cadence = startingCadence;
        this.speed = startingSpeed;
        this.gear = startingGear;
    }
}