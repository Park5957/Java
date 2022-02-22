package day064;

public class Inheritancel {

	public static void main(String[] args) {
		Student st= new Student();
		st.breath();
		st.learn();
		
		Teacher t = new Teacher();
		t.eat();
		t.teach();
		
		//상속시에 생성자는 상족되지 않는다
		//다중상속지원X 단, 파이썬과 c++ 에서는 지원함
		//클래스 앞 final 이라는 키워드는 다른 클래스 상속 불가
	}

}
class person{
	void breath() {
		System.out.println("숨쉬기");
	}
	void eat() {
		System.out.println("밥먹기");
	}
	void say() {
		System.out.println("말하기");
	}
}

class Student extends person{
	void learn() {
		System.out.println("배우기");
	}
	
}

class Teacher extends person{
	void teach() {
		System.out.println("가르치기");
	}
}