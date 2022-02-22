package day043;

public class Operator {

	public static void main(String[] args) {
		
		//연산자의 종류와 우선순위

		//최우선 연산자 [],()
		//단항 ! ~ + - ++
		//산술 + - * / %
		//쉬프트 << >>
		//관계 
		//논리 && ||
		//삼항 9조건0? 참 : 거짓
		//대입 = += -=
		//2+3 = +는 연산자 2,3은 피연산자 or 항

		
//		순위 
//		최우선
//		당한
//		산술
//		쉬프트
//		관계
//		논리
//		삼항
//		대입
		
		// % 는 나누기 후 나머지 값을 산출하는 표기 ex 5%3
		// 주 사용처는 결과값의 홀 짝을 확인하기 위함
		
		int a=10;
		int b=3;
		double doubleB=3;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); // 정수 나누기 정수는 정수만 나옴(반내림)
		System.out.println(a%b);
		
		System.out.println(a/doubleB); 
		// 정수/실수 일 시 실수사 나옴.
		// 컴퓨터는 실수를 끝까지 계산하지 못함 유한 번위로 표현됨
		
		System.out.println(a%doubleB);
		System.out.println(doubleB%b);
		
	}

}
