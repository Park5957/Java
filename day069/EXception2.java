package day069;

public class EXception2 {
	public static void main(String[] args) {
		// �ܺη� ����
		int a=0;
		int b=2;
		
		try {
			System.out.println("�ܺη� ����");
			int c=b/3;
		}
		catch (ArithmeticException e) {
			System.out.println("������ �߻��Ͽ����ϴ�.");
		}
		finally {
			System.out.println("������ ��������");
		}
	}
}
