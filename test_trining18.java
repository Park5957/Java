package pm13;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class test_trining18 {

	public static void main(String[] args) {
//		HW01
//		HW hw01 = new HW();
//		hw01.HW01_arraySrchIdx();
//		HW02
//		HW hw02 = new HW();
//		hw02.HW02_arrayRmvOf();
//		HW03
//		HW hw03 = new HW();
//		hw03.HW03_arrayRmvOfN();
//		HW04
//		HW hw04 = new HW();
//		hw04.HW04_arrayInsOf();
//		HW04
		HW hw05 = new HW();
		hw05.HW05_addMatrix();
	}

}

class HW {
	Scanner sc = new Scanner(System.in);

	void HW01_arraySrchIdx() {
		System.out.print("요소의 수 : ");
		int num = sc.nextInt();
		int[] a = new int[num];

		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		System.out.print("탐색할 값 : ");
		int s = sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == s) {
				System.out.println(i);
			}
		}
	}

	void HW02_arrayRmvOf() {
		System.out.print("요소의 수 : ");
		int num = sc.nextInt();
		int[] a = new int[num];
		int[] a2 = new int[num - 1];
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		System.out.print("삭제할 요소의 인덱스 번호 : ");
		int s = sc.nextInt();
		for (int i = 0; i <= a.length - 1; i++) {

			if (i == s) {
				a2[count] = a[i + 1];
				i += 2;
				count++;

			}

			a2[count] = a[i];
			count++;

		}
		System.out.println(Arrays.toString(a2));

	}

	void HW03_arrayRmvOfN() {
		System.out.print("요소의 수 : ");
		int num = sc.nextInt();
		int[] a = new int[num];
		ArrayList<Integer> y = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}

		System.out.print("삭제를 시작할 인덱스 : ");
		int s = sc.nextInt();
		System.out.print("삭제할 요소의 갯수 : ");
		int s2 = sc.nextInt();

		for (int i = 0; i < a.length; i++) {

			if (s == i) {
				for (int j = s; j < s2 + 1; j++) {
					i++;
					continue;
				}

			}
			y.add(a[i]);
		}

		for (int i = 0; i < y.size(); i++) {
			System.out.println("y[" + i + "] : " + y.get(i));
		}

	}

	void HW04_arrayInsOf() {
		System.out.print("요소의 수 : ");
		int num = sc.nextInt();
		int[] a = new int[num];
		ArrayList<Integer> y = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		System.out.print("삽입할 인덱스 : ");
		int s = sc.nextInt();
		System.out.print("삽입할 값 : ");
		int s2 = sc.nextInt();

		for (int i = 0; i < a.length; i++) {

			if (i == s) {
				y.add(99);
				
			}
			y.add(a[i]);

		}

		for (int i = 0; i < y.size(); i++) {
			System.out.println("y[" + i + "] : " + y.get(i));
		}

	}
	
	void HW05_addMatrix(){
		int a[][] = {{1,2,3},{4,5,6}};
		int b[][] = {{6,3,4},{5,1,2}};
		int c[][] = {{7,5,7},{9,6,8}};
		int count = 0;
		
		for (int i = 1; i<a.length; i++) {
			if (a[i].length == b[i].length && b[i].length == c[i].length) {
				count ++;
				
			}else {
				break;
			}
		}
		if (count == a.length-1) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
}