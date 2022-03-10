package pm4;

public class Class_retrining3 {

	public static void main(String[] args) {
		B b = new B();
		b.printFieldValue();
		b.m3 = 1.2;
		System.out.println(b.m3);
		b.printFieldValue();
	}
}


class B {
	boolean m1;
	int m2;
	double m3;
	String m4;
	void printFieldValue() {
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		
	}
	void printLocalValue() {
		int k;
//		System.out.println(k); //지역 변수를 초기화 하지 않으면 오류가 발생한다.
		//자바 문법은 서로 얽히고 설켜 있어서 하나를 설명하다보면 아직 배우지 않은
		//뭔가를 먼저 얘기해야 할때가 있다.
	}
}
