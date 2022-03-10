package pm4;

public class Methhod_retrining2 {

	public static void main(String[] args) {
		// 클래스 내부에서 매서드 호출하기
		// 클래스 내부에 있는 매서드 끼리는 객체를 생성하지 않고도 서로 호출할 수 있다.
		// 필드 역시 클래스 내부의 모든 매서드 안에서 객체를 생성하지 않고 사용할 수 있다.
		// 조건 static 이 붙어있는 경우에만 호출이 가능하다.
		
		print();
		int a = twice(3);
		double b = sum(2,5.4);
		System.out.println(a);
		System.out.println(b);
	}
	public static void print(){
		System.out.println("안녕");
	}
	public static int twice(int k){
		return k*2;
	}
	public static double sum(int m, double n){
		return m+n;
	}


}
