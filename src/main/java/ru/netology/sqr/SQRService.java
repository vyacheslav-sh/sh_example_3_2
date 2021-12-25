package ru.netology.sqr;

public class SQRService {
    public int sqrrange(int start, int finish) {
        int numcount = 0;
        for(int num=10; num<=99; num++) {
            int sqrnum = num * num;
            if(sqrnum >= start && sqrnum <= finish) {
                numcount ++;
            }
        }
        return numcount;
    }
}
