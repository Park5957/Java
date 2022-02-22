package day070;

public class Exception2 {

	public static void main(String[] args) {
		// 이과정을 통해서 메서트 C 까지 연속적으로 호출을 하였으니 C 부터 역순으로 처리자를 변경함
		// 결과적으로 메인 메서드에서 캐치를 실행하게 된 코드

		try {
			methodA();
		}
		catch (Exception e) {
			System.out.println("메인에서 처리");
		}

	}
	public static void methodA() throws Exception { methodB();}
	public static void methodB() throws Exception { methodC();}
	public static void methodC() throws Exception { Exception e = new Exception();
			throw e;
	}

	
}
