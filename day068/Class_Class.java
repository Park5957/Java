package day068;

public class Class_Class {

	public static void main(String[] args) {
		/* 내부클래스
		 *   클래스 내부에서 생성된 클랙스
		 *   
		 *   구조
		 *   class OuterClass{ class InerClass{} }
		 *   
		 *   목적
		 *   클래스간의 관계가 긴밀할 때 사용하여 코드를 간경하게 하기 위해 사용
		 *   
		 *   종류
		 *   내부 클래스 선언의 위치에 따라 인스턴스, 스태틱, 지역, 익명
		 *   
		 *   인스턴스  	class OuterClass{ class InerClass{} }
		 *   스태틱   	class OuterClass{ static class InerClass{} }
		 *   지역			class OuterClass{ void A(){ InerClass{} }}
		 *   
		 *   접근제어 구조
		 *   class OuterClass{
		 *    private class InerClass{}
		 *     protected class InerClass{}
		 *      }
		 */
	}

}
