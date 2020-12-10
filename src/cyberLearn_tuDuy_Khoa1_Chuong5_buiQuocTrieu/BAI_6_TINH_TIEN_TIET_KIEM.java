package cyberLearn_tuDuy_Khoa1_Chuong5_buiQuocTrieu;

import java.util.Scanner;

public class bai6_tinhTienTietKiem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap vao so tien gui");
		float soTienGui = Float.parseFloat(scan.nextLine());
		System.out.println("Nhap vao so tien muon co");
		float soTienMuonCo = Float.parseFloat(scan.nextLine());
		System.out.println("Nhap vao tien lai tiet kiem theo nam");
		System.out.println("don vi tinh: 1%");
		float tienLaiTietKiem = Float.parseFloat(scan.nextLine());

		float soNamTietKiem = tinhTienLaiTietKiem(soTienGui, soTienMuonCo, tienLaiTietKiem);
		
		System.out.println("So nam tiet kiem: " + soNamTietKiem + "nam");
		
		
		
		
	}

	public static float tinhTienLaiTietKiem(float soTienGui, float soTienMuonCo, float tienLaiTietKiem) {
		float soNamTietKiem;
		
		soNamTietKiem = soTienMuonCo /(soTienGui + soTienGui * tienLaiTietKiem/100);
		
		return soNamTietKiem;
	}
}

	

//1. Ham nhap soTienGui 100
//2. ham nhap soTienMuonCo 1000
//3. ham nhap tienLaiTietKiemNam 7%
//4. tao bien soNam
//5. Ham tinhTienLaiTietKiem
//
//soTienMuonCo = (soTienGui + soTienGui*7%) * soNam
//1000 = (100 + 100*7%) * soNam
//soNam = 1000 /(100 + 100*7%)
//soNam = soTienMuonCo / (soTienGui + soTienGui*7%)
//}
