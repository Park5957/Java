package pm5;

public class Static {

	public static void main(String[] args) {
		/* static 제어자
		 * static은 필드, 메서드, 이너클래스에 사용되는 제어자이다. 지금까지는 클래스의 맴버
		 * 를 다른 클래스에서 사용하기 위해서는 먼저 객체를 생성하고 사용해왔다.
		 * 
		 * 객체로 사용할 수 있는 상태가 되는 맴버를 인스턴스 맴버 instance member 라고 한다.
		 * 다시 말하면 인스턴스 맴버는 맴버 앞에 static 이 붙지 않은 것을 말한다.
		 * 
		 * 반면 static 이 붙은 맴버들은 정적 맴버 static member 라고 부른다.
		 * 정적 맴버의 가장 큰 특징은 객체 생성 없이 "클래스명.정적맴버명" 만으로 접근 가능하다.
		 * 물론 정적 맴버도 객체생성 후에도 객체를 통해서 사용할 수 있다.
		 * 하지만 핵심적인 부분은 객체 생성없이 사용 가능하다는 것이다.
		 * 
		 * 반드시 시억해야 할 static 의 특징은  "static 은 객체들 간의 공유 변수의 성질을 가진다"
		 * 
		 * 정적 변수는 클래스 변수라고도 한다.
		 */
		
		Q q1 = new Q();
				
		System.out.println(q1.m);
		System.out.println(q1.n);
		
		System.out.println("---절취선---");
		System.out.println(Q.n); //객체생성 없이 직접적으로 접근이 가능다.
//		System.out.println(Q.m); //이와 다르게 m 은 객체를 통해서 접근이 가능하다.
		
		System.out.println("---절취선---");
		Q q2 = new Q();
		q1.m =5;
		q2.m =6;
		System.out.println(q1.m);
		System.out.println(q2.m);
		
		System.out.println("---절취선---");
		q1.n =7;
		q2.n =8;
		Q.n = 9;
		System.out.println(q1.n);// 결과값 9
		System.out.println(q2.n);// 결과값 9
								 // static으로 이루어진 값은 객체들도 공유하기 때문에
								 // 마지막 Q.n 의 변경이 적용된다.
		
	}

}

class Q {
	int m =3;
	static int n = 5; //정적필드
}