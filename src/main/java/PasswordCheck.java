import java.util.Scanner;

public class PasswordCheck {

    public boolean isValid(String password) {
        if (password.length() <= 10) {
            System.out.println("Mật khẩu yếu. Mật khẩu phải có từ 10 ký tự trở lên");
            return false;
        }

        if (password.contains(" ")) {
            System.out.println("Mật khẩu không được chứa kí tự space");
            return false;
        }

        if (!checkDigitsChar(password)) {
            System.out.println("Mật khẩu chưa đủ mạnh. Mật khẩu phải chứa ít nhất 1 chữ số");
            return false;
        }

        if (!checkSpecialChar(password)) {
            System.out.println("Mật khẩu chưa đủ mạnh. Mật khẩu phải chứa ít nhất 1 kí tự đặc biệt");
            return false;
        }

        if (!checkCapsChar(password)) {
            System.out.println("Mật khẩu chưa đủ mạnh. Mật khẩu phải chứa ít nhất 1 kí tự viết hoa");
            return false;
        }

        if (!checkSmallLetter(password)) {
            System.out.println("Mật khẩu chưa đủ mạnh. Mật khẩu phải chứa ít nhất 1 kí tự viết thường");
            return false;
        }

        return true;
    }

    public boolean checkSpecialChar(String password) {
        if ((password.contains("@") || password.contains("#")
                || password.contains("!") || password.contains("~")
                || password.contains("$") || password.contains("%")
                || password.contains("^") || password.contains("&")
                || password.contains("*") || password.contains("(")
                || password.contains(")") || password.contains("-")
                || password.contains("+") || password.contains("/")
                || password.contains(":") || password.contains(".")
                || password.contains(", ") || password.contains("<")
                || password.contains(">") || password.contains("?")
                || password.contains("|"))) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkCapsChar(String password) {
        int count = 0;
        for (int i = 65; i <= 90; i++) {
            char c = (char) i;
            String str1 = Character.toString(c);
            if (password.contains(str1)) {
                count = 1;
            }
        }
        if (count == 0) {
            return false;
        }
        return true;
    }

    public boolean checkDigitsChar(String password) {
        int count = 0;
        for (int i = 0; i <= 9; i++) {
            String str1 = Integer.toString(i);
            if (password.contains(str1)) {
                count = 1;
            }
        }
        if (count == 0) {
            return false;
        }
        return true;
    }

    public boolean checkSmallLetter(String password) {
        int count = 0;
        for (int i = 90; i <= 122; i++) {
            char c = (char) i;
            String str1 = Character.toString(c);

            if (password.contains(str1)) {
                count = 1;
            }
        }
        if (count == 0) {
            return false;
        }
        return true;
    }
}
