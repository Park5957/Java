package day046;

import java.util.Scanner;

public class If_else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int age;
		System.out.println("나이");
		age=sc.nextInt();
		
		if(age>19 ) {
			System.out.println("성인입니다");
		}
		else if (age>13) {
			System.out.println("청소년입니다");
			
		}
		else if(age>8) {//바로 위 else if 의 조건을 따라서 파생된 조건 8<age<=13
			
			System.out.println("어린이입니다");
			
		}
		
		else { //age<=8
			System.out.println("유아입니다");
		}
		
		System.out.println("결제를 진행해 주시기 바랍니다");

	}

}
