package pm6;

public class Inheritance_retrining3 {

	public static void main(String[] args) {
		// 객체의 다형적 표현
		
		F a1 =new F();
		F a2 =new B();
		F a3 =new C();
		F a4 =new D();
		
//		B b1 =new F(); //이 형태는 에러가 발생한다.
		B b2 = new B();
		B b3 = new C();
		B b4 = new D();
		
		C c1 = new C();
//		C c2 = new D(); // 같은 B의 상속관계일 뿐이기에 불가능하다.		
		
		
		
		}
	}

class F {}
class B extends F{}
class C extends B{}
class D extends B{}