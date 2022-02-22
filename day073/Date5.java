package day073;

import java.util.Date;

public class Date5 {
	public static void main(String[] args) {
		
		//같은 결과를 도출할 수 있음
		Date today = new Date();
		System.out.println(today);
		
		long a = System.currentTimeMillis();
		Date today2=new Date(a);
		System.out.println(today2);
	
	}
}
