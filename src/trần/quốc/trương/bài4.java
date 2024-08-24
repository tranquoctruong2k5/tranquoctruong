
package trần.quốc.trương;

import java.util.Scanner;

public class bài4 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("moi nhap a: ");
        int a = scanner.nextInt();
        System.out.println("moi nhap b: ");
        int b = scanner.nextInt();
        int x;
        if (a!=0)    {
            x=-b/a;
            System.out.println("phuong trinh co nghiem x= "+x);
        }else if (b == 0 && a == 0 ) {
            System.out.println("phuong trinh co vo so nghiem: ");
        }else {
            System.out.println("phuong trinh vo so nghiem: ");
        }
    }
    
}
