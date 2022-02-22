package day062;

public class Class_class {

	public static void main(String[] args) {
		// 객체 타입의 배열
		/*
		 * 같은 클래스로 나열된 배열 ex) 클래스명 객체배열명[] = new 클래스명 [크기]; Aclass ar[] = new Aclass[3];
		 */

		Aclass ar[] = new Aclass[3]; // 배열의 틀을 생성
		ar[0] = new Aclass(); // ****** 해당 배열 위치에 클래스 이식 ******
		ar[0].x = 100;
		ar[0].f1();

	}
}

class Aclass {
	int x;

	void f1() {
		System.out.println("f1()");
	}
}