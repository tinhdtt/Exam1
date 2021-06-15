import java.util.InputMismatchException;
import java.util.Scanner;

public class CheckMonth {
    public void InputNumber() {

        try {
            System.out.print("Nhap vao một số nguyên dương: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if (n == 1 | n == 3 | n == 5 | n == 7 | n == 8 | n == 10 | n == 12) {
                System.out.println("Thang: " + n + " là tháng trong năm và" + " co 31 ngay");
            } else if (n == 2) {
                System.out.println("Thang: " + n + " là tháng trong năm và" + " co 28 hoac 29 ngay");
            } else if (n == 4 | n == 6 | n == 9 | n == 11) {
                System.out.println("Thang: " + n + " là tháng trong năm và" + " co 30 ngay");
            } else {
                System.out.println("Số đó không phải là tháng");
            }
        } catch (NegativeArraySizeException e) {
            System.out.println("Không nhập số âm");
        } catch (InputMismatchException e2) {
            System.out.println("Giá trị nhập vào phải là một sô");
        }

    }

}

