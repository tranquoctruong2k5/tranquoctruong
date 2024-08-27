
package trần.quốc.trương;

import java.util.Scanner;

public class buổi5_2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum = 0;
        int number =1;
        while (number !=0) {
            System.out.print("enter a number (0 to quit): ");
            number = console.nextInt();
            sum = sum + number;
        }
         System.out.println("the total is: "+sum);
    }
    
}
