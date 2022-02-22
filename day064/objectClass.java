package day064;

public class objectClass {

	public static void main(String[] args) {
//		Aclass a = new Aclass();
		 // a. 이 명령 시 오브젝트 클래스 메서드가 뜨는 것을 할 수 있음
		Aclass a1 = new Aclass();
		Aclass a2 = new Aclass();
		System.out.println(a1.toString()); // toString 은 생략이 가능하
		System.out.println(a1);
		
		System.out.println(a1.equals(a2)); //동일한지 확인 하지 확인하는 기능
		
		System.out.println(a1.getClass()); // 해당 객체 클래스의 정보를 가지고 옴
	}
}
class Aclass{}