package day047;

import java.util.Scanner;

public class Switch_traffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//switch(변수){식이 올 수 있으나, 대체로 변수를 사용함
//		case 값1:
//			
//			변수 == 값1일때 실행할 명령;
//			break;
		
		// default: 모든 case가 아닐때 실행할 명령;
		// 위 형태가 기본명령
		
		System.out.println("신호등프로그램");
		System.out.println("Red1, Yello2, Green3");
		System.out.println("light");
		
		Scanner sc = new Scanner(System.in);
		
		int sign = sc.nextInt();
		
		
		switch(sign) {
		case 1: 
			System.out.println("Redline Stop");
			break;
			
		case 2 :
			System.out.println("Yello break");
			break;
			
		case 3 :
			System.out.println("Green Go");
			break;
			
		default :
			System.out.println("잘못누르셨습니다.");
	
	
	}

	}
}
