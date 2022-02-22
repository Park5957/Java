package day073;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date2 {

	public static void main(String[] args) {
	//	Calendar a = new Calendar(); 이건 안됨. 객채생성 불가한 요소임
		Calendar a = Calendar.getInstance(); // 싱글패턴
		Calendar b = new GregorianCalendar(); // 같은 싱글패턴 사용시 인폴트 해야함.
		System.out.println(a.toString()); //시작 날 부터 얼마만의 시간이 지났는지 확인하기 위한 방법
		System.out.println(b.toString());

	}

}
