package pm4;

public class Constructor_retrining2 {

	public static void main(String[] args) {
		// 생성자 Overloading
		// 생성자의 모양에 따라 객체를 생성하는 방법이 결정된다.
		// 생성자의 모양(개수, 자료형)에 따라 객체를 생성하는 방법이 결정된다.
		// 메서드 오버라이딩과 같이 갯수의 제한이 없는 형태를 한번에 만들 수는 없다.
		K k1 = new K();
		K k2 = new K(3);
		K k3 = new K(93,5);
	}
}

class K {
	K(){ //생성자는 클래스명과 동일, 리턴이 없다.		
		System.out.println("첫 번째 생성자");
		}
	K(int a){
		System.out.println("두 번째 생성자");
		}
	K(int a, int b){
		System.out.println("세 번째 생성자");
		}
}
