package day073;

import java.util.Calendar;

public class Date3 {

	public static void main(String[] args) {
		Calendar a = Calendar.getInstance();

		int year = a.get(Calendar.YEAR); // a를 가지고 온다. 연도에 대한 필드 번호를 기입 해도 괜찮음
											// 하지만 필드번호를 모르니 YEAR 라는 Fianl 변수를 가지고 옴
		int month = a.get(Calendar.MONTH) + 1; // 1월:0~ 12월:11 이기 때문에 +1을 시켜줘야 정상적으로 확인이 가능하다.
		int date = a.get(Calendar.DATE);
		
		System.out.println(year + "년" + month + "월" + date + "일");
		System.out.print("오늘은 이번주에서 몇 번째 일인가 : "); // 계산은 일 월화수목금토 로 진행됨
		System.out.println(a.get(Calendar.DAY_OF_WEEK));
		
		System.out.print("이번 년도에서 오늘이 몇 일째 인가 :");
		System.out.println(a.get(Calendar.DAY_OF_YEAR));
		
		System.out.print("이번 달은 며칠까지 있는가 : ");
		System.out.println(a.getActualMaximum(Calendar.DATE));
	}

}
