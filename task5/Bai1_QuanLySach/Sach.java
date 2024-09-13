package task5.Bai1_QuanLySach;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Sach {

    // Khai báo các thuộc tính private: chỉ truy cập được trong lớp, ngoài lớp phải dùng các hàm getter, setter
    private String tenSach;
    private String tacGia;
    private int namSanXuat;

    //Các hàm constructor: hàm khởi tạo đối tượng
    public Sach() {
    }

    public Sach(String tenSach, String tacGia, int namSanXuat) {
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.namSanXuat = namSanXuat;
    }

    //Các hàm getter: lấy giá trị thuộc tính, hàm setter: cập nhật giá trị thuộc tính
    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String ghiFile() {
        return tenSach + ", " + tacGia + ", " + namSanXuat;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ten sach: ");
        this.tenSach = sc.nextLine();
        System.out.print("Tac gia: ");
        this.tacGia = sc.nextLine();
        System.out.print("Nam san: ");
        this.namSanXuat = sc.nextInt();
    }

    public void luuSachVaoFile(Sach s) {
        //Lớp FileWriter được sử dụng để lưu dữ liệu vào file
        //Khởi tạo đối tượng FileWriter có filename là dsSach.txt đc lưu vào thư mục cùng project
        //tham số true để thêm dữ liệu mới vào cuối file chứ không ghi đè
        try (FileWriter fw = new FileWriter("dsSach.txt",true)) {
            fw.write(this.ghiFile() + "\n"); //Hàm write dùng để ghi/lưu dữ liêuj vào file
            System.out.println("Lưu sách thành công");
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi lưu thông tin sách: " + e.getMessage());
        }
    }

    public void docFileSach() {
        try {
            //Lớp FileReader đc sử dụng để đọc dữ liệu từ file
            //Khởi tạo đối tượng FileReader có filename cần đọc là dsSach.txt
            FileReader fr= new FileReader("dsSach.txt");
            int i;
            //Sử dunjg vòng lặp để đọc từng ký tự của file đến hết
            while ((i = fr.read()) != -1) {
                //Ép kiểu i về kiểu ký tự
                System.out.print((char) i);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi đọc file sách: " + e.getMessage());
        }
    }

    public void xoaFileSach(){
        File dsSach = new File("dsSach.txt");
        if (dsSach.delete()) {
            System.out.println("Xóa file: " + dsSach.getName() + " thành công");
        } else {
            System.out.println("Xóa file thất bại");
        }
    }
}
