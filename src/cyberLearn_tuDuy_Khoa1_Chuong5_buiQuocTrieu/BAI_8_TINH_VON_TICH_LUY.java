package cyberLearn_tuDuy_Khoa1_Chuong5_buiQuocTrieu;

import java.util.Scanner;

public class bai8_tinhVonTichLuy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nhap lai suat:");
		float r = Float.parseFloat(scan.nextLine());
		System.out.println("Nhap tien von:");
		float p = Float.parseFloat(scan.nextLine());
		System.out.println("Nhap thoi han:");
		float n = Float.parseFloat(scan.nextLine());
		
		System.out.println("Von ban dau: " + p);
		System.out.println("Thoi han: " + n);
		System.out.println("Lai suat: " + r);
		inVonTichLuy(r, p, n);
		
	}
	
	public static float tinhVonTichLuy(float r, float p, int i) {
		
		float a = (float) (p*Math.pow((1+r), i));
		
		return a;	
	}
	
	public static void inVonTichLuy (float r, float p, float n) {

		System.out.println("Nam \t\t\t Von");
		for (int i = 1; i <= n ; i++) {
			float a = tinhVonTichLuy(r, p, i);
			System.out.println(i + "\t\t\t" + a);
		}
	}
	
	
}
//1. nhap lai suat (r)
//2. nhap tien von (p)
//3. nhap thoi han (n)
//4. Ham tinh von tich luy
//a = p*(1+r)n
//
//output
//tienVon
//thoi han
//
//nam - von tich luy (a)

