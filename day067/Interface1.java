package day067;

public class Interface1 {

	public static void main(String[] args) {
		//�������̽��� ��ü ������ ������ �� ���� �ϸ� ������ ���� ���� ������ �Ұ���
		B b=new B(); // �̰� ������ Ŭ������ ��ü�� ������ ����
		b.methodA();
		b.methodB();
	}

}

interface Ainter{
	final int x=10;
	int y=20; // final �� ������ �����ϴ�.
	abstract void methodA();
	void methodB(); // abstract �� ������ �����ϴ�.
}
class B implements Ainter{

	@Override
	public void methodA() {
		System.out.println("methodA");
	}

	@Override
	public void methodB() {
		System.out.println("methodB");
	}
	
}