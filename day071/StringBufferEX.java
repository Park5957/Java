package day071;

public class StringBufferEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "test";
		StringBuffer buffer = new StringBuffer("test");
		
		str.replace('t', 'T');
		System.out.println(str); // ���÷��̽��� ��������� ������ �̷�� ���� ����. ��Ʈ�� ���۷� ���� ���� �Ұ�
		
	buffer.replace(1,3,"EX"); // ��Ʈ�� ���۸� ����ϸ� ��Ʈ�� ������ �� ���並 �ٲ� �� �ִ�.
	System.out.println(buffer);

	}

}
