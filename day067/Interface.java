package day067;

public class Interface {

	public static void main(String[] args) {
	// 상호작용 매개역할
		//클래스가 설계도 라면 인터페이스는 규착
		/* 인터페이스 맴버
		 * 상수 : final 타입 변수명 = 값;
		 * 추상메서드 : abstract 리턴 타입 메서드명();
		 * 
		 * 인터체이스의 구현 방법
		 * interface 인터페이스명 { 이곳에는 상수 또는 추상메서드가 오면됨 };
		 */
		
		/* 클래스로 인터페이스 구현
		 * interface 인터페이스명 {}
		 * class 클래스명 implements 인터페이스명 {추상메서드 구현}
		 */
		
		/* 주의 할 점
		 * 인터페이스 내 일반 메서드 불가
		 *           변수 불가(상수만 가능)
		 *           객체 생성 불가
		 *           내 맴버 매서드 abstract와 final의 생략이 가능
		 */

	}

}
