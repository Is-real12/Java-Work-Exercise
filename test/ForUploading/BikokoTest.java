//package tdd;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class BikokoTest {
//    @Test
//    void automatic() {
//        Bikoko bik = new Bikoko();
//
//        //given that bike is turned off
//        assertEquals(false, bik.getTurnOff());
//
//        //given that bike is turned on
//        assertEquals(true, bik.turnOn());
//
//        // accelerate once
//        // twice
//        // third times
//        // fourth times
//        bik.getGear();
//        assertEquals(2, bik.accelerate(1));
//        assertEquals(4, bik.accelerate(2));
//        assertEquals(6, bik.accelerate(3));
//        assertEquals(8, bik.accelerate(4));
////    if (bik.gear == 1) assertEqual(1, bik.accelerate(1));
////    if (bik.gear == 2) assertEqual(2, bik.accelerate(2));
////    if (bik.gear == 3) assertEqual(3, bik.accelerate(3));
////    if (bik.gear == 4) assertEqual(4, bik.accelerate(4));
//
//
//        // if (bik.gear == 1) assertEqual(0, bik.accelerate(-1));
////    if (bik.gear == 2) assertEqual(1, bik.accelerate(-2));
////    if (bik.gear == 3) assertEqual(2, bik.accelerate(-3));
////    if (bik.gear == 4) assertEqual(3, bik.accelerate(-4));
//
//
//    }
//
//    @Test
//    void decelerate() {
//
//        Bikoko bik = new Bikoko();
//        //decelerate
//        bik.decelerate(0);
//        assertEquals(-1, bik.decelerate(-1));
////        assertEquals(0, bik.decelerate(-2));
////        assertEquals(0, bik.decelerate(-3));
////        assertEquals(0, bik.decelerate(-4));
//    }
//}