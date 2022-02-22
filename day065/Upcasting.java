package day065;

public class Upcasting {

	public static void main(String[] args) {
		/*
		 * 실습조건예시 사람 클래스 - 이름 나이 취미 학생클랙스 이름 나이 취미 학년
		 */
		Student st1 = new Student("가길동", 20, "게임하기", 3);
		st1.info();
		st1.Study();

		Human H1 = new Student("나길동", 17, "롤하기", 1); // 업캐스팅의 결과물 예시 - 동적 바인딩으로 처리되었음을 알 수 있음
		H1.info();
		/* 동적 바인딩이란?
		 * 컴파일 시점에선 부모 클래스의 필드로 인지하나, 언타임 시점에선 자식 클랙스의 필드로 호출 할 매서드를 묶는 것
		 */

	}

}

class Human {
	String name;
	int age;
	String hobby;

	public Human(String name, int age, String hobby) { // 빠른 생성방법 뉘프트 알트 S -> 컨스트럭팅 유징 클릭
		super();
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}

	void info() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("hobby : " + hobby);
	}
}

class Student extends Human {
	int grade;

	public Student(String name, int age, String hobby, int grade) {
		super(name, age, hobby); // 부모클래스 매계변수 생성자
		this.grade = grade;
	}

	void info() { // 오버라이딩
		super.info();
		System.out.println("grade : " + grade);
	}
	void Study() { // 얘는 오버라이딩이 안된 상태 추가하고 싶다면 위 인포 보이드 안에 넣어야 함
		System.out.println("공부하기~");
	}
}
