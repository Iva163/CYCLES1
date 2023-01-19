package ru.netology.sqr;

public class SQRService {
    public int calcSqrtInRange(int rStart, int rEnd) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= rStart & i * i <= rEnd) {
                count++;
            }
        }
        return count;
    }
}
