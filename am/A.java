package am;

public class A {
	public int m = 3;
	public int n = 4;
	public void print() {
		System.out.println("임포드");
	}
	public static void main(String[] args) {
		B b = new B();
		b.print(); // 같은 클래스 안에서는 public 이 없어도 사용할 수 있다.
		
	}
	}
	


class B{ // 외부클래스 B 는 public 선언이 불가능하다.
	int m = 3;
	int n = 4;
	
	void print() {
		System.out.println(m+" "+n);
	}
}


class D{
	public    int a = 1;
	protected int b = 2;
			  int c =3; //default
	private   int d =4;
	void abc(){ //default
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println();
				
		}
	
}