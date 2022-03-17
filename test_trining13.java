package pm10;

import java.util.Scanner;

public class test_trining13 {

	public static void main(String[] args) throws myex {
		// 사용자 예외 클래스를 정의하여 예외를 발생 시키시오
		// 예외 발생 조건 - 100점 초과
		// 0점 미만
		// 정상값 0~100
		// 정상적입 값입니다.

		AA aa = new AA();

		try {
			aa.cheakScore(85);
			aa.cheakScore(110);
		} catch (MinusException | OverException e) {
			System.out.println(e.getMessage());
		}

	}

}

class AA {
	void cheakScore(int s) throws MinusException, OverException {
		if (s < 0) {
			throw new MinusException("예외 발생:음수값 입력");
		} else if (s > 100) {
			throw new OverException("예외 발생:음수값 입력");
		} else {
			System.out.println("정상적입 값입니다.");
		}
	}
}

class OverException extends Exception {
	public OverException(String message) {
		super(message);
	}
}

class MinusException extends Exception {
	public MinusException(String message) {
		super(message);
	}
}