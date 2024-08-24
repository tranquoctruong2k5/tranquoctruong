
package trần.quốc.trương;

import java.util.Scanner;

public class bài1 {
     public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so dau tien: ");
        a = scanner.nextInt();
          System.out.println("nhap vao so thu hai: ");
        b = scanner.nextInt();
        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        int thuong = a / b;
        int sodu = a % b;
        System.out.println("ket qua cua phep cong: "+tong);
        System.out.println("ket qua cua phep tru: "+hieu);
        System.out.println("ket qua cua phep nhan: "+tich);
        System.out.println("ket qua cua phep chia: "+thuong);
        System.out.println("ket qua cua phep tinh so du: "+sodu);
     }
}
