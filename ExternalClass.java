package pm5;

public class ExternalClass {

	public static void main(String[] args) {
		/* ExternalClass 외부 클랙스
		 * public 클래스의 외부에 추가로 정의한 클래스를 말한다.
		 * 1개의 자바 소스파일에는 최대 1개의 public 클래스만 존재할 수 있고
		 * 그 class name는 file명과 일치해야만 한다.
		 * 즉 1개의 소스 파일 안에 public class를 제외한 모든 class는
		 *  ExternalClass 이다.
		 *  public class 가 아니면 다른 package의 class에서 import 할 수 없음으로
		 *  external class는 같은 package 안에서만 사용할 수 있는 것이다.
		 *  
		 *  // 이미 am 패키지 내부에 public class A 가 선언된 상태이기에
		 *  am 패키지 내의 class B는 public 선언이 불가능한 외부 클래스
		 *  이기 때문에 다른 패키지에서는 불러올 수가 없다.
		 *  
		 */
		
		

	}

}
