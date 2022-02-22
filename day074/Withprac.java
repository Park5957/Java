package day074;

import java.time.LocalDate;

public class Withprac {

	public static void main(String[] args) {
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		LocalDate new_ld = ld.withYear(1999).withMonth(8).withDayOfYear(23);
		// 													순서상 1999.1.1 일 기준으로 23일이 지난 계산이됨
		System.out.println(new_ld);
	

	}

}
