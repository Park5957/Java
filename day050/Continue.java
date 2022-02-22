package day050;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//음수의 임력이 될 경우 숫자 출력인 안되고 계속 반복이 진행됨
		//0 입력시 반복 종료
		
		
		Scanner sc =new Scanner(System.in);
		int num;
	
		
		while (true) {
			System.out.println("숫자입력");
			num=sc.nextInt();
			
			if(num==0) {
				System.out.println("End");
			}
			if(num<0) {
				System.out.println("아래 명령 무시하고 다음 반복으로 진행");
				continue;
				
			}
			
			System.out.println("num:"+num);
		}

	}

}
