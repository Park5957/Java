package day065;

public class Upcasting2 {

	public static void main(String[] args) {
		A obj = new B(); // �θ� ������ = �ڽİ� : ��ĳ����
		obj.methodA();
//		obj.methodB(); // �����߻� �޼���B �� ���ǵ��� �ʾұ� ����
	}

}

class A {
	void methodA() {
		System.out.println("methodA");
	}
}

class B extends A {
	void methodB() {
		System.out.println("methodB");
	}
}