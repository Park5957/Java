package day068;

public class Anorymous2 {

	public static void main(String[] args) {
		Inter1 it = new Inter1() { // ��ü�� ������ �� ���� �������̽��� �͸�Ŭ���� ������� 1ȸ�� ������ �ϴ� ��

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