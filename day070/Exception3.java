package day070;

public class Exception3 {

	public static void main(String[] args) {
		int age = 19;
		try {
			ticketing(age);
		} 
		catch (AgeException e) {
			e.printStackTrace();
		}
	}

	public static void ticketing(int age) throws AgeException {
		if (age < 0) {
			throw new AgeException("나이 입력이 잘 못 되었습니다.");
		}
	}
}

class AgeException extends Exception {
	public AgeException() {
	}

	public AgeException(String message) {
		super(message);
	}
}
