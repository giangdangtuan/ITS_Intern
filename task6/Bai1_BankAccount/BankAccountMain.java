package task6.Bai1_BankAccount;

import java.util.ArrayList;
import java.util.Scanner;

public class BankAccountMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Khởi tạo 1 đối tượng ArrayList cos kiểu dữ liệu là BankAccount
        ArrayList<BankAccount> dsAccount = new ArrayList<>();
        BankAccount ba = new BankAccount();
        int choose;
        String stk;
        do{
            System.out.println("1. Thêm tài khoản");
            System.out.println("2. Gửi tiền qua stk");
            System.out.println("3. Rút tiền qua stk");
            System.out.println("4. Kiểm tra số dư qua stk");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            choose = sc.nextInt();
            sc.nextLine();
            boolean check = false;
            int index = -1;
            double soTienGui = 0, soTienRut = 0;
            switch(choose){
                case 1:
                    System.out.print("Nhập stk muốn thêm: ");
                    stk = sc.nextLine();
                    //Duyệt từng phần tử trong dsAccount nếu tồn tại stk vừa nhập
                    //thì biến check = true và thoát khỏi vòng lặp
                    for(BankAccount b : dsAccount){
                        if(b.getAccountNumber().equals(stk)){
                            check = true;
                            break;
                        }
                    }
                    //Kiểm tra stk đã tồn tại chưa nếu chưa thì thêm tài khoản vào ArrayList
                    if(!check){
                        ba.setAccountNumber(stk);
                        ba.setBalance(0);
                        dsAccount.add(ba);
                        System.out.println("Thêm tài khoản thành công !");
                    } else{
                        System.out.println("Tài khoản đã tồn tại");
                    }
                    break;
                case 2:
                    System.out.print("Nhập stk muốn gửi tiền: ");
                    stk = sc.nextLine();
                    //Duyệt từng phần tử trong dsAccount nếu tồn tại stk vừa nhập
                    //thì biến check = true, gán index phần tử đó vào biến index
                    // và thoát khỏi vòng lặp
                    for(BankAccount b : dsAccount){
                        if(b.getAccountNumber().equals(stk)){
                            check = true;
                            index = dsAccount.indexOf(b);
                            break;
                        }
                    }
                    //Kiểm tra có tồn tại stk vừa nhập ko nếu có thì thực hiện khối else
                    // ko có thì thực hiện khối if
                    if(!check){
                        System.out.println("Không tìm thấy tài khoản !");
                    } else{
                        System.out.println("Số dư tài khoản " + stk + ": " + dsAccount.get(index).getBalance());
                        System.out.print("Nhập số tiền muốn gửi: ");
                        soTienGui = sc.nextDouble();
                        dsAccount.get(index).deposit(soTienGui); //Gọi hàm deposit của lớp BankAccount để thực hiện gửi tiền
                        System.out.println("Gửi tiền thành công, số dư tài khoản: " + dsAccount.get(index).getBalance());
                    }
                    break;
                case 3:
                    //Thực hiện gần giống case 2
                    System.out.print("Nhập stk muốn rút tiền: ");
                    stk = sc.nextLine();
                    for(BankAccount b : dsAccount){
                        if(b.getAccountNumber().equals(stk)){
                            check = true;
                            index = dsAccount.indexOf(b);
                            break;
                        }
                    }
                    if(!check){
                        System.out.println("Không tìm thấy tài khoản !");
                    } else{
                        System.out.println("Số dư tài khoản " + stk + ": " + dsAccount.get(index).getBalance());
                        System.out.print("Nhập số tiền muốn rút: ");
                        soTienGui = sc.nextDouble();
                        dsAccount.get(index).withdraw(soTienGui);
                        System.out.println("Rút tiền thành công, số dư tài khoản: " + dsAccount.get(index).getBalance());
                    }
                    break;
                case 4:
                    System.out.print("Nhập stk muốn kiểm tra: ");
                    stk = sc.nextLine();
                    for(BankAccount b : dsAccount){
                        if(b.getAccountNumber().equals(stk)){
                            check = true;
                            index = dsAccount.indexOf(b);
                            break;
                        }
                    }
                    if(!check){
                        System.out.println("Không tìm thấy tài khoản !");
                    } else{
                        System.out.println("Số dư tài khoản " + stk + ": " + dsAccount.get(index).getBalance());
                    }
                    break;
            }
        } while(choose != 0);
    }
}
