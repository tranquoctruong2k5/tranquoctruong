package trần.quốc.trương;

import java.util.Random;

public class buổi5_4 {
    public static void main(String[] args) {
        Random rd = new Random();
        int r = rd.nextInt(3);
        if (r==0) {
            System.out.println("rpck");
        } else if (r == 1) {
            System.out.println("paper");
        } else {
            System.out.println("scissora");
        }
    }
    
}
