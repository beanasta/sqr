package ru.netology.sqr;


public class SQRService {


    public int calcSQR(int rangeStart, int rangeEnd) {


        int sqr = 0;

        for (int i = 10; i < 99; i++) {
            if (i * i >= rangeStart) {
                sqr++;


                if (i * i > rangeEnd) {
                    return sqr - 1;

                }
            }
        }

        return sqr;
    }
}
