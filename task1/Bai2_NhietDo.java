package task1;

import java.util.Scanner; //Lớp dùng để đọc dữ liệu đầu vào

public class Bai2_NhietDo  {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //Tạo 1 đối lượng Scanner tên sc, System.in dùng để lấy dữ liệu đầu vào
        double nhietDo;
        String loaiNhietDo;
        System.out.println("Nhap Nhiet Do: ");
        nhietDo = sc.nextDouble();
        System.out.println("Nhap Loai Nhiet Do: ");
        loaiNhietDo = sc.nextLine();

        // Hàm equals dùng để so sánh 1 chuỗi nếu giống nhau trả về true còn khác nhau thì ngược lại
        // Hàm toLowerCase() dùng để chuyển đổi chữ hoa thành chữ thường
        if("c".equals(loaiNhietDo.toLowerCase())) {
            double nhietDoMoi;
            nhietDoMoi = nhietDo * 9/5 +32;
            System.out.println(nhietDo + " do C = " + nhietDoMoi + " do F");
        }
        if("f".equals(loaiNhietDo.toLowerCase())) {
            double nhietDoMoi;
            nhietDoMoi = (nhietDo - 32) * 5/9;
            System.out.println(nhietDo + " do F = " + nhietDoMoi + " do C");
        }
    }
}
