package day047;

import java.util.Random;

public class Pokemon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Random 클래스  anwkrdl todtjd
		// nextint() 정수값의 난수
		// nextint (숫자) 0 ~ -1 까지 정수값의 난수를 발생시킴(사용시 -case 를 사용하지 않기위해 +1를 해야함.
		// nextFloat() 0.0 1.0 제외 0.0~1.0 까지
		
 		Random random = new Random();
 				
		System.out.println("포켓몬 랜덤뽑기");
		System.out.println("PK");
		System.out.println("CB");
		System.out.println("IS");
		
		int mypokemon = random.nextInt(3)+1; // 0~2, 1~3
		// (3)을 적으면 0,1,2 가 발생을 하기 때문에 case 순번을 맞추기 위해서 +1을 붙임
		
		switch(mypokemon) {
				
		case 1 :
			System.out.println("찌릿");
			break;
		
		case 2 :
			System.out.println("물물");
			break;
			
		case 3 :
			System.out.println("이상이상");
			break;
				
			
			// 랜텀 클랙스는 스튀치 뿐만 아니라 if에도 적요을 할 수 있다 미세 확률 조정으로 사용이 가능함.
			
		}

	}

}
