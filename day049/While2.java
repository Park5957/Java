package day049;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		String answer ="Y";
		
				int count = 0;
				
		while(answer.equals("Y")){ // Y를 입력함으로 카운트를 늘리는 명령어
			System.out.println("음악을 재생하겠습니까?(Y)");
			answer=sc.nextLine();
			
			if(answer.equals("Y")) {
				System.out.printf("음악을 %d 번 재생했습니다. \n",++count);
				
				
			}
			
		}
		System.out.println("stop"); // 다른 문자를 적을 시 정지멘트

	}

}
