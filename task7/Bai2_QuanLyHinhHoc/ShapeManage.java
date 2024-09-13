package task7.Bai2_QuanLyHinhHoc;

import java.util.Scanner;

//Lớp trừu tượng interface Shape
interface Shape {
    //Các phương thức
    public void calculateArea();
    public void input();
}

//Lớp Circle kế thừa các phương thức lớp Shape
class Circle implements Shape {
    private double banKinh;

    public Circle() {
    }

    public Circle(double banKinh) {
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    //Ghi đè phương thức calculateArea() của lớp Shape
    @Override
    public void calculateArea() {
        System.out.println("Diện tích hình tròn = " +(this.banKinh * this.banKinh * Math.PI));
    }

    //Ghi đè phương thước input() của lớp Shape
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính hình tròn: ");
        this.banKinh = sc.nextDouble();
    }
}

class Rectangle  implements Shape {
    private double chieuDai;
    private double chieuRong;

    public Rectangle() {
    }

    public Rectangle(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    //Ghi đè phương thức calculateArea() của lớp Shape
    @Override
    public void calculateArea() {
        System.out.println("Diện tích hình chữ nhật = " +(this.chieuDai * this.chieuRong));
    }

    //Ghi đè phương thước input() của lớp Shape
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài hình chữ nhật: ");
        this.chieuDai = sc.nextDouble();
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        this.chieuRong = sc.nextDouble();
    }
}

public class ShapeManage {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.input();
        circle.calculateArea();

        Rectangle rectangle = new Rectangle();
        rectangle.input();
        rectangle.calculateArea();
    }
}
