package day070;

public class Try {

	public static void main(String[] args) {
	// throw 와 throws
	//  예외를 본인이 처리하는 것 과 예외를 다른사람에게 처리하라고 넘기는 것	
		try {
			Exception e =new Exception ("고의 예외");
			throw e; //고의적으로 예외를 던지겠다
		}
		catch (Exception e) {
			System.out.println("예외발생");
			System.out.println(e.getMessage());
		}
	} 
}
