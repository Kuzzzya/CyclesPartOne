package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class SQRServiceTest {

    @Test
    void howManySquareInFourHundred() {
        SQRService service = new SQRService();
        int expected = 13;
        int actual = service.square(100, 500);
        assertEquals(expected, actual);
        System.out.println(actual);
    }

    @Test
    void howManySquareInOneHundred() {
        SQRService service = new SQRService();
        int expected = 3;
        int actual = service.square(200, 300);
        assertEquals(expected, actual);
        System.out.println(actual);
    }
}