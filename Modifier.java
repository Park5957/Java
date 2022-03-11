package pm5;

import am.CClass;

public class Modifier {
	/* 접근제어자(지정자) 는 클래스, 필드, 메서드, 생성자 들에게
	 * 어떤 특징을 부여하는 문법 요소이다. 일종에 형용사로 생각할 수 있다.
	 * ex) 멋진 자동차
	 * 
	 * 사용 범위를 정의하는 역할을 한다.
	 * 
	 * public	>	protected	>	default		>	private
	 * 							(아무것도 없는경우)
	 * 
	 * public	 : 같은 패키지 내의 모든 클래스 + 다른 패키지의 모든 클래스에서 접근가능		 * 
	 * protected : 같은 패키지 내의 모든 클래스 + 다른 패키지의 자식 클래스에서 접근가능
	 * default	 : 같은 패키지 내의 모든 클래스
	 * private	 : 같은 클래스 에서만 사용가능 		
	 */

		public static void main(String[] args) {
		
			CClass a = new CClass();
			a.print();
			
			
	}

}
