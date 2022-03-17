package pm10;

import java.util.Scanner;

public class test_trining12 {

	public static void main(String[] args){
		// 사용자 예외 클래스를 정의하여 예외를 발생 시키시오
		// 예외 발생 조건 - 100점 초과
		// 0점 미만
		// 정상값 0~100
		// 정상적입 값입니다.

		Scanner sc = new Scanner(System.in);
		System.out.print("0~100 사이를 입력하시오 : ");
		User us = new User();
		int num = sc.nextInt();
		us.ct2(num);

	}

}

class myex extends RuntimeException {

}

class User {
	myex ovex = new myex();


	void ct2(int num) throws myex {
		try {
			if (num > 100) {
				throw ovex;
			} else if (num < 0) {
				throw ovex;
			} else {
				System.out.println("정상적인 값입니다." + num);
			}
		} catch (myex e) {

			if (num > 100) {
				System.out.println("100 초과 OverException 발생.");
			} else if (num < 0) {
				System.out.println("100 초과 minException 발생.");
			}

		}
	}

}
