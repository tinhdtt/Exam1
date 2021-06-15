import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        StringChecking sc = new StringChecking();
//        sc.CountUpperCase();
//        sc.UpperAll("You Only Live Once. But if You do it right. once is Enough");
//        sc.UpperAfterPoint("You Only Live Once. But if You do it right. once is Enough");
        CheckMonth cm = new CheckMonth();
        cm.InputNumber();
        ////
        System.out.println("Nhập vào mật khẩu: ");
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        PasswordCheck pc = new PasswordCheck();
        if (pc.isValid(password)) {
            System.out.println("Mật khẩu hợp lệ");
        } else {
            System.out.println("Mật khẩu không hợp lệ");
        }
    }
}
