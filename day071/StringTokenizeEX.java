package day071;

import java.util.StringTokenizer;

public class StringTokenizeEX {

	public static void main(String[] args) {
	// 문자열 생성
		 String str = "kim:010-123-234";
		 String delim=":";
		 StringTokenizer st = new StringTokenizer(str,delim);
		 
		 System.out.println(st.nextToken());
		 System.out.println(st.countTokens());
		 System.out.println(st.hasMoreTokens());

		 System.out.println(st.nextToken());
		 System.out.println(st.countTokens());
		 System.out.println(st.hasMoreTokens());
	}

}
