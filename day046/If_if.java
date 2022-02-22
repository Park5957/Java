package day046;

import java.util.Scanner;

public class If_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//중첩 if 문 - 로그인 하는 알고리즘
		
		String id, password;  //변수선어(내용이 없는 변수)
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("아이디를 입력해 주세요:");
		id = input.nextLine();
		
		if(id.equals("java")) {
			System.out.println("id 일치!");
			System.out.print("비밀번호를 입력해 주세요:");
			password=input.nextLine();
			if(password.equals("abc123")) {
				System.out.println("ok");
				System.out.println("let go!");	
			}
			else {
				System.out.println("비밀번호 틀렸습니다.");
			}
		
		}
		else {//조건1을 부정한 결과 값
			System.out.println("아이디 불일치");
		}
	}

}
