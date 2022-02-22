package day045;

import java.util.Scanner;

public class Taffic_Light {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in); // 컨트롤 쉬프트 o  필수!
				System.out.println("신호등 프로그램");
		        System.out.println("신호를 입력하세요");
				System.out.println("빨간물:1,초록불:2,노랑불:3");
				int sign = Sc.nextInt();
				String result=sign==1?"stop~":sign==2?"start~":"slow~";
				// 1에 거짓일 경운 sign을 한번 더 추가하여 참 과 거짓을 나눔 (분기 알고리즘)
				System.out.println(result);
						
						

	}

}
