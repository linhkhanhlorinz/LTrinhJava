public class Bai4_Buoi4 {

    public static boolean laNguyenTo(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {

        int[] m = {3, 6, 7, 8, 11, 17, 2, 90, 2, 5, 4, 5, 8};

        int demLe = 0;
        int demChan = 0;

        System.out.print("Dong 1 - Cac so le: ");
        for (int x : m) {
            if (x % 2 != 0) {
                System.out.print(x + " ");
                demLe++;
            }
        }
        System.out.println("=> " + demLe + " so le");

        System.out.print("Dong 2 - Cac so chan: ");
        for (int x : m) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
                demChan++;
            }
        }
        System.out.println("=> " + demChan + " so chan");

        System.out.print("Dong 3 - Cac so nguyen to: ");
        for (int x : m) {
            if (laNguyenTo(x)) {
                System.out.print(x + " ");
            }
        }

        System.out.print("\nDong 4 - Cac so khong phai nguyen to: ");
        for (int x : m) {
            if (!laNguyenTo(x)) {
                System.out.print(x + " ");
            }
        }
    }
}