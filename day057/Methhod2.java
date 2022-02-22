package day057;

public class Methhod2 {

	public static void main(String[] args) {
		System.out.println(f());	
	}
	
	static int f() { //void 를 리턴이 정수값이기 때문에 int로 변경을 하여 처리함
		System.out.println("f() 호출!");
		return 100;
		
	}

}
