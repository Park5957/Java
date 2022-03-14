package pm6;

class superA {
	superA(){
		System.out.println("A 생성자");
	}
}

class superB extends superA {
	superB(){
//		super(); //생략하면 자바가 알아서 만들어준다. 상속관계한정
		System.out.println("B 생성자");
	}
}

class superC {
	superC(int a){
		System.out.println("C 생성자");
	}
}

class superD extends superC {
	// 자바가 자동으로 추가
	// superD(){
//	super();
//	}
	superD(){
		super(3);
	}
}
public class Super_Method4 {

	public static void main(String[] args) {
		superA sa = new superA();
		System.out.println();
		
		superB sb = new superB();
		System.out.println();
		

	}

}
