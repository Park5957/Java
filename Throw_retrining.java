package pm10;

import java.util.Scanner;

public class Throw_retrining {

	public static void main(String[] args) {
		// 예외를 강제로 발생시키기
		// int age = -1; 실제로는 예외가 아니다.
		// 하지만 나이는 -1살 은 성립하지 않기 때문에
		// 이와같은 상황은 강제로 예외로 인식시킬 필요가 있다.

		// 즉, 상황에 벗어나는 값이 지정되었을때 이를 예외로 인식시키기 위해
		// 강제로 예외를 발생시키는 것이다.

		// 사용자 정의 예외 클래스를 만들어 보면 다른 예외 들의 동작 메커니즘도 자연스럽게 이해할 수 있다.
		Scanner sc = new Scanner(System.in);
		System.out.print("1번(thow)방식과 2번(thows)방식중 하나를 선택하시오 : ");
		int chois = sc.nextInt();

		System.out.println("작동 B b = new B();");
		B b = new B();

		if (chois == 1) {
			System.out.println("작동 b.bcd_1();");
			b.bcd_1();
		} else {
			b.bcd_2();

		}

	}

}

class MyException extends Exception { // 예외 처리 전체를 상속 받음 Exception은 따로 만들 필요가 없다.
	MyException() {
		System.out.println("작동 MyException();");

	}

	MyException(String s) {
		super(s);
		System.out.println("작동 MyException(String s);");
	}
}

class MyRTException extends RuntimeException { // 실행예외
	MyRTException() {

	}

	MyRTException(String s) {
		super(s);
	}
}

class B {
	MyException me1 = new MyException();
	MyException me2 = new MyException("예외 메세지:MyException");

	MyRTException mer1 = new MyRTException();
	MyRTException mer2 = new MyRTException("예외 메세지:MyRTException");

	void abc_1(int num) {
		System.out.println("작동 void abc_1(int num) try");
		try {
			if (num > 70) {
				System.out.println("정상 작동");
			} else {
				System.out.println("작동 void abc_1(int num)의 else");
				System.out.println("작동 throw me1");
				throw me1; // 예외 발생
			}

		} catch (MyException e) {
			System.out.println("예외처리 1");
		}

	}

	void bcd_1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("작동 int num = sc.nextInt();");
		System.out.print("예외처리 값 입력 70이하 예외처리 발생 : ");
		int num = sc.nextInt();
		
		System.out.println("작동 abc_1(num);");
		abc_1(num);
	}

	void abc_2(int num) throws MyException {
		if (num > 70) {
			System.out.println("정상 작동 throw");
		} else {
			throw me1; // 강제로 에러 발생
		}
	}

	void bcd_2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("예외처리 값 입력 70이하 예외처리 발생 : ");
		int num = sc.nextInt();

		try {
			abc_2(num);
		} catch (MyException e) {
			System.out.println("예외처리2");
		}

	}
}





//위 코드의 순서 결과
//
//1번(thow)방식과 2번(thows)방식중 하나를 선택하시오 : 1
//작동 B b = new B();
//작동 MyException();           이 부분의 발생 이유는 class B에서 객체 생성을 정의 했기 때문이다. 
//작동 MyException(String s);   이 부분의 발생 이유는 class B에서 객체 생성을 정의 했기 때문이다.
//작동 b.bcd_1();
//작동 int num = sc.nextInt();
//예외처리 값 입력 70이하 예외처리 발생 : 65
//작동 abc_1(num);
//작동 void abc_1(int num) try
//작동 void abc_1(int num)의 else
//작동 throw me1
//예외처리 1