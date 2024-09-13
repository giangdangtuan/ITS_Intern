package task3;

import java.util.Scanner;

public class Bai2_DemSoLanXuatHien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chuoi;
        char a;
        int count = 0;

        System.out.print("Nhập chuỗi: ");
        chuoi = sc.nextLine();
        System.out.print("Nhập ký tự cần đếm: ");
        a = sc.next().charAt(0);

        //Duyệt từng chữ cái trong chuỗi cho đến hết nếu tìm thấy chữa cái a thì biến count +1
        for(int i = 0; i< chuoi.length(); i++){
            if(chuoi.charAt(i) == a){
                count++;
            }
        }

        System.out.println("Số lần xuất hiện của ký tự "+ a + " trong chuỗi " + chuoi + "  là: " + count);
    }
}
