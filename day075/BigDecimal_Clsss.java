package day075;

import java.math.BigDecimal;

public class BigDecimal_Clsss {

	public static void main(String[] args) {
		/* BigDecimal_Clsss
		 *  정확한 소수점 연산을 해야할 때 사용
		 */
		double a = 24.3953;
		double b = 50.343998;
		System.out.println(a+b);
		
		BigDecimal number = new BigDecimal(String.valueOf(a));
		BigDecimal number2 = new BigDecimal(String.valueOf(b));
		System.out.println(number.add(number2));
	}

}
