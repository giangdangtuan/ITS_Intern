package task3;

import java.util.Scanner;

public class Bai1_SapXepMang {

    //Hàm sắp xếp nổi bọt
    public static double[] sapXep(double[] arr) {
        double temp;
        int n = arr.length;
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - 1 - i; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        double x;
        System.out.println("Nhập số lượng phần tử mảng: ");
        n = sc.nextInt();

        //Khai báo mảng arr kiểu số thực có n phần tử
        double[] arr = new double[n];
        //Nhập dữ liệu cho từng phần tử mảng arr
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i+1) + ": ");
            x = sc.nextDouble();
            arr[i] = x;
        }
        System.out.print("Mảng trước khi sắp xếp là:");

        //foreach duyệt từng phần tử của mảng cho đến hết
        for(double num : arr) {
            System.out.print(" " + num);
        }
        //Gọi hàm sắp xếp nổi bọt
        sapXep(arr);
        System.out.println();
        System.out.print("Mảng trước khi sắp xếp là:");
        for(double num : arr) {
            System.out.print(" " + num);
        }
        sc.close();
    }
}
