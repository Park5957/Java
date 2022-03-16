package pm9;

public class Exception2 {

	public static void main(String[] args) {
//		예외 처리 문법은 크게 3가지 요소로 구성된다.
//		try {//일반예외, 실행 예외 발생가능 코드
//			}
//		catch(예외명) { // 예외가 발생했을 때 처리
//		}
//		finally { //예외 발생 여부와는 관계없이 항상 언제나 실행
//		}
		 
		
		try {
			System.out.println(3/0);
		}
		catch(ArithmeticException e) {
			System.out.println("숫자는 0으로 나눌수 없습니다.");
		}
		finally {
			System.out.println("프로그램을 종료합니다.");
		}
		
		
//		예외처리 과정
//		실제 내부적으로 예외가 처리되는 과정을 확인해 보도록 하자.
		
//		try {System.out.println(3/0);}
					//예외가 발생 --> 자바(예외 클래스로 객체생성) --> catch
								//ArithmeticException excep = new ArithmeticException;
//		catch(ArithmeticException e) {System.out.println("숫자는 0으로 나눌수 없습니다.");}
//		finally {System.out.println("프로그램을 종료합니다.");	}
		
//		최초 try 구문이 생행되어 만약 예외가 발생하지 않으면 catch는 실행되지 않는다.
//		그리고 finally 블록 구문을 실행한다.

//		그런데 try 구문이 실행되어 예외가 발생한다면 자바가 먼저 이를 인지하여 예외타입 객체를 생성하여
//		catch의 매개변수로 전달한다.
//		이것은 마치 자바가 catch() 라는 이름의 매서드를 호출하는 것과 비슷하다.
//		만약 자바가 생성해서 넘겨준 객체 타입을 catch 블록이 처리 할 수 없을때
//		즉 해당 객체를 받을 catch() 블록이 존재하지 않으면 예외처리가 되지 않는다.

//		위 설명은 이론을 이야기 할 뿐 메서드 라는건 아니다.		

//		catch 는 상황에 따라 여러개를 포함할 수 있다.
		
//		try {//일반예외, 실행 예외 발생가능 코드
//		}
//		catch(예외명1) { // 예외가 발생했을 때 처리
//		}
//		catch(예외명2) { // 예외가 발생했을 때 처리
//			}
//		finally { //예외 발생 여부와는 관계없이 항상 언제나 실행
//		}
		
		
//		다중 try-catch
		
		try {
			System.out.println(3/0);
			int num = Integer.parseInt("10A");
		}
		catch(ArithmeticException e) {
			System.out.println("숫자는 0으로 나눌수 없습니다.");
		}
		catch(NumberFormatException e) {
			System.out.println("숫자로 바꿀수 없습니다.");
			}
		finally {
			System.out.println("프로그램을 종료합니다.");
		}
		
		// 위 코드에서 System.out.println(3/0); 의 에러가 선 발동함으로
		// catch System.out.println("숫자는 0으로 나눌수 없습니다."); 만 발동하고 
		// finally 발동후 종료된다.
		
		// 동시처리 하는 방법.
		
		try {
			System.out.println(3/0);
			int num = Integer.parseInt("10A");
		}
		catch(ArithmeticException | NumberFormatException e) {
			
			System.out.println("예외가 발생했습니다.");
		}
		
		finally {
			System.out.println("프로그램을 종료합니다.");
		}
		
//		finally 는 항상 실행되는 블록이다. 그런데 또 다른 기능이 있다.
//		리소스를 해제 하는 것이다.
//		더 이상 사용하지 않는 자원을 반납한다는 것인데
//		예를 들어 파일을 열어서 사용한 뒤에 닫아야 다른 프로그램이 이 파일을 사용할 수 있다는 것이다.
//		finally {} 블록에서 리로스를 해헤하는 역할로도 사용이 된다.
	}

}
