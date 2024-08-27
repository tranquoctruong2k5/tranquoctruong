package trần.quốc.trương;

import java.util.Random;
import java.util.Scanner;

public class baitapvenha_homework {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int pr = 0;
        int so = 0;
        while (so < 3) {
            int num = random.nextInt(4) + 2;
            int[] add = new int[num];
            for (int i = 0; i < num; i++) {
                add[i] = random.nextInt(30) + 1;
            }
            System.out.print(add[0]);
            for (int i = 1; i < num; i++) {
                System.out.print(" + " + add[i]);
            }
            System.out.print(" = ");
            int user = scanner.nextInt();
            int Answer = 0;
            for (int i = 0; i < add.length; i++) {
                Answer += add[i];
            }
            if (user == Answer) {
                System.out.println("Correct!");
                int points = 0;
                points++;
            } else {
                System.out.println("Wrong!answer " + Answer);
                so++;
            }
        }

        System.out.println("You earned " + pr + " total points.");
    }
}
