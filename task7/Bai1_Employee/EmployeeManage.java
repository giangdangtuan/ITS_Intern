package task7.Bai1_Employee;

import java.util.Scanner;

class Employee {
    //khai báo thuộc tính có phạm vi truy cập là private
    //set lương cơ bản mặc đinhj là 25000
    private String maNV;
    private String tenNV;
    private double luongCoBan = 25000;

    //Các constructor
    public Employee() {
    }

    public Employee(String tenNV, String maNV) {
        this.tenNV = tenNV;
        this.maNV = maNV;
    }

    public Employee(String maNV, String tebNV, double luongNV) {
        this.maNV = maNV;
        this.tenNV = tebNV;
        this.luongCoBan = luongNV;
    }

    //Các hàm setter/getter
    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getTenNV() {
        return tenNV;
    }

    public void setTebNV(String tenNV) {
        this.tenNV = tenNV;
    }

    public double getLuongNV() {
        return luongCoBan;
    }

    public void setLuongNV(double luongNV) {
        this.luongCoBan = luongNV;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mã nhân viên: ");
        maNV = sc.nextLine();
        System.out.print("Tên nhân viên: ");
        tenNV = sc.nextLine();
    }

    public void output() {
        System.out.println("Mã nhân viên: " + this.getMaNV());
        System.out.println("Tên nhân viên: " + this.getTenNV());
    }
}

//Lớp FullTimeEmployee kế thừa lớp Employee qua từ khóa extends
class FullTimeEmployee extends Employee {
    public void tinhLuong() {
        this.setLuongNV(this.getLuongNV() * 8 *26);
    }
    public void input() {
        System.out.println("Nhập thông tin nhân viên full time: ");
        super.input(); //Gọi hàm input() của lớp cha Employee
    }
    public void output() {
        super.output(); //Gọi hàm output() của lớp cha Employee
        System.out.println("Lương nhân viên: " + this.getLuongNV());
    }
}

class PartTimeEmployee extends Employee {
    public void tinhLuong() {
        this.setLuongNV(this.getLuongNV() * 4 * 26);
    }
    public void input() {
        System.out.println("Nhập thông tin nhân viên part time: ");
        super.input(); //Gọi hàm input() của lớp cha Employee
    }
    public void output() {
        super.output(); //Gọi hàm output() của lớp cha Employee
        System.out.println("Lương nhân viên: " + this.getLuongNV());
    }
}

public class EmployeeManage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FullTimeEmployee ft = new FullTimeEmployee(); //Gọi hàm khởi tạo kế thừ từ lơps cha
        ft.input();
        ft.tinhLuong();
        ft.output();

        PartTimeEmployee pt = new PartTimeEmployee(); //Gọi hàm khởi tạo kế thừ từ lơps cha
        pt.input();
        pt.tinhLuong();
        pt.output();
    }
}
