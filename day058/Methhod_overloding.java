package day058;

public class Methhod_overloding {

	public static void main(String[] args) {
		/* 오버로딩이란?
		 * 매개변수의 개수와 타입은 타르지만 이름이 같은 매서드를 여러개 정의 하는 것
		 * 
		 */
		sum(10,20);
		sum(1.23,3.12);
		sum(10,20,30);
		//같은 매서드 수식을 여러개 만들어 하나의 이름으로 통합하여 관리 할 수 있음
	}
	
	static void sum(int x, int y) {
		System.out.println(x+y);
	}
	static void sum(double x, double y) {
		System.out.println(x+y);
	}
	static void sum(int x, int y, int z) {
		System.out.println(x+y+z);
		
	}

}
