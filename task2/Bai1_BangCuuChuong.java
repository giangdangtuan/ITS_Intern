package task2;

public class Bai1_BangCuuChuong {
    public static void main(String[] args) {
        for(int i = 1; i <11; i++) {
            System.out.print("Bang cuu chuong " + i + ":");
            for(int j = 1; j <11; j++) {
                System.out.printf("%d x  %d = %d, ",i,j,i*j);
            }
            System.out.println();
        }
    }
}
