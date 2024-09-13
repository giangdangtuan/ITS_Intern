package task5.Bai2;

import java.util.Scanner;

public class Bai2_SoNguyenNgoaiLe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        while(true) {
            System.out.print("Nhập số nguyên: ");
            //Xử lý ngoại lệ bằng try-catch
            //Khi chương trình chạy khối try bị lỗi chương trình sẽ chạy khối catch và chương trình vẫn chạy tiếp không bị dừng lại
            //còn nếu khối try ko lỗi sẽ ko chạy khối catch
            try{
                num = sc.nextInt();
                break;
            } catch (Exception e){
                System.out.println("Phải nhập đúng kiểu số nguyên !");
                sc.next();
            }
        }
        sc.close();
    }
}
