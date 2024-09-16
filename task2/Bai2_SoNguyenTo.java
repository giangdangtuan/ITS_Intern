package task2;

import java.util.Scanner;

public class Bai2_SoNguyenTo {
    public static boolean KTSNT(int n) {
      if(n<2){
          return false;
      }
      for(int i=2 ;i <= Math.sqrt(n)/2;i++){
          if(n%i==0){
              return false;
          }
      }
      return true;
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap N: ");
        n = sc.nextInt();
        if(KTSNT(n)){
            System.out.println("N là số nguyên tố !");
        } else{
            System.out.println("N không phải số nguyên tố !");
        }
    }
}
