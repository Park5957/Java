package pm7;

public class Abstract_retrining {

	public static void main(String[] args) {
		// Abstract
		/* Abstract method && Abstract Class
		 * 
		 * 추상 메서드 : 
		 * 		중괄호가 없는 매서드, 매서드의 기능이 정의되지 않는다.
		 * 		; 으로 종료
		 * 		
		 * 		예시)
		 * 		abstract 리턴타입 매서드명
		 * 
		 * 아래의 코드는 사용하지 않았을 때 형태이다.
		 * Animal animal1 = new Cat();
		 * animal1.cry(); // 야옹
		 * 
		 * Animal animal2 = new Dog();
		 * animal2.cry(); // 멍멍
		 * 
		 * 다형적 표현을 사용할때도 cry() 매서드를 호출한다.
		 *  
		 * class Animal {
		 * 		void cry(){
		 * 			  } // 위 코드처럼 딱히 기능을 구현하지 않음 -> 추상 매서드로 정의하는 것이 효율적이다.
		 * 		}	  // 추상 메서드를 포함하는 클래스는 반드시 추상 클래스로 정의해야한다.
		 * 			  // 추상 클래스도 클래스 이므로 상속을 할 수 있다.
		 * 			  // 추상 클래스로는 객체를 생성할 수 없다.(구체화가 되어있지 않기 때문이다.)
		 * class Cat extends Animal{
		 * 		void cRy(){
		 * 		System.out.print("야옹");
		 * 			}
		 * 		}
		 * 
		 * class Dog extends Animal{
		 * 		void cry(){
		 * 		System.out.print("멍멍");
		 * 			}
		 * 		}	
		 * 
		 * 
		 * 추상 매서드의 장점
		 * 일반 클래스로 정의 했을 때와 추상 클래스로 정의 했을 때
		 * 자식 클래스에서 cry() 매서드를 오버라이딩 하는 과정에서 만약에
		 * 
		 * 오타가 발생 했다고 가정할 시  CRy()
		 * 위 코드의 class Cat 와 같은 상황
		 * 
		 * 이때 일반 클래스를 상속한 자식 클래스에서는 오버라이딩이 아니라
		 * 추가로 새로운 매서드를 정의한 결과가 된다.
		 * 따라서 cry() CRy() 2개의 매서드가 존재하게 된다. 이런경우 객체를 생성하고
		 * cry() 매서드를 호출해도 아무것도 출력되지 않는다.
		 * 
		 * 부모의 cry() 매서드에는 아무것도 정의되지 않았기 때문이다.
		 * 
		 * 자식 클래스가 오버라이딩 하려고 하는 과정에서 오타가 발생하면 문법 오류가 발생한다.
		 * 그 이유는 추상 클래스를 상속하면 추상 매서드도 상속을 받기 때문이다.
		 * 
		 * 결론적으로는 가장 큰 이유는
		 * 추상클래스와 추상메서드를 사용함으로 자식 클래스의 상속받는 매서드의 문법오류를 찾아내기가 용의하다.
		 * 이는 협업의 진행할 시 중요한 역할을 하게 된다.
		 * 
		 * 아래의 코드가 추상 클래스와 매서드를 사용하여 변경한 코드이다.
		 */
		
		 Animal animal1 = new Cat();
		 animal1.cry(); // 야옹
		  
		 Animal animal2 = new Dog();
		 animal2.cry(); // 멍멍

	}

}
// 추상 클래스 && 메서드 작성법
abstract class Animal {// 추상 클래스 선언
	abstract void cry(); // 추상 매서드 선언 
	  		}
	  class Cat extends Animal{
	  		void cry(){
	  		System.out.println("야옹");
	  			}
	  		}
	  class Dog extends Animal{
	  		void cry(){
	  		System.out.println("멍멍");
	  			}
	  		}
	  
		/* 추상 클래스
		 * 추상 매서드는 매서드의 본체가 없는 미완성의 이름뿐인 매서드이다.
		 * 구성내용은 이름만 존재할 뿐이기에 {} 가 존재하지 않는다.
		 * 
		 * 추상 클래스의 특징
		 * 추상 클래스는 미완성 매서드이기 때문에 객체 생성이 불가능하다.
		 * 
		 * 즉, 추상클래스 a = new 추상클래스(); 는 성립할 수 없다.
		 * 그렇기에 매서드를 설정한 자식 클래스를 사용해 객체를 생성한다.
		 * 
		 * 추상클래스 a = new 자식클래스(); 로 객체를 생성한다.
		 * 
		 */
	  