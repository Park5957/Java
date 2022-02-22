package day065;

public class DownCasting {

	public static void main(String[] args) {
		Human h1 = new Student("가길동",20,"게임하기",3); // 업캐스팅
		
		Student s1 = (Student)h1; //다운 캐스팅 (자식 값네 부모값을 넣는 것)(h1의 값을 student 값으로 변경을 함)
		s1.Study();
	}
}

