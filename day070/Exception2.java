package day070;

public class Exception2 {

	public static void main(String[] args) {
		// �̰����� ���ؼ� �޼�Ʈ C ���� ���������� ȣ���� �Ͽ����� C ���� �������� ó���ڸ� ������
		// ��������� ���� �޼��忡�� ĳġ�� �����ϰ� �� �ڵ�

		try {
			methodA();
		}
		catch (Exception e) {
			System.out.println("���ο��� ó��");
		}

	}
	public static void methodA() throws Exception { methodB();}
	public static void methodB() throws Exception { methodC();}
	public static void methodC() throws Exception { Exception e = new Exception();
			throw e;
	}

	
}
