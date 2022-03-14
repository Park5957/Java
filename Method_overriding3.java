package pm6;

public class Method_overriding3 {

	public static void main(String[] args) {
		
		AA a = new AA();
		a.print();
		a.print2();
		
		System.out.println("---절취선---");		
		BB b = new BB();
		b.print();
		b.print2(); // AA 클래스의 print2(); 가 적용된다.
		b.print2(3);
		
		System.out.println("---절취선---");		
		AA c = new BB();
		c.print();
		c.print2(); // AA 클래스의 print2(); 가 적용된다.
//		c.print(3); // 에러 오버로딩이 안됨.
		

	}

}

class AA {
	void print() {
		System.out.println("AA 클래스 print 1");
	}
	void print2() {
		System.out.println("AA 클래스 print 2");
	}
}

class BB extends AA {
	@Override //표식을 함으로 다른 사람들이 알아볼 수 있도록 한다. 딱히 기능은 없다.
			// Annotation 은 컴퓨터도 읽는 주석이다.
	void print() { //<-- 메서드 오버 라이딩
		System.out.println("BB 클래스 print 1");
	}
	void print2(int a) { //<-- 메서도 오버 로딩
		System.out.println("BB 클래스 print 2");
	}
}