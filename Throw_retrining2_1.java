package pm10;

public class Throw_retrining2_1 {
	
	public void sayNick(String nick) {
		if ("fool".equals(nick)) {
			return;
		}
		System.out.println("당신의 별명은 "+nick+"입니다.");
	}

	public static void main(String[] args) {
		
		Throw_retrining2_1 smp = new Throw_retrining2_1();
		smp.sayNick("fool");
		smp.sayNick("genious");
		
		// 위와 같은 형태에서 fool이 입력이 된다면 프로그램이 종료되며 별명이 출력되지 않고 있다.
		// 이를 return으로 종료시키지 않고 변경을 하도록 하자.
		// 이는 Throw_retrining2_2에서 확인할 수 있다.
		
		

	}

}
