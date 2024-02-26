package org.amapp.caraaptest;

import org.amaap.carapp.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

//    @Test
//    void shouldCreateInstanceOfCarClass()
//    {
//        Car car=new Car();
//
//        assertEquals(true,car instanceof Car);
//    }

    Car car = new Car(30, 12);//capcity ,average
    @Test
    void shouldCreateCarWithItsProperties() {


        assertEquals(30, car.getCapacity());
        assertEquals(12, car.getAverage());


        assertEquals(0, car.getDistanceCovered());


        assertEquals(0, car.getAvailableFuel());


        assertEquals(0, car.getDistanceToEmpty());
    }



   @Test
    void shouldFillThrowErrorIfBeyondfTheCapacity() throws Exception {
//       assertTrue(car.isValidAmountOfFuel(28));

       Exception exception = assertThrows(Exception.class, () -> {
           car.isValidAmountOfFuel(35);
       });

       assertEquals("Beyond the capacity", exception.getMessage());


   }



   @Test
    void shouldUseTheFuelWhileDrivingTheCar() throws Exception {
//        double updatedFuel= car.driveCar(100);
//
//      assertEquals(6.7,updatedFuel);

       Exception exception = assertThrows(Exception.class, () -> {
           car.driveCar(600);
       });

       assertEquals("Cannot cover Distance as fuel is low..", exception.getMessage());

   }

   @Test
    void shouldProvideDistanceToEmpty() throws Exception {
             car.setAvailableFuel(25);
            car.driveCar(60);
           assertEquals(240,car.getDistanceToEmpty());
   }




}
