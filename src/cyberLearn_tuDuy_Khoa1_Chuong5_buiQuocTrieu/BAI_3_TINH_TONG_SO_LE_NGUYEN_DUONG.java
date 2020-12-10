package cyberLearn_tuDuy_Khoa1_Chuong5_buiQuocTrieu;

import java.util.Scanner;

public class tinhTongSoLeNguyenDuong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		Scanner scan = new Scanner(System.in);

		int n;
		do {
			System.out.println("Nhap vao so n:");
			n = Integer.parseInt(scan.nextLine());

		} while (n <= 0);
		sum = tinhTongSoLeDuong(n);
	}

	public static int tinhTongSoLeDuong(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i = i + 2) {
			if (i % 2 != 0) {
				sum = sum + i;
			}
		}
		System.out.println("Tong cac so le nguyen duong la: " + sum);
		return sum;

	}

}

//1.tao var sum = 0
//2. tao bien tam thoi a = i%2
//2. tao var n
//3. ham input N
//do {
//	ham nhap
//	
//}while (n < 0)
//
//	
//4. ham tinh tong so le
//
//
//for( int i = 1; i <= n; i=i+2) {
//	if (i%2 != 0) {
//		sum = sum + i;
//	}
