package pm10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class test_trining15 {

	public static void main(String[] args) {
//		HW01
		Scanner sc = new Scanner(System.in);

		System.out.print("A 값 입력 : ");
		int a = sc.nextInt();
		System.out.print("B 값 입력 : ");
		int b = sc.nextInt();
		System.out.print("C 값 입력 : ");
		int c = sc.nextInt();
		System.out.println("중간값은 : " + (a + b + c) / 3 + "입니다.");

//		HW02
		System.out.print("합계를 구할 범위 값 : ");
		int x = sc.nextInt();
		int x2 = 0;
		System.out.println("x의 값 : " + x);
		for (int i = 1; i <= x; i++) {
			x2 = i + x2;

		}
		System.out.println("1부터 " + x + "까지의 합은" + x2 + "입니다.");
		
//		HW03
		String[] m2 = { "봄", "여름", "가을", "겨울" };
		System.out.println(Arrays.toString(m2) + "\n 3,4,5 | 6,7,8 | 9,10,11 | 12,1,2");
		System.out.println("번호 : ");
		int m = sc.nextInt();
		int m3 = m / 3;
		if (m3 == 4 || m == 1 || m == 2) {
			System.out.println(m2[3]);
		} else if (m3 < 4) {
			System.out.println(m2[m3 + 1]);
		}
		
//		다른 방법
//
//		if (m/3 == 1) {
//			System.out.println(m2[0]);			
//		}
//		
//		else if(m/3 == 2) {
//			System.out.println(m2[1]);
//		}
//		else if(m/3 == 3) {
//			System.out.println(m2[2]);
//		}
//		else if(m/3 == 4 || m == 1 || m ==2) {
//			System.out.println(m2[3]);
//		}
		
//		HW04
		char putstart = 6;
		for (int i = 0; i<putstart; i++) {
			for(int j = 0; j <= i; j++) {
			System.out.print("*");
			}System.out.println();
		}
//		HW05
		Random rd =new Random();
		System.out.println("a 입력 : ");
		int aa = sc.nextInt();
		System.out.println("b 입력 : ");
		int bb = sc.nextInt();
		
		int r = aa+rd.nextInt(bb);
		System.out.println("하안값 : "+aa);
		System.out.println("상한값 : "+bb);
		System.out.println("생성된 난수는 "+r+"입니다.");
	}

}
