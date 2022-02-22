package day064;

public class Inheritancel2 {

	public static void main(String[] args) {
		Leader leader = new Leader();
		leader.say();
	}

}
class Student2 {


	void lead() {
		System.out.println("배우기");
	}
	void eat() {
		System.out.println("밥먹기");
	}
	void say() {
		System.out.println("선생님 안녕하세요");
	}
}
class Leader extends Student2{
	void lead() {}
	void say() {//매서드 오버라이딩
		System.out.println("선생님께 인사");
		
		super.say(); // 부모클래스의 say도 출력을 하고 싶다면 super 를 앞에 붙이면 됨
	}
}