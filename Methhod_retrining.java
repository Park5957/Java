package pm4;

public class Methhod_retrining {

	public static void main(String[] args) {
		/* 메서드
		 * 메서드는 클래스의 기능에 해당하는 요소다.
		 * 사람 클래스 라면먹기, 잠가기, 공부하기 등등
		 * 
		 * 메서드명은 관례적으로 소문자만 사용한다.
		 * 제어자 반환타입 매서드명(인수){}
		 * 
		 * 여러가지 형태의 반환 타입
		 * 
		 * 첫 번째 형태 - void를 사용함으로 return 이 없는 형태.
		 * 			  input 부존재
		 * void print(){
		 *  System.out.print("HI")
		 * }
		 * 
		 * 두 번째 형태 - input 부존재, 자료형 존재
		 * int print() {
		 * 		return 0;
		 * }
		 * 
		 * 세 번째 형태 - input 존재, return 이 없는 형태
		 * void print(String name){
		 *  System.out.print(name)
		 * }
		 * 
		 * 네 번째 형태 - 전부 존재하는 형태
		 * String print(String name){
		 * 		return 0;
		 * }
		 */
			
		
		/* 매서드의 호출
		 * 매서드를 사용하려면 먼저 객체를 생성해야 한다.
		 * A a = new A();
		 * a.method();
		 */
		
		C c = new C();
		c.print();
		System.out.println("---절취선---");
		int k = c.data();
		System.out.println(k);
		
		System.out.println("---절취선---");
		System.out.println(c.sum(1,2.3));
		c.printMonth(5);
		c.printMonth(12);
	}

}

class C {
	void print() {
		System.out.println("안녕");
	}
	int data() {//여기에서의 int 는 return 의 타입이다.
		return 3;
	}
	double sum (int a, double b) {
		return  a+b;
	}
	void printMonth(int m) {
		if (m < 1 || m >12) {
			System.out.println("월을 잘못 입력하셨습니다.");
			return; //종료를 위한 return
		}
		System.out.println(m+"월 입니다.");
				
	}
}
