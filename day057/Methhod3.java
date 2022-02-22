package day057;

public class Methhod3 {

	public static void main(String[] args) {
		// 본 코드 예시는 사각형의 넓이는 구하는 메서드 사용법임
		System.out.println("사각형의 넓이 : " +caclulator(10,20));

	}
	
	static int caclulator(int a, int b) {
		System.out.println("계산을 시작합니다.");
		int area = a * b;
		return area;
	}

}
