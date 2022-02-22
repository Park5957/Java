package day076;

public class Generic2 {

	public static void main(String[] args) {
		A<Integer> a1 = new A<>(); // 앞에 적으면 = 이후에는 자동 작용, 앞에도 생략 가능
		//A a1 = new A();
		a1.x=10;
		a1.y=20;
		System.out.println(a1.x+a1.y);
		
		A<String> a2 = new A<>();
		a2.x="hello";
		a2.y="world";
		System.out.println(a2.x+a2.y);
		
		
	}

}
class A<T>{
	T x;
	T y;
}