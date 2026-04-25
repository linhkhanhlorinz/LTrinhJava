import java.util.Scanner;

public class TestPalindrome {

    public static boolean Panlyndrome(String s) {
        int n = s.length();

        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();

        if (Panlyndrome(s)) {
            System.out.println("Day la chuoi palindrome");
        } else {
            System.out.println("Day khong phai chuoi palindrome");
        }
    }
}