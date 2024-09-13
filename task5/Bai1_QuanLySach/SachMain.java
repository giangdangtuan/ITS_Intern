package task5.Bai1_QuanLySach;

import java.util.Scanner;

public class SachMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sach s = new Sach();
        int choose;

        do {
            System.out.println("1. Thêm sách và lưu vào file");
            System.out.println("2. Đọc file");
            System.out.println("3. Xóa file");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            choose = sc.nextInt();

            switch (choose) {
                case 1:
                    s.input();
                    s.luuSachVaoFile(s);
                    break;
                case 2:
                    s.docFileSach();
                    break;
                case 3:
                    s.xoaFileSach();
                    break;
                case 0:
                    break;
            }
        } while (choose != 0);
    }
}
