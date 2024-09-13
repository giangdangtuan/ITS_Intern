package task4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai2_HashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Map đc sử dụng để lưu và truy xuất dữ liệu theo cặp <key,value>
        //Khởi tạo 1 đối tượng HashMap cá key là kiểu số nguyên và value là chuỗi
        Map<Integer, String> map = new HashMap<Integer, String>();
        int maKH, choose;
        String tenKH;
        do {
            System.out.println("1. Thêm khách hàng");
            System.out.println("2. Tìm kiếm khách hàng");
            System.out.println("0. Thoát");
            System.out.println("Nhập lựa chọn: ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("Nhập mã khách hàng: ");
                    maKH = sc.nextInt();
                    System.out.print("Nhập tên khách hàng: ");
                    tenKH = sc.next();
                    map.put(maKH, tenKH); //Hàm thêm phần tử vào map có key là maKH và value là tenKH
                    break;
                case 2:
                    System.out.print("Nhập mã khách cần tìm: ");
                    maKH = sc.nextInt();
                    System.out.println("Tên khách hàng cần tìm: "+map.get(maKH));//Hàm get để lấy giá trị value của phần tử có key là maKH
                    break;
                case 0:
                    break;
            }
        }while (choose != 0);
    }
}
