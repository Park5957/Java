package pm4;

public class Constructor_retrining {

	public static void main(String[] args) {
		/* 생성자 constructor
		 * 객체를 최초로 생성할 때 자동으로 호출되어 실행된다.
		 * 1. 생성자는 반드시 클래스 명과 동일한 이름이어야 한다.
		 * 2. 생성자는 리턴타입도 없고 리턴도 없다.
		 * 
		 * 개발자가 생성자를 직접 만들지 않으면
		 * 자바의 기본 생정자 default constructor 를 자동으로 생성해 준다.
		 * 
		 * 생성자가 하나라도 있으면 자바는 기본생성자를 추가로 만들지 않는다.
		 */
		
		AA a = new AA();
		BB b = new BB();
		J j = new J(3);
		
		a.work();
		b.work();
		a.m = 10;
		a.work();
		System.out.println("---절취선---");
		j.workd();

	}

}

class AA {
	// 기본생성자를 만들지 않았기 때문에 자바가 시본 생성자를 만든다.
	int m;
	void work() {
		System.out.println(m);
	}
}

class BB {
	BB(){
		// 아무런 기능이 없는 대폴트 생성자
	}
	int m;
	void work() {
		System.out.println(m);
	}
}

class J {
	J(int a) {
		m = a; // 사용자가 지정해서 만든 생성자.
	}
	int m;
	void workd() {
		System.out.println(m);
	}
}