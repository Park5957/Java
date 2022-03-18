package pm10;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class test_trining14 {

	public static void main(String[] args) {
		// HW01 와 HW02 는 하나의 class 에서 처리함.
		// HW03 는 지문 자체를 이해 못함. 추후 확인후 수정. 
		Meth hw = new Meth();
//		HW01
		hw.hw1();
		
//		HW02
		hw.hw2();
		
//		HW03
		Gu hw3 = new Gu();
		hw3.gugu();
		
//		HW04
		Si s = new Si();
		Scanner sc = new Scanner(System.in);
		System.out.print("singOf(x)에 입력될 정수를 입력하시오 : ");
		int x = sc.nextInt();
		s.singOf(x);
		
//		HW05
		int a = 1;
		int b = 2;
		int c = 3;
		
		int t = (a<b? a<c? a:c : b<c? b:c);
		System.out.println(t);


	}

}

class Meth {
	String[] dn = { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
			"November", "December" };
	String[] dn2 = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
	String[] dn3 = { "월", "화", "수", "목", "금", "토", "일" };

	void hw1() {

		Random rd = new Random();
		int d = 1 + rd.nextInt(12);
		System.out.println(d + "월 에 해당하는 영어단어를 입력하시오");
		System.out.println("첫 글자는 대문자, 나머지는 소문자로 입력하세요");
		System.out.print(d + "월 : ");

		while (true) {
			Scanner sc = new Scanner(System.in);
			String k = sc.next();
			if (k.equals(dn[d - 1])) {
				System.out.println("정답입니다.");
				System.out.println("다시 한번? 1...Yes/0...NO");
				int c = sc.nextInt();
				d = 1 + rd.nextInt(12);
				if (c == 1) {
					System.out.print(d + "월 : ");
				} else if (c == 0) {
					break;
				}
			} else {
				System.out.println("틀렸습니다.");
				System.out.print(d + "월 : ");
			}
		}
	}

	void hw2() {

		Random rd = new Random();
		int d = 1 + rd.nextInt(12);

		System.out.println(dn3[d - 1] + "요일 에 해당하는 영어단어를 소문자로 입력하시오");
		System.out.print(dn3[d - 1] + "요일 : ");

		while (true) {
			Scanner sc = new Scanner(System.in);
			String k = sc.next();
			String dn22 = dn2[d - 1].toLowerCase();
			if (k.equals(dn22)) {
				System.out.println("정답입니다.");
				System.out.println("다시 한번? 1...Yes/0...NO");
				int c = sc.nextInt();
				int d2 = d;
				d = 1 + rd.nextInt(12);
				if (c == 1) {
					if (d == d2) {
						while (d == d2) {
							d = 1 + rd.nextInt(12);
						}
					}
					System.out.print(dn3[d - 1] + "요일 : ");

				} else if (c == 0) {
					break;
				}
			} else {
				System.out.println("틀렸습니다.");
				System.out.print(dn3[d - 1] + "요일 : ");
			}
		}
	}
}

class Gu {
	int[][] a = {{1,2,3},{2,3,1},{3,1,2},{2,1,3}};
	int[][] b = {{4,3,2,1},{3,2,1,4},{2,1,4,3}};
	int c[][] = new int [4][4];
	
	void gugu() {
		for(int i = 0; i<4; i++) {
			for(int j = 0; j<4; j++) {
				c[i][j] =0;
				for(int k = 0; k<3; k++) {
					c[i][j] = a[i][k]*b[k][j];
				}
				
			}
			
		}System.out.println(Arrays.deepToString(c));
	}
}


class Si{
	
	void singOf(int x) {
	if(x > 0){
		System.out.println("정수 x : "+x+"\n singOf(x)는 "+1+"입니다.");
	}
	else if(x < 0){
		System.out.println("정수 x : "+x+"\n singOf(x)는 "+-1+"입니다.");
	}
	else {
		System.out.println("정수 x : "+x+"\n singOf(x)는 "+0+"입니다.");
	}
	}
}


