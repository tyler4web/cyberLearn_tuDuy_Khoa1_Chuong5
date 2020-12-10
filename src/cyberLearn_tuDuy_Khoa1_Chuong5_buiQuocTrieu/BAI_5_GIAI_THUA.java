package cyberLearn_tuDuy_Khoa1_Chuong5_buiQuocTrieu;

import java.util.Scanner;

public class bai5_giaiThua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Nhap vao so n:");
			System.out.println(" biet tong = x + x^2 + x^3 +... + x^n");
			n = Integer.parseInt(scan.nextLine());

		} while (n <= 0);
		
		int giaiThua = tinhGiaiThua(n);
		
		System.out.println("Ket qua giai thua la: " + giaiThua);
	}
		
		
		
		public static int tinhGiaiThua (int n) {
			int giaiThua = 1;
			if (n == 0 || n ==1) {
			giaiThua =1;
		}
		else {
			for (int i =1; i <=n; i++) {
				giaiThua = giaiThua*i;
			}
			
		}
			return giaiThua;
			
	}
	
//
//1. Ham input n
//2. Bien giaiThua
//2. Phep tinh giai thua
//
//if (n = 0 || n =1) {
//	giaithua =1;
//}
//else {
//	for (int i =1; i <=n; i++) {
//		giaiThua = giaiThua*i;
//	}
//	
//return giaiThua
//}
}
