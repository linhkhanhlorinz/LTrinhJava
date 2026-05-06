package hiu.ltjava.com;
import java.util.*;

public class Buoi2GiaiPTbac2 {

    public void GiaiPT(float a, float b, float c) {

        // a=0
        if (a == 0) {

            if (b == 0) {
                if (c == 0)
                    System.out.print("PTVSN");
                else
                    System.out.print("PTVN");
            } 
            else {
                float x = -c / b;
                System.out.print("PT ko phai bac 2. x = " + x);
            }

            return; //!!!!
        }

        // a # 0
        float delta = b * b - 4 * a * c;

        if (delta < 0) {
            System.out.print("PTVN");
        } 
        else if (delta == 0) {
            float x = -b / (2 * a);
            System.out.print("PT nghiem kep: " + x);
        } 
        else {
            float x1, x2;
            x1 = (float)((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float)((-b - Math.sqrt(delta)) / (2 * a));
            System.out.print("PT co 2 nghiem: " + x1 + " va " + x2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("PT co dang: ax^2 + bx + c = 0.\nNhap a: ");
        float a = sc.nextFloat();

        System.out.print("Nhap b: ");
        float b = sc.nextFloat();

        System.out.print("Nhap c: ");
        float c = sc.nextFloat();

        Buoi2GiaiPTbac2 pt = new Buoi2GiaiPTbac2();
        pt.GiaiPT(a, b, c);

        sc.close();
    }
}