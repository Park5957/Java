package day075;

import java.text.DecimalFormat;

public class Formatting {

	public static void main(String[] args) {
//		데이터의 형식을 지정하는 것을 의미
		/*
		 * DecimalFormat 숫자를 형식화 하는 클래스
		 * 
		 * # 있으면 출력
		 * , 콤마를 넣음
		 * 0 없으면 0으로 채움
		 * E 지수 기호
		 * . 소수점 
		 * % 퍼센트 
		 * - 음수
		 * 기호를 붙임
		 */

		String[] pattern = { "###.###", "000.000", "-###.###", "000000.00%" };
		double[] arr = { 1.3, 3.33, 124, 243, 242 };

		for (int p = 0; p < pattern.length; p++) {
			DecimalFormat d = new DecimalFormat(pattern[p]);
			System.out.println("<<<" +pattern[p]+">>>");
			for (int i=0; i<arr.length;i++) {
				System.out.println(d.format(arr[i]));
			}
		}

	}

}
