package pm6;

public class Super_Method3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X x =new X();
		// 기본적으로 부모가 생성된 이후에 자식이 생성이 되기 떄문에 
		// class V 의 내용이 출력되는 것이다.
		
	}

}

class V{
	V(){
		System.out.println("V 생성자");
	}
}

class X extends V{
	X(){
//		super(); // 안넣으면 자동으로 생성된다.
				 // 상속관계이기 때문이다.
		System.out.println("X 생성자");
	}
}