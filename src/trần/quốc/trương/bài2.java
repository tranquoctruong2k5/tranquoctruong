
package trần.quốc.trương;

import java.util.Scanner;

public class bài2 {
     public static void main(String[] args) {
     Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Nhap ten: ");
        String n1 = keyboard.nextLine();
        
        System.out.println("Nhap tuổi: ");
        int n2 = keyboard.nextInt();
        
        System.out.println("Nhap năm sinh: ");
        int n3 = keyboard.nextInt();
        keyboard.nextLine();
        
        
        System.out.println(" Nhập giới tính: ");
        String n4 = keyboard.nextLine();
        
        System.out.println("Nhập chuyên ngành: ");
        String n5 = keyboard.nextLine();
        
        System.out.println("Nhập GPA: ");
        double n6 = keyboard.nextDouble();
        keyboard.nextLine();
        
        System.out.println("Nhập quê quán: ");
        String n7 = keyboard.nextLine();
        
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);
        System.out.println(n7);
     }
    
}
