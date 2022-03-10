package pm4;

public class This2 {

	public static void main(String[] args) {
		// 명시적으로 This 를 붙여야 하는 경우
		
		X x = new X();
		Y y = new Y();
		
		x.intt(5,10);
		y.intt(2,3);
		
		System.out.println(x.m); //this 를 사용하지 않은 x는 값이 지정되지 않았다.
		System.out.println(x.n); //this 를 사용하지 않은 x는 값이 지정되지 않았다.
		System.out.println("---절취선---");
		System.out.println(y.m);
		System.out.println(y.n);

	}

}

class X {
	int m; //전역변수 - 자동으로 초기값이 0 으로 셋팅됨
	int n; //전역변수
	void intt(int m,int n) { // 5,10
		m=m; //의미 5 = 0 이라는 공식이 된다
		n=n; //의미 10 = 0 이라는 공식이 된다
	}
}

class Y {
	int m;
	int n;
	void intt(int m,int n) { // 2,3
		this.m=m; //this 에는 호출한 객체 명이 온다. 즉 이건 y.m 이 된다
		this.n=n; //this 에는 호출한 객체 명이 온다. 즉 이건 y.n 이 된다
	}
}