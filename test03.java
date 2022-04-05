package pm18;

import java.util.ArrayList;
import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("리스트 1의 범위지정 : ");
		int n = sc.nextInt(); // 리스트 a 범위지정
		System.out.print("리스트 2의 범위지정 : ");
		int m = sc.nextInt(); // 리스트 b 범위지정

		Num num = new Num();
		num.num1(n, m); // class Num 진행

	}
}

class Num {
	Scanner sc = new Scanner(System.in);

	void num1(int n, int m) {
		ArrayList<Integer> c = new ArrayList<>(); // 리스트 c (중복보관용)선언
		int[] a = new int[n]; // 리스트 a 선언
		int[] b = new int[m]; // 리스트 b 선언
		int zrocu = 0; // 중복값으로 0이 존재하는지 확인용

		for (int i = 0; i < a.length; i++) {
			System.out.print(i+1+"값 입력");
			a[i] = sc.nextInt(); // 리스트 a 에 들어갈 값 입력받기
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(i+1+"값 입력");
			b[i] = sc.nextInt(); // 리스트 b 에 들어갈 값 입력받기
		}

		for (int i = 0; i < a.length; i++) { // 중복값을 0 으로 지정
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) { // 리스트 a와 b 중복값 찾기
					a[i] = 0; // 중복일시 중복값 0으로 처리
					b[j] = 0; // 중복일시 중복값 0으로 처리
				}else if (a[i] ==0 && b[i] !=0) {
					zrocu +=1; //중복이아닌 0을 확인
				}else if (b[i] ==0 && a[i] !=0) {
					zrocu +=1; //중복이아닌 0을 확인
				}
					
				
			}
		}
		for (int i = 0; i < a.length; i++) { // 0을 제외한 나머지 값을 c로 지정
			if (a[i] != 0) {
				c.add(a[i]); // 0이 아닌값 c 에 입력

			}
			if (b[i] != 0) {
				c.add(b[i]); // 0이 아닌값 c 에 입력
			}
		}
		for (int i : c) {
			System.out.print(i + ","); // 중복이 아닌 값을 출력
		}
		if (zrocu > 0 && 2<zrocu) {//중복이아닌 0의 존재를 확인
			System.out.print(0); // 중복이 아닌 0을 추가
			
		}
		
	}

}