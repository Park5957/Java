package day065;

public class Upcasting2 {

	public static void main(String[] args) {
		A obj = new B(); // 부모 변수명 = 자식값 : 업캐스팅
		obj.methodA();
//		obj.methodB(); // 에러발생 메서드B 는 정의되지 않았기 떄문
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