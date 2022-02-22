package day058;

public class Arithmetic_Operator {

	public static void main(String[] args) {
		System.out.println(sum(10,20));
		System.out.println(sud(10,20));
		System.out.println(mu1(10,20));
		System.out.println(div(10,20));
		//실수형 출력	
		System.out.println(sum(1.2,1.3));
		System.out.println(sud(1.2,1.3));
		System.out.println(mu1(1.2,1.3));
		System.out.println(div(1.2,1.3));
		
		System.out.println(sum("hello : ","world"));
	
	}
	//정수형 사칙연산 - 중간에 시스템프린트 인을 추가하지 않은 이유는 위에서 명령으로 출력하기 위함
	static int sum(int x, int y) {return(x+y);}
	static int sud(int x, int y) {return(x-y);}
	static int mu1(int x, int y) {return(x*y);}
	static int div(int x, int y) {return(x/y);}
	
	//실수형의 사칙연산
	static double sum(double x, double y) {return(x+y);}
	static double sud(double x, double y) {return(x-y);}
	static double mu1(double x, double y) {return(x*y);}
	static double div(double x, double y) {return(x/y);}
	//문자열 덧겜연산
	static String sum(String x, String y) {return (x+y);}

}
