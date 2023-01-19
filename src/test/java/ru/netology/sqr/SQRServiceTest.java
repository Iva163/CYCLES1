package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    void shouldCalcInsideRange() {
        SQRService service = new SQRService();
        int excpected = 3;
        int actual = service.calcAmtSqrtInRange(200, 300);
        Assertions.assertEquals(excpected, actual);
    }

    @Test
    void shouldCalcExtremeRange() {
        SQRService service = new SQRService();
        int excpected = 90;
        int actual = service.calcAmtSqrtInRange(100, 9801);
        Assertions.assertEquals(excpected, actual);
    }

    @Test
    void shouldCalcOutRange() {
        SQRService service = new SQRService();
        int excpected = 90;
        int actual = service.calcAmtSqrtInRange(0, 10_000);
        Assertions.assertEquals(excpected, actual);
    }

    @Test
    void shouldCalcOutStartRange() {
        SQRService service = new SQRService();
        int excpected = 0;
        int actual = service.calcAmtSqrtInRange(0, 99);
        Assertions.assertEquals(excpected, actual);
    }

    @Test
    void shouldCalcOutEndRange() {
        SQRService service = new SQRService();
        int excpected = 0;
        int actual = service.calcAmtSqrtInRange(9802, 10_000);
        Assertions.assertEquals(excpected, actual);
    }


}
