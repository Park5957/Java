package day067;

public class Interface1 {

	public static void main(String[] args) {
		//인터페이스는 객체 생성이 변경이 불 가능 하며 지정된 값에 대한 변경이 불가능
		B b=new B(); // 이건 생성된 클래스를 객체로 형성한 것임
		b.methodA();
		b.methodB();
	}

}

interface Ainter{
	final int x=10;
	int y=20; // final 은 생략이 가능하다.
	abstract void methodA();
	void methodB(); // abstract 의 생략이 가능하다.
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