package pm5;

import am.CClass; 
public class ChildClass extends CClass { //D클래스는 A클래스의 자식
	public void print() {
		
		System.out.println(a);
		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
			
		
		// 자식 클랙스는 다른 패키지에 있어도 객체의
		// 생성없이 protected 접근지정자 까지 접근가능하다.
		
	}
	

}
