package pm12;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.BranchElement;

public class test_trining17 {

	public static void main(String[] args) {
		// HW01
//		HW hw01 = new HW();
//		hw01.HW01_indexdel();

//		HW02
//		HW hw02 = new HW();
//		hw02.HW02_aryRmv();

//		HW03
//		HW hw03 = new HW();
//		hw03.HW03_aryIns();

//		HW04
//		HW hw04 = new HW();
//		hw04.HW04_aryExchng();

//		HW05
		HW hw05 = new HW();
		hw05.HW05_arryClone();

	}

}

class HW {
	Scanner sc = new Scanner(System.in);

	void HW01_indexdel() {
		System.out.print("요소의 수 : ");
		int num = sc.nextInt();
		int[] a = new int[num];

		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}

		int[] a2 = new int[num];
		System.out.print("삭제할 요소의 인덱스 : ");
		int b = sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (j == b) {
					a2[j] = a[i + 1];
					i += 2;

				} else {
					a2[j] = a[i];
					i++;
					if (i == a.length - 1) {
						j++;
						a2[j] = a[i];
					}

				}

			}

		}
		System.out.println(Arrays.toString(a2));
	}

	void HW02_aryRmv() {
		System.out.print("요소의 수 : ");
		int num = sc.nextInt();
		int[] a = new int[num];

		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();

		}

		System.out.print("삭제를 시작할 인덱스 : ");
		int b = sc.nextInt();
		System.out.print("삭제할 요소의 수 : ");
		int c = sc.nextInt();

		int d = c + b;
		if (d > a.length) {
			d = a.length;
		}

		for (int i = b; i < d; i++) {

			if (a.length - 1 == c) {
				break;
			} else {
				c += 1;
				a[i] = a[c];

			}

		}
		System.out.println(Arrays.toString(a));
	}

	void HW03_aryIns() {
		System.out.print("요소의 수 : ");
		int num = sc.nextInt();
		int[] a = new int[num];

		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();

		}
		System.out.print("삽입할 요소의 인덱스 : ");
		int b = sc.nextInt();
		System.out.print("삽입할 값 : ");
		int c = sc.nextInt();
		int d = 0;

		for (int i = a.length - 1; i > 0; i--) {
			if (i != b) {
				a[i] = a[i - 1];
			} else if (i == b) {
				a[i] = c;
				break;
			}

		}
		System.out.println(Arrays.toString(a));

	}

	void HW04_aryExchng() {
		System.out.print("요소의 수 : ");
		int num = sc.nextInt();
		int[] a = new int[num];
		int[] b = new int[num];

		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();

		}
		for (int i = 0; i < b.length; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = sc.nextInt();

		}

		int c = 0;
		int d = 0;

		for (int i = 0; i < a.length; i++) {

			if (i > b.length - 1 || i > a.length - 1) {
				break;
			} else {
				if (a.length > b.length) {
					c = a[i];
					d = b[i];

					a[i] = d;
					b[i] = c;
				}

			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}

	void HW05_arryClone() {

		System.out.print("요소의 수 : ");
		int num = sc.nextInt();
		int[] x = new int[num];

		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();

		}
		int count = 0;
		int[] y = new int[num];

		for (int i : x) {
			y[count] = x[count];
			count ++;

		}
		System.out.println("배열 x를 복사해서 배열 y를 생성했습니다.");
		count = 0;
		for (int i : y) {
			System.out.println("y[" + count + "] : "+i);

		}

	}
}
