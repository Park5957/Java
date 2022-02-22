package day050;

import java.util.Scanner;

public class Continue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int money = 10000;
		System.out.println("현재 가진돈은 10000원");
		Scanner sc =new Scanner(System.in);
		
		while (true) {
			System.out.println("얼마를 사용하시겠습니까?");
			int i=sc.nextInt();
			
			if (!(0<=i &&i<=money)) { //0보다 크거나 같거나 또는 선언된 10000원(머니) 보다 작더나의 값이 아닐(!)시 동작
				System.out.println("다시 입력해주세요(사용범위가 틀렸습니다.)");
				continue;
				
			}
			
			System.out.printf("이제는 %d 원이 남았습니다.\n" , money-=i);
			if(money==0) {
				
				break;
				
			}
			}
		System.out.println("모든 돈은 사용합니다. 종료");

	}
}

