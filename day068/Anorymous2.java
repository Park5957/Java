package day068;

public class Anorymous2 {

	public static void main(String[] args) {
		Inter1 it = new Inter1() { // 객체를 구현할 수 없는 인터페이스를 익명클래스 사용으로 1회용 생성을 하는 것

			@Override
			public void f1() {
				System.out.println("inter imple fi()");	
			}};
			it.f1();
	}

}
interface Inter1{
	void f1();
}