package day069;

public class EXception1 {

	public static void main(String[] args) {
		try {
			int [] a = {2,0,0};
			int b=4;
			int c = b/a[2];
			System.out.println(c);
		}
		catch(ArithmeticException e) { // 산술적 오류
			System.out.println("산술적 오류 발생");
		}
		catch(ArrayIndexOutOfBoundsException e) { //배열에서 벗어난 오류
			System.out.println("배열 갈이 오류발생");
		}
		System.out.println("예외처리 확인중");
	}

}
