package pm7;

public class Fianl_retrining2 {

	public static void main(String[] args) {
		// final method 와 final class
		
		/* final 변수는 변수가 저장된 값이 최종값의 의미를 가진것처럼 final 매서드와 final 클래스도
		 * 각각 최종 매서드 최종 클래스의 의미를 갖는다.
		 * 
		 * 최종 매서드의 의미는 상속할 때 부모의 매서드를 모버라이딩 하면 자식 클래스에서는
		 * 매서드의 기능이 변경된다.
		 * 
		 * final 매서드는 매서드의 기능을 변경할 수 없는 매서드
		 * 즉, 매서드를 final 선언하면 자식클래스에서 해당 매서드를 오버라이딩 할 수 없다.
		 * 
		 * class A {void abc(){} final void bcd(){}}
		 * class B extends A {void abc(){} // 부모의 abc() 매서드를 오버라이딩
		 * 					 void bcd(){} //에러발생 불가능. 부모의 매서드에 final 이 걸려있기 때문
		 * 					}
		 */
		
		/* final class 를 지정하게 된다면 상속이 불가능하게 된다.
		 * 
		 * final class AAA{}
		 * class BBB extends AAA {} // 에러발생.
		 * 
		 * 
		 * 
		 */

	}

}

 class AA {void abc(){} final void bcd(){}}
 class BB extends AA {void abc(){} // 부모의 abc() 매서드를 오버라이딩
// 					 void bcd(){} //에러발생 불가능. 부모의 매서드에 final 이 걸려있기 때문
 					}
 
 