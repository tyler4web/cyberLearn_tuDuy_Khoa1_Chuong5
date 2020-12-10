package cyberLearn_tuDuy_Khoa1_Chuong5_buiQuocTrieu;

public class bai2_timNguyenDuongNhoNhat {
	static final int NUM = 1000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		int sum = 0;

		while ((sum) <= NUM) {
			n++;
			sum = sum + n;
			System.out.print(n);

			if ((sum ) <= NUM) {
				System.out.print(" + ");
			}

		}
		System.out.println(" = " + sum + " > " + NUM);
		System.out.println("So nguyen duong n nho nhat la: " + n);
	}
}

//
//2. static variable NUM = 1000;
//
//3. khai bao bien sum
//4. ham tim so
//
//trong khi (sum +m) <= NUM
//sum = sum + ++m;
//in ra man hinh so m
//
//if (sum + m ) <= NUM
//in ra dau " + "
//
// 5. in ra man hinh ket qua
//So nguyen duong n nho nhat = m
//}
