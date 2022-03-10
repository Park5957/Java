package pm4;

public class This {

	public static void main(String[] args) {
		// this 키워드 (파이썬 self)
		// 모든 메서드에는 자신이 포함된 클래스의 객체를 가르키는 this 가 있다.
		// this 는 생략이 가능하다. 묵시적으로 사용된다.
		// this. 생략해도 항상 자바에서 자동으로 추가를 해주고 있으나
		// this.를 명시적으로 꼭 직접 붙여줘야 할때도 있다.
		
		Z z = new Z();
		z.work(); // z를 호출
		System.out.println(z.m);
		System.out.println(z.n);
		System.out.println(z.m + z.n);
	}

}

class Z {
	int m;
	int n;
	void intt(int a, int b) {
		int c;
		c = 3;
		this.m = a; //this 키워드를 생략하면 자동으로 추가된다.
		this.n = b; //this 키워드를 생략하면 자동으로 추가된다.
	}
	void work() {
		this.intt(2,3);
	}
	
}