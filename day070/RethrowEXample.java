package day070;

public class RethrowEXample {

	public static void main(String[] args) {
		try {
			System.out.println("�ܺ� try");
			try {
				System.out.println("���� try");
				Exception e = new Exception();
				throw e;
				}
			catch (Exception e) {
				System.out.println("(���� try-catch) eception : " +e);
				System.out.println("���� ������ �ѹ���");
			throw e;
			}
			finally {
				System.out.println("finally ���� ���");
			}
		}
	catch (Exception e) {
		System.out.println("(�ܺ� tey-catch) exception : " + e);
	}
		System.out.println("����");
	}

}
