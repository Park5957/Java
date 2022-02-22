package day073;

import java.util.Calendar;

public class Date4 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		Calendar endOftear = Calendar.getInstance();
		Calendar Chrismas = Calendar.getInstance();
		//set 으로 값을 지정할 수 있음
		endOftear.set(Calendar.MONTH,11); // 12월로 지정하는 것임 1월은 0부터 시작함
		endOftear.set(Calendar.DATE,31); // Date : 31일
		long diff = endOftear.getTimeInMillis()-today.getTimeInMillis();
		System.out.println("연말까지 남은 날 : " + diff/(24*60*60*1000));
												// 하루 * 분 * 초 * m.sec으로 변경하기위함
		
		Chrismas.set(2022,11,25); // 2020.12.25.
		diff=Chrismas.getTimeInMillis()-today.getTimeInMillis();
		System.out.println("크리스마스 까지 남은 날 : " + diff/(24*60*60*1000));
}
}