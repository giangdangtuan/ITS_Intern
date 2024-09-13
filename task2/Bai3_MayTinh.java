package task2;

import java.util.Scanner;

public class Bai3_MayTinh {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a,b;
        int choose;
        do{
            System.out.println("1. a + b");
            System.out.println("2. a - b");
            System.out.println("3. a * b");
            System.out.println("4. a / b");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn: ");
            choose = sc.nextInt();
            System.out.print("Nhập a: ");
            a = sc.nextDouble();
            System.out.print("Nhập b: ");
            b = sc.nextDouble();
            switch (choose) {
                case 1:
                    System.out.println("a + b = " + (a + b));
                    break;
                case 2:
                    System.out.println("a - b = " + (a - b));
                    break;
                case 3:
                    System.out.println("a * b = " + (a * b));
                    break;
                case 4:
                    if(b==0){
                        System.out.println("Không thực hiện được phép chia cho 0");
                    }else {
                        System.out.println("a / b = " + (a / b));
                    }
                    break;
                case 0:
                    break;
            }
        }while(choose != 0);

    }
}
