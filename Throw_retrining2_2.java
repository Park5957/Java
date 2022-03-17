package pm10;

public class Throw_retrining2_2 extends RuntimeException {
	// 디폴트 생성자를 자동으로 만들어 준다.
	// 상속을 받고 있음으로 자동으로 부모의 생성자를 호출한다. super();
	// 이는 Throw_retrining 에서 풀어 적은것을 축약한 것이다.
	
	// 만일 RuntimeException 이 아닌 Exception 이었다면 실행조차 안되었을 것이다.
	
	public void sayNick(String nick) {
		if ("fool".equals(nick)) {
			throw new Throw_retrining2_2(); //이것으로 인해 fool을 에러로 바꿔버렸다.

			
		}
		System.out.println("당신의 별명은 "+nick+"입니다.");
	}

	public static void main(String[] args) {
		
		Throw_retrining2_2 smp = new Throw_retrining2_2();
		smp.sayNick("fool");//fool의 예외발생으로
		smp.sayNick("genious");//genious는 실행조차 안됨.
		
		// 던지기 변경은 Throw_retrining2_3 으로 확인.
		
		

	}

}
