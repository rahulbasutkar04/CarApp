package org.amaap.carapp;

public class Car {
    private float capacity=0;
    private float average=0;
    private float distanceCovered=0;
    private double availableFuel=0;
   private double distanceToEmpty=0;

    public Car(float capacity, float average) {
        this.capacity=capacity;
        this.average=average;
    }


    public float getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public float getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }


    public float getDistanceCovered() {
        return distanceCovered;
    }

    public void setDistanceCovered(int distanceCovered) {
        this.distanceCovered = distanceCovered;
    }

    public double getAvailableFuel() {

        return availableFuel;


    }

    public void setAvailableFuel(double availableFuel) {
        this.availableFuel = (Math.round(availableFuel * 10.0) / 10.0);
    }


    public double getDistanceToEmpty() {
        return distanceToEmpty;
    }

    public void setDistanceToEmpty(double distanceToEmpty) {
        this.distanceToEmpty = distanceToEmpty;
    }


    public void isValidAmountOfFuel(float fuelAmount) throws Exception {
        if (fuelAmount + availableFuel > capacity) {
            throw new Exception("Beyond the capacity");
        } else {
            availableFuel += fuelAmount;
            setAvailableFuel(availableFuel);
            setDistanceToEmpty(average * availableFuel);
        }
    }








    public double driveCar(float distanceToTravel) throws Exception {

        setDistanceToEmpty(availableFuel*average);

        if(distanceToTravel>=getDistanceToEmpty()) {
                     throw  new Exception("Cannot cover Distance as fuel is low..");
        }
        availableFuel-=distanceToTravel/average;
        setAvailableFuel(availableFuel);
        distanceToEmpty-=distanceToTravel;

        return  availableFuel;
    }

}








