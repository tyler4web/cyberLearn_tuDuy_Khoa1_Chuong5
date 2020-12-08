package cyberLearn_tuDuy_Khoa1_Chuong5_buiQuocTrieu;

import java.util.Scanner;

public class bai1_OanTuXi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int luaChonMay;
		int luaChonNguoi;
		int diemNguoi =0 ;
		int diemMay = 0;
		boolean continueFlag = true;
		
		do {
			luaChonMay = hamLuaChonMay();
			luaChonNguoi = hamLuaChonNguoi(scan);
			if (luaChonNguoi == 0) {
				continueFlag = false;
			} else {
			hamOanTuXi(luaChonNguoi, luaChonMay,diemNguoi, diemMay);
			}
		} while (continueFlag);

	}

	public static int hamLuaChonNguoi(Scanner scan) {
		int luaChonNguoi;

		System.out.println("Vui long chon");
		System.out.println("1. Keo");
		System.out.println("2. Bua");
		System.out.println("3. Bao ");
		System.out.println("0. Dung cuoc choi");

		luaChonNguoi = Integer.parseInt(scan.nextLine());
		return luaChonNguoi;
	}

	public static int hamLuaChonMay() {
		int luaChonMay = (int) (Math.random() * 3 + 1);
		return luaChonMay;
	}

	public static void hamOanTuXi(int luaChonNguoi, int luaChonMay, int diemNguoi, int diemMay) {

		if (luaChonMay == 1 && luaChonNguoi == 2) {
			diemNguoi++;
			System.out.println("Nguoi thang");
		} else if (luaChonMay == 1 && luaChonNguoi == 3) {
			diemMay++;
			System.out.println("May thang");
		} else if (luaChonMay == 2 && luaChonNguoi == 1) {
			diemMay++;
			System.out.println("May thang");
		} else if (luaChonMay == 2 && luaChonNguoi == 3) {
			diemNguoi++;
			System.out.println("Nguoi thang");
		} else if (luaChonMay == 3 && luaChonNguoi == 1) {
			diemNguoi++;
			System.out.println("Nguoi thang");
		} else if (luaChonMay == 3 && luaChonNguoi == 2) {
			diemMay++;
			System.out.println("May thang");
		} else {
			System.out.println("Hoa");
		}

		if (diemMay > diemNguoi) {
			System.out.println("May da thang ban!");
			System.out.println("So lan may thang " + diemMay);
			System.out.println("So lan nguoi thang " + diemNguoi);

		} else if (diemMay < diemNguoi) {
			System.out.println("Chuc mung chien thang. Ban da thang may");
			System.out.println("So lan nguoi thang " + diemNguoi);
			System.out.println("So lan may thang " + diemMay);
		} else {
			System.out.println("Ket qua HOA");
			System.out.println("So lan nguoi thang " + diemNguoi);
			System.out.println("So lan may thang " + diemMay);
		}
	}

//	public static void hamAiThang(int diemNguoi, int diemMay) {
//		
//
//	}

}

//1. ham input lua chon nguoi
//show cac lua chon
//1 = keo
//2 = bua
//3 = bao
//0 = stop
//
//luaChonNguoi = Integer.parseInt(scan.nextLine());
//
//2. ham lua chon may
//luaChonMay = (int) (Math.random() *3 + 1) )
//
//3. ham oan tu xi
//
//if (luaChonMay == 1 && luaChonNguoi == 2) {
//	Nguoi Thang
//	nguoi++;
//} else if (luaChonMay == 1 && luaChonNguoi ==3) {
//	May Thang
//	diemMay++;
//} else if (luaChonMay == 2 && luaChonNguoi = 1) {
//	May thang
//	diemMay++;
//} else if (luaChonMay == 2 && luaChonNguoi ==3) {
//	Nguoi Thang
//	diemNguoi++;
//} else if (luaChonMay == 3 && luaChonNguoi == 1) {
//	Nguoi Thang
//	diemNguoi++;
//}else if()luaChonMay == 3 && luaChonNguoi == 1){
//	May Thang
//	diemMay++;
//} else {
//	kq hoa
//}
//
//4. ham ai Thang
//if (diemMay > diemNguoi) {
//	may thang
//	System.out.println("May da thang ban!");
//
//} else {
//	nguoi thang
//	System.out.println("Chuc mung chien thang. Ban da thang may");
//
//}
//
//5. Ham in ty so{
//	System.out.println("So lan may thang " + diemMay);
//	System.out.println("So lan nguoi thang " + diemNguoi);
//}
