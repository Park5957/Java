package day068;

public class Inner4 {

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		System.out.println("OuterClass 의 a의 값 : " + oc.a);
		System.out.println("OuterClass 의 b의 값 : " + OuterClass.b);
		//스테틱 클래스는 객체를 생성하지 않아도 접근이 가능하다는 예시가 b의 값이다.
		
		System.out.println("===inner 클래스 접근하지===");
		OuterClass oc2 = new OuterClass();
		OuterClass.Inner i=oc2.new Inner();
		/* 내부클래스 객체 생성방법
		 * 외부클래스.내부클래스 객체명 = new 외부클래스생성자().내부클래스생성자();
		 * 						 외부클래스객체.new 내부클래스생성자();
		 */
		System.out.println("Inner의 c의 값 : "+i.c);
		i.innerMethod();
		
		OuterClass.StartcInner si = new OuterClass.StartcInner();
		System.out.println("StacicInner의 d의 값 : "+si.d);
		
		si.StaticMethod(); // -> 객체를 사용하지 않고 클래스명을 사용해서 호출 할 수 있다.
		OuterClass.StartcInner.StaticMethod();
		
	}

}

class OuterClass{
	int a=3;
	static int b=4;
	class Inner{
		int c=5;
		public void innerMethod() {
			System.out.println("<Inner Class>");
		}
	}
	static class StartcInner{
		int d=6;
		static int atart=10;
		public static void StaticMethod() {
			System.out.println("<Static Inner>");
		}
	}
	
}