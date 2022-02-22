package day073;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Fomat2 {

	public static void main(String[] args) {
		Date day = new Date();
		String patternKorea = "yyy-MM-dd";
		String patternUSA = "MM-dd-yyyy";
		String patternUK = "dd-mm-yyyy";
		String pattern1 = "E요일 HH시 mm분 ss초";
		
		SimpleDateFormat p1 = new SimpleDateFormat(patternKorea); // 내가 원하는 형식을 지정하는 것임
		SimpleDateFormat p2 = new SimpleDateFormat(patternUSA);				
		SimpleDateFormat p3 = new SimpleDateFormat(patternUK);	
		SimpleDateFormat p4 = new SimpleDateFormat(pattern1);
		
		System.out.println("현재날짜 : "+day);
		System.out.println("한국형식(년,월,일) : " +p1.format(day));
		System.out.println("미국형식(월,일,년) : " +p2.format(day));
		System.out.println("영국형식(일,월,년) : " +p3.format(day));
		System.out.println("pattern1"+p4.format(day));
		
	}

}
