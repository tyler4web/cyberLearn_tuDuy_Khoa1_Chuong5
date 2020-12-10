package cyberLearn_tuDuy_Khoa1_Chuong5_buiQuocTrieu;

import java.util.Scanner;

public class bai4_tinhTongTich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int n;
		int x;
		do {
			System.out.println("Nhap vao so n:");
			System.out.println(" biet tong = x + x^2 + x^3 +... + x^n");
			n = Integer.parseInt(scan.nextLine());
			
			
			
			System.out.println("Nhap vao so x:");
			x = Integer.parseInt(scan.nextLine());

		} while (n <= 0);
		
		int tong = tinhTongMu(n, x);
		System.out.println("Tong la: " + tong);
	}

	
	public static int tinhTongMu (int n, int x) {
		int tong = 0;
		int multi = x;
		for (int i = 1; i <= n; i++) {
			tong = tong + multi;
			System.out.print(tong);
			System.out.print(" ");
			multi = multi *x;
		}
		return tong;
		
	}
	
}

	
//1. cho nguoi dung nhap n
//
//cho i chay toi n
//sum = sum + sum^i
//}
