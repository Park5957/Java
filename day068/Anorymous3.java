package day068;

public class Anorymous3 {

	public static void main(String[] args) {
		Abs ab =new Abs() { // 본 실습은 추상 클래스를 익명클래스로 메서드를 하여 진행 하는 것

			@Override
			void f2() {
				System.out.println("Abstract extends f2()");
				
			}
			
		};
		ab.f2();
	

	}

}
abstract class Abs {
	abstract void f2();
}