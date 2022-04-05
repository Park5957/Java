package pm18;

import java.util.Scanner;

public class test02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("정숫값입력 : "); 
		int a = sc.nextInt();// 정수 입력
		int b = 0; // 비교용 b
		int c = a; // 저장용 C
		while (a != 0) { // a가 0이 될때까지 진행
			b = b + a % 10; // b는 a의 나머지 값임으로 a 의 가장 뒷 숫자를 b의 첫번째 숫자로 적용
			a = a / 10;	// b에 적용된 a 의 값을 제거해야 함으로 a를 변경
			if (a != 0) {
				b = b * 10; //b에 적용된 값의 자릿수를 변경
			}
		}
		
		if (c < 0) { // 저장된 c가 -일 경우 무조건 false 이기 때문에 false로 지정
			System.out.println("false");
		}
		else if (b%c != 0) { // C와 B 가 동일한지 확인 동일한 값이라면 나머지가 0이기 때문
			System.out.println("false");
		}
		else{ // 동일하다면 true를 반환
				System.out.println("true");}

	}

}

