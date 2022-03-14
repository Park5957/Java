package pm6;

public class Super_Method {

	public static void main(String[] args) {
		/* super 키워드 		super() 메서드
		 * 
		 * super 는 모두 부모 클래스와 관련이 있다. 따라서 상속 관계에서만 사용을 하게된다.
		 */
		J j = new J();
		j.bcd(); //J의 abc();의 결과가 나왔다.
		j.bcd2(); //부모인 H의 abc(); 결과가 나왔다.
		
		System.out.println("---절취선---");
		H h = new J();
		h.abc();	
		}
}
class H {
	void abc() {
		System.out.println("H클래스의 abc method");
	}
}
class J extends H{
	@Override
	void abc() {
		System.out.println("J클래스의 abc method");
	}
	void bcd() {
		abc();
	}
	void bcd2() {
		super.abc();
	}
}