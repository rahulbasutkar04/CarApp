package org.amaap.carapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the capacity of the fuel tank:");
        float capacity=sc.nextFloat();
        System.out.println("Enter the Average Speed of the car:");
        float average=sc.nextFloat();

        Car car=new Car(capacity,average);
         int choice=0;
        while (choice != 5) {
            System.out.println("Enter your choice:");
            System.out.println("1. Check current fuel");
            System.out.println("2. Fill tank");
            System.out.println("3. Drive car");
            System.out.println("4. Check distance to empty");
            System.out.println("5. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current fuel in the car is: " + car.getAvailableFuel()+" LTR");
                    break;
                case 2:
                    System.out.println("Enter the amount of litres to fill the tank:");
                    try {
                        float fuelInput = sc.nextFloat();
                        car.isValidAmountOfFuel(fuelInput);
                    }
                    catch (Exception e)
                    {
                        System.out.println("Invalid fuel ...Please enter the fuel amount beyond the give capacity..");

                    }
                    break;
                case 3:
                    System.out.println("Enter the distance to travel in KM:");
                    float distance = sc.nextFloat();
                    car.driveCar(distance);
                    break;
                case 4:
                    System.out.println("Distance to Empty is: " + car.getDistanceToEmpty()+" KM");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Please enter a valid choice..");
            }
        }






    }
}