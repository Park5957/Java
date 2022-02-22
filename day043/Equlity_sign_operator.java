package day043;

public class Equlity_sign_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=3.14;
		double b=5.15;
		System.out.println(a==b); //a와 b는 같은가?
		System.out.println(a!=b); //a와b 는 다른가/
		
		String c1="Hello JAVA!";
		System.out.println(c1=="Hello JAVA!");
		//문자열을 비교할 시에는 == 을 사용하지 않는다(출력은 됨)
		System.out.println(c1.equals("Hello JAVA!"));
		//문자를 비교할 시 equals 를 사용함
		System.out.println(c1.equals("hello java!"));
		//

	}

}
