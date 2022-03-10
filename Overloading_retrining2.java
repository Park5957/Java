package pm4;

public class Overloading_retrining2 {

	public static void main(String[] args) {
		// 가변길이 매서드
		// 메서드 오버로딩은 입력변수의 개수 혹은 자료형에 따라서 구분된다.
		// 만약 입력 변수로 1~100 사이의 불특정 갯수로 입력 들어오게 된다면
		// 매서드도 100개를 만들어야 한다.
		// 이것은 간단하게 할 수 있는 방법이 아니다.
		// 이를 가능케 하는 것이 가변길이 매서드 이다.

		method1(1,2);
		System.out.println("---절취선---");
		method1(1,2,3);
		System.out.println("---절취선---");
		method1();
		System.out.println("---절취선---");
		method2("안녕","방가");
		System.out.println("---절취선---");
		method2("땡큐","배리","감사");
		System.out.println("---절취선---");
		method2();
		
	}
	public static void method1(int...values) {
		System.out.println("길이  : " + values.length);
		for (int each : values) {
			System.out.print(each + " ");
		}
		System.out.println("");
	}
	
	public static void method2(String...values) {
		System.out.println("길이  : " + values.length);
		for (String each : values) {
			System.out.print(each + " ");
		}
		System.out.println("");
	}
}
