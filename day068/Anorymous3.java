package day068;

public class Anorymous3 {

	public static void main(String[] args) {
		Abs ab =new Abs() { // �� �ǽ��� �߻� Ŭ������ �͸�Ŭ������ �޼��带 �Ͽ� ���� �ϴ� ��

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