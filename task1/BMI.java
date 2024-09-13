package task1;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hight, weight, bmi;
        System.out.println("Nhập chiều cao: ");
        hight = sc.nextDouble();
        System.out.println("Nhập cân nặng: ");
        weight = sc.nextDouble();
        bmi = weight / (hight * hight);
        if(bmi < 18.5) {
            System.out.println("Bạn gầy !");
        }
        else if(bmi >= 18.5 && bmi < 25){
            System.out.println("Bạn bình thường !");
        }
        else if(bmi >= 25 && bmi < 30)
        {
            System.out.println("Bạn thừa cân !");
        }
        else
        {
            System.out.println("Bạn béo phì !");
        }
//            Dưới 18,5 là gầy, từ 25 đến 30,00 là người béo và trên 30 là béo phì
    }
}