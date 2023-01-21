package org.launchcode.java.demos.lsn5unittesting.test;

//import org.junit.Test;
//import org.launchcode.java.demos.lsn5unittesting.main.Car;
//
//
//import static org.junit.Assert.*;
//
//public class CarTest {
//
//    public Car test_car;
//
//    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
//    @Test
//    public void testGasTankAfterDriving() {
//        test_car.drive(50);
//        assertEquals(9, test_car.getGasTankLevel(),.001);
//    }
//    //TODO: constructor sets gasTankLevel properly
//
//    //TODO: gasTankLevel is accurate after driving within tank range
//    //TODO: gasTankLevel is accurate after attempting to drive past tank range
//    @Test
//    public void testGasTankAfterExceedingTankRange(){
//        test_car.drive(501);
//        assertEquals(test_car.getGasTankLevel(), 0, .001);
//    }
//    //TODO: can't have more gas than tank size, expect an exception
//    @Test(expected = IllegalArgumentException.class)
//    public void testGasOverfillException() {
//        test_car.addGas(5);
//        fail("Shouldn't get here, car cannot have more gas in tank than the size of the tank");
//    }
//
//}
