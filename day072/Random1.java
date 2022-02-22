package day072;

import java.util.Random;

public class Random1 {

	public static void main(String[] args) {
		Random random = new Random();		// seed는 현재 시간
		Random random1 = new Random();		// seed는 현재 시간
		Random random2 = new Random(2);
		Random random3 = new Random(2);
		System.out.println(System.currentTimeMillis()); // 현재시간은 정수값으로 표기해 주는 것
		
		
		for(int i=0; i<5; i++) {
			System.out.println("기본생성자 :"+i+"번째값"+random.nextInt());
		}
		for(int i=0; i<5; i++) {
			System.out.println("기본생성자1 :"+i+"번째값"+random1.nextInt(10));
		}
		for(int i=0; i<5; i++) {
			System.out.println("기본생성자2 :"+i+"번째값"+random2.nextInt());
		}

		for(int i=0; i<5; i++) {
			System.out.println("기본생성자3 :"+i+"번째값"+random3.nextInt(10));
		}


	}

}
