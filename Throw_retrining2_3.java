package pm10;

public class Throw_retrining2_3 extends RuntimeException {

	public void sayNick(String nick) {

		try {
			if ("fool".equals(nick)) {
				throw new Throw_retrining2_3(); // 이것으로 인해 fool을 에러로 바꿔버렸다.
			}
			System.out.println("당신의 별명은 " + nick + "입니다.");
		} catch (Throw_retrining2_3 e) {
			System.out.println("Throw_retrining2_3가 발생했습니다.");
		}

	}

	public static void main(String[] args) {

		Throw_retrining2_3 smp = new Throw_retrining2_3();
		smp.sayNick("fool");   // 예외 메세지로 처리됨.
		smp.sayNick("genious");// 정상적으로 실행됨.
		
		//main에서의 throw 처리는 Throw_retrining2_4 에서 확인. 

	}

}
