package day046;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//제어문이란 프로그램의 흐름을 제어하는 문법
		//조건문 -정해진 조건에 따라 흐름을 제어
		//반복문 -정해진 조건에 따라 흐름을 반복
		
		//조건문 상세 조건에 따라 각각 다르게 실행하도록 만들어 놓은 제어문
		// 종류
		//   If, switch
		//구조 if(조건문){조건이 참일때 실행할 명령 또는 거짓일때 실행할 명령;}
		
		// sentence
		int a=2;
		if (a>3) {
		System.out.println("a는 3보다 큽니다");
		}
		if (a<3) {
			System.out.println("작습니다");
		}
		
		System.out.println("검사가 끝났습니다.");
		

	}

}
