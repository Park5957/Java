package pm;

import java.util.Scanner;

public class test_trining3 {

	public static void main(String[] args) {
		// 3자리의 양의 정수값 (100~999) 를 읽는 프로그램을 작성
		// 입력한 값이 3의 양의 정수가 아니면 다시 입력하게 하시오
		Scanner sc = new Scanner(System.in);
		int a;
		do {System.out.println("3자리의 양의 정수값 (100~999) 중 입력 : ");
			a = sc.nextInt();									
		}while (a<=100 || a>=999);
		System.out.println("입력한 값은"+a+"입니다.");
	}
}
