package day050;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if 반복문 멈추는 방법
		
	
//		while (true) {반복 할 명령}
		
//		int i=1;
//			while (true) {
//				System.out.println(i++); // 이 과정은 무한과정
//			}
//
//		
		Scanner sc =new Scanner(System.in);
				
		int num;
		
				while (true) {
					System.out.println("숫자입역");
					num=sc.nextInt();
					
					if(num==0 ) {
						System.err.println("END");
						break;
						
					}
					
					System.out.println("입력값:"+num);
				}
	}

}
