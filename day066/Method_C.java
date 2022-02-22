package day066;

public class Method_C {

	public static void main(String[] args) {
		//추상 메서드
		/* 전언부만 정의하고 구체적인 내용은 비워 놓은 메서드
		 * 주의점
		 * 추상메서드가 있는 클래스를 상속받은 자식 클래스는 반드시 부모 클래스의 추상메서드를 구현해야 한다
		 * 구현방법
		 * abstract 리턴타입 메서드명();
		 * {}가 없는 이유는 내용을 비워두었기 때문
		 */
		
		//추상 클래스
		/* 추상 메서드를 맴버(필드로)로 갖는 클래스
		 * 주의할 점
		 * 추상 클래스는 일반 메서드 필드에 존재ㅐ 가능
		 * 단, 추상 메서드를 하나라도 포함해야 함
		 * 객체를 생성할 수 없다.
		 * 구조
		 * abstract class 클래스명{ ... abstract 리턴타입 메서드명();} 
		 */
		
		/* 추상 클래스의 목적
		 * 주현은 자식 클래스가 하도록 메서드의 기능을 비워놓고 싶을 때 사용함
		 * 
		 * 예시
		 * 도형 class - draw(): 그리다
		 * 
		 * 사각형 class - draw(): 사각형을 그리다
		 * 원 class - draw(): 원을 그리다
		 * 선 class - draw(): 선을 그리다
		 */
		
		/*추상 클래스 제작의 예시
		 * abstract class Aclass {
		 *          abstract void f1();
		 *          }
		 *          
		 *          class B extends Aclass {
		 *                          void f1() {
		 *                          system.out.println("f1()");
		 *                          }
		 *                          abstract void f2():
		 * }
		 * 위 예시 포인트
		 * 추상 클래스 f1 이 존재함으로 클래스 B 에서는 추상 클래스 f1을 표시해야함
		 * 마지막 줄 추상클래스 f2는 추상 클래스가 하나 더 존재 가 가능하다는 것을 표시하는 것
		 */
	

	}

}