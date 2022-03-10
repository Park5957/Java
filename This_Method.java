package pm4;

public class This_Method {

	public static void main(String[] args) {
		// this()메서드 (this 메서드와 다름)
		// this()메서드는 this 키워드와 비슷하게 보이지만 의미가 완전히 다르다.
		// this()메서드는 자신이 속한 클래스 내부의 다른 생성자를 호출할때 사용한다.
		// 1. 생성자의 내부에서만 사용한다.
		// 2. 생성자의 첫줄에 위치한다.
		// 두개 조건중 하나라도 지켜지지 않으면 에러가 발생한다.
		
		T t1 =new T();
		System.out.println("---절취선---");
		T t2 =new T(3); // 생성자 오버로딩

	}

}

class T {
	T(){
		System.out.println("첫 번째 생성자");
		
	}
	T(int a){ //생성자 오버로딩
		this(); //return 과 비슷 역할을 하여 자기 자신인 T()를 호출하게 된다.
		System.out.println("두 번째 생성자");
				
	}
	
}