package task6.Bai2_Fraction;

import java.util.Scanner;

public class Fraction {
    //Khai báo thuộc tính có phạm vi truy cập là private
    private int tuSo;
    private int mauSo;

    public Fraction() {
    }
    public Fraction(int tuSo, int maSo) {
        this.tuSo = tuSo;
        this.mauSo = maSo;
    }

    public int getTuSo() {
        return tuSo;
    }
    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }
    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }


    public int timUSCLṆ̣̣̣(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); //Trả về giá trị tuyệt đối của a đảm bảo kết quả luôn là số dương
    }

    //Hàm tối giản phân số chia cả tử và mẫu có ước số lớn nhất x
    public void toiGianPhanSo() {
        int x = timUSCLṆ̣̣̣(this.getTuSo(), this.getMauSo());
        this.setTuSo((this.getTuSo()/x));
        this.setMauSo((this.getMauSo()/x));

        //Nếu mẫu số < 0 ta đổi dấu cả tử và mẫu để mẫu số luôn dương
        if (this.mauSo < 0) {
            this.mauSo *= -1;
            this.tuSo *= -1;
        }
    }

    public void add(Fraction ps) {
        int ts = this.getTuSo() * ps.getMauSo() + ps.getTuSo() * this.getMauSo();
        int ms = this.getMauSo() * ps.getMauSo();
        Fraction tong = new Fraction(ts, ms);
        tong.toiGianPhanSo();
        System.out.println("Tổng 2 phân số = " + tong.getTuSo() + "/" + tong.getMauSo());
    }

    public void subtract(Fraction ps) {
        int ts = this.getTuSo() * ps.getMauSo() - ps.getTuSo() * this.getMauSo();
        int ms = this.getMauSo() * ps.getMauSo();
        Fraction hieu = new Fraction(ts, ms);
        hieu.toiGianPhanSo();
        System.out.println("Hiệu 2 phân số = " + hieu.getTuSo() + "/" + hieu.getMauSo());
    }

    public void multiply(Fraction ps) {
        int ts = this.getTuSo() * ps.getTuSo();
        int ms = this.getMauSo() * ps.getMauSo();
        Fraction tong = new Fraction(ts, ms);
        tong.toiGianPhanSo();
        System.out.println("Tích 2 phân số = " + tong.getTuSo() + "/" + tong.getMauSo());
    }

    public void divide(Fraction ps) {
        int ts = this.getTuSo() * ps.getMauSo();
        int ms = this.getMauSo() * ps.getTuSo();
        Fraction tong = new Fraction(ts, ms);
        tong.toiGianPhanSo();
        System.out.println("Thương 2 phân số = " + tong.getTuSo() + "/" + tong.getMauSo());
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tử sô: ");
        this.setTuSo(sc.nextInt());
        System.out.print("Nhập mẫu số: ");
        this.setMauSo(sc.nextInt());
    }
}
