package pm10;

// 예외 던지기
//예외가 발생했을 때 그 위치에서 바로 예뢰처리를 할 수도 있지만
//호출한 지점으로 예외를 던질수도 있다. throws
//예외가 발생하면 2가지 해결책이 있다. try-catch 를 이용하거나 예외를 던지는 것이다.

//예외를 던지는 기본 문법
//리턴 타입 매서드명(변수) throws 예외 클래스명{}

//void abc() {
//	try{
//	bcd()
//	}
//	catch (예외 클래스타입){
//	//예외 처리
//	}
//}
//void bcd() throws //예외 클래스타입{ 
//	//예외발생을 호출한 지점으로 던지기
//}

public class Throws_retrining {

	public static void main(String[] args) {

		A a = new A();
		a.abc();
	}

}

//class A {
//	void abc() {
//		bcd();
//	}
//
//	void bcd() {
//		try {
//			System.out.println("start");
//			Thread.sleep(1000);
//			System.out.println("stop");
//		} catch (InterruptedException e) {
//
//		}
//
//	}
//
//}

// 2개의 매서드 abc() 와 bcd() 가 있고 bcd()매서드의 내부에는 예외 발생 가능 코드가 포함되어있다.
// Thread.sleep()은 일반 예외가 발생할 수도 있기 때문에 매서드 사용을 위해서는
// 반드시 예외 처리를 해야만 한다.
// 하지만 bcd()메서드가 직접 예외 처리를 하는 대신 자신을 호출한 메서드로 던지게 된다.
// 즉, abc() 메서드가 예외를 처리해야만 한다.

class A {
	void abc() {
		try {
			bcd();
		} catch (InterruptedException e) {
		}

	}

	void bcd() throws InterruptedException  {
		System.out.println("start");
		Thread.sleep(1000);
		System.out.println("stop");

	}

}

// 왜 Thread.sleep() 메서드는 예외처리를 필수로 해야하는 건가?
// 이 메서드 뿐만 아니라 예외 처리가 필수인 메서드가 존재한다. 그렇기에 위와 같은 방식이 필요한 것이다.

