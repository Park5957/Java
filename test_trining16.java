package pm11;

import java.util.Random;
import java.util.Scanner;

public class test_trining16 {
	public static void main(String[] args) {
//		HW01
		Rd r = new Rd();
		r.readPlusInt();
//		HW02
		RDT r2 = new RDT();
		r2.testrd();
//		HW03
		Numk k = new Numk();
		k.n();
//		HW04
		Numk2 k2 = new Numk2();
		k2.n();
//		HW05
		LinerSearch ri = new LinerSearch();
		ri.LinerSearchR();
	}

}

class Rd {
	void readPlusInt() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정숫값 : ");
		int a = sc.nextInt();
		while (true) {
			if (a <= 0) {
				System.out.print("양의 정숫값 : ");
				a = sc.nextInt();

			} else {
				System.out.print("반대로 읽으면 ");
				int b = 0;
				while (a != 0) {
					int c = a % 10;
					b = b * 10 + c;
					a /= 10;
				}
				System.out.println(b + "입니다.");
				System.out.println("다시 한번 더 ?<Yes...1 / NO...0>");
				int d = sc.nextInt();
				if (d == 1) {
					System.out.print("양의 정숫값 : ");
					a = sc.nextInt();
				} else if (d == 0) {
					break;
				}

			}

		}

	}

}

class RDT {
	void testrd() {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int rt = 1 + rd.nextInt(4);
		int x = rd.nextInt(1000) + 1;
		int y = rd.nextInt(1000) + 1;
		int z = rd.nextInt(1000) + 1;
		int d = 0;
		String q = null;
		int d2 = 0;

		do {
			switch (rt) {
			case 1:
				d = x + y + z;
				q = "x+y+z";
				System.out.print(x + "+" + y + "+" + z);
				break;
			case 2:
				d = x + y - z;
				q = "x+y-z";
				System.out.print(x + "+" + y + "-" + z);
				break;
			case 3:
				d = x - y + z;
				q = "x-y+z";
				System.out.print(x + "-" + y + "+" + z);
				break;
			case 4:
				d = x - y - z;
				q = "x-y-z";
				System.out.print(x + "-" + y + "-" + z);
				break;

			}
			System.out.print("=");
			d2 = sc.nextInt();
			if (d2 != d) {
				System.out.println("틀렸습니다.");

			}

		} while (d2 != d);
		r3();

	}

	void r3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("다시 한번 더 ?<Yes...1 / NO...0>");
		int s = sc.nextInt();
		if (s == 1) {
			this.testrd();
		}
	}

}

class Numk {
	void n() {
		Scanner sc = new Scanner(System.in);
		System.out.print("요소 수 : ");
		int numk = sc.nextInt();
		int[] x = new int[numk];
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "] : ");
			int a_input = sc.nextInt();
			x[i] = a_input;
			sum = sum + x[i];
		}
		System.out.println("모든 요소의 합은 " + sum + "입니다.");
	}
}

class Numk2 {
	void n() {
		Scanner sc = new Scanner(System.in);
		System.out.print("사람 수는 : ");
		int numk = sc.nextInt();
		int[] x = new int[numk];
		int[] x2 = new int[numk];

		for (int i = 0; i < x.length; i++) {
			System.out.print(i + 1 + "번의 신장 : ");
			int x_input = sc.nextInt();
			x[i] = x_input;

			System.out.print(i + 1 + "번의 체중 : ");
			int x2_input = sc.nextInt();
			x2[i] = x2_input;

		}
		int min1 = x[0];
		int min2 = x2[0];

		for (int i = 0; i < x.length; i++) {

			if (min1 > x[i]) {
				min1 = x[i];

			}
		}
		for (int i = 0; i < x2.length; i++) {

			if (min2 > x2[i]) {
				min2 = x2[i];

			}
		}
		System.out.println("가장 키가 작은 사람의 신장 : " + min1 + "cm");
		System.out.println("가장 마른 사람의 체중 : " + min2 + "kg");
	}
}

class LinerSearch {
	void LinerSearchR() {
		Scanner sc = new Scanner(System.in);
		System.out.print("요소 수 : ");
		int numk = sc.nextInt();
		int[] x = new int[numk];
		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "] : ");
			int a_input = sc.nextInt();
			x[i] = a_input;
		}

		System.out.print("찾을 값을 입력하시오 :");
		int s = sc.nextInt();
		int count = 0;
		int tk = 0;
		int tk2 = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] == s && count == 0) {
				tk = i;
				count++;
			} else if (x[i] == s && count > 0) {
				tk2 = i;
			}

		}
		if (count > 0) {
			System.out.println("해당 값의 요소가 여러개 존재합니다.");
		}

		if (tk2 != 0) {
			System.out.println("가장 앞에 위치한 값은x[" + tk + "]에 있습니다.");
			System.out.println("가장 뒤에 위치한 값은x[" + tk2 + "]에 있습니다.");
		} else {
			System.out.println("가장 앞에 위치한 값은x[" + tk + "]에 있습니다.");
		}

	}
}
