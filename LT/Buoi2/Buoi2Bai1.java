package hiu.ltjava.com;

import java.util.Scanner;

public class Buoi2Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap n: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for (int i=0; i<n; i++ )
		{
			System.out.print("a["+ i + "] = ");
			a[i]= sc.nextInt();
		}
	}
}