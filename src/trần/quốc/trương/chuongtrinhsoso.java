package trần.quốc.trương;

import java.util.Random;

public class chuongtrinhsoso {

    public static void main(String[] args) {
        Random rd = new Random();
        int r = rd.nextInt(100) + 1;
        System.out.println("con so trung thuong la :" + r);
    }
}
