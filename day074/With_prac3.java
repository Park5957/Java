package day074;

import java.time.LocalDate;

public class With_prac3 {

	public static void main(String[] args) {
		//leap
		
		LocalDate ld = LocalDate.now();
		LocalDate new_ld;
		int count =0;
		
		for(int i=1900; i<=2100; i++) {
			new_ld= ld.withYear(i);
			if(new_ld.isLeapYear()) {
				System.out.println(new_ld.getYear()+"년 윤년입니다.");
				count++;
				
			}
		}
		System.out.println("1900년 부터 2100년 까지 윤년은 총"+count + "년 입니다");


	}

}
