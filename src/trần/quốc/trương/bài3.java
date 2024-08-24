
package trần.quốc.trương;

import java.util.Scanner;

public class bài3 {
     public static void main(String[] args) {
        
          Scanner scanner = new Scanner(System.in);

        System.out.print("mời nhập ký tự hoặc chuỗi ký tự: ");
        if (scanner.hasNext()) {
            String input = scanner.next();
            if (input.length() == 1) {
                System.out.println("Đây là một ký tự.");
            } else {
                System.out.println("Đây là một chuỗi ký tự.");
            }
        } else {
            System.out.println("Không có dữ liệu nào được nhập cả ");
        }
     }
}
