package task4;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1_ArrayList {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //ArrayList là 1 mảng động có thể thay đổi kích thước khi chạy
        //Khởi tạo 1 ArrayList chứa các đối tượng kiểu String (tên sách)
        ArrayList<String> books = new ArrayList<>();
        int n, choose, index = 0;
        String bookName, newBookName;
        boolean check = false;

        do{
            System.out.println("1. Thêm sách");
            System.out.println("2. Sửa tên sách");
            System.out.println("3. Xóa sách");
            System.out.println("4. Tìm kiếm sách");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    System.out.print("Nhập số lượng sách muốn thêm: ");
                    n = sc.nextInt();
                    sc.nextLine();
                    for(int i = 0; i < n; i++) {
                        System.out.print("Nhập tên sách thứ " + (i+1) + ":");
                        bookName = sc.nextLine();
                        books.add(bookName); //Hàm add() dùng để thêm phần tử vào cuối ArrayList
                    }
                    System.out.println("Thêm thành công " + n + " sách");
                    break;
                case 2:
                    System.out.print("Nhập tên sách muốn sửa: ");
                    bookName = sc.nextLine();
                    for(int i = 0; i < books.size(); i++) {
                        if(bookName.equals(books.get(i))) {
                            check = true;
                            index = i;
                        }
                    }
                    if(check) {
                        System.out.print("Nhập tên sách mới: ");
                        newBookName = sc.nextLine();
                        books.set(index, newBookName); //Hàm set ddùng để thay thế phần tử ở vị trí index với phần tử đc chỉ định (newBookName)
                        System.out.println("Sửa thành công !");
                    } else {
                        System.out.println("Không tìm thấy sách !");
                    }
                    break;
                case 3:
                    System.out.println("Nhập tên sách cần xóa: ");
                    bookName = sc.nextLine();
                    for(int i = 0; i < books.size(); i++) {
                        if(bookName.equals(books.get(i))) {
                            check = true;
                            index = i;
                        }
                    }
                    if(check) {
                        books.remove(index); //Hàm remove dùng để xóa phần tử ở vị trí index trong ArrayList
                        System.out.println("Xóa thành công !");
                    } else {
                        System.out.println("Không tìm thấy sách !");
                    }
                    break;
                case 4:
                    System.out.print("Nhập tên sách cần tìm: ");
                    bookName = sc.nextLine();
                    for(int i = 0; i < books.size(); i++) {
                        if(bookName.equals(books.get(i))) {
                            check = true;
                        }
                    }
                    if(check) {
                        System.out.println("Tìm thấy sách !");
                    } else {
                        System.out.println("Không tìm thấy sách !");
                    }
                    break;
                case 0:
                    break;
            }
        }while(choose!= 0);
    }
}
