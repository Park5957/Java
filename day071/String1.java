package day071;

public class String1 {

	public static void main(String[] args) {
		String str="Hello";
		          //01234 ��� ��ġ�� �� �� ���� 
		System.out.println(str.concat(" World ")); // ������ ���� str ��ü�� ����� ���� �ƴ�
		System.out.println(str);
		//substring(������ġ,����ġ)
		System.out.println(str.substring(2,4)); // ������ġ ���� �� ��ġ���� ������ �´ٰ� ���ظ� �ϸ� �ȴ�.
		System.out.println(str.substring(3)); //�̷��� ������ ������ġ���� ������ ������ �Ͷ�. ������ ���� �������� �ʾұ� ����
		
		System.out.println(str.length());//���ڿ��� �� 5���̱� ������ (���� ����) 5��� ��ġ�� ǥ����
		System.out.println(str.toUpperCase()); //���ڿ��� �� �� ����
		System.out.println(str.toLowerCase());
		System.out.println("Test".toUpperCase());
		
		System.out.println(str.charAt(0)); //0���� �ش��ϴ� ù��° ������ h �� �Ѿ��
		System.out.println(str.indexOf("o")); //�ش� ���ڰ� ��� ° ���� �����ϴ��� �� �� ����
												// -1 �� ������ ���� ã�� ������ ����̴�
		System.out.println(str.equals("Hello")); //���� ���ڿ��� ������ �������� Ȯ���� ������
		System.out.println(" test ".trim()); // �� �� ������ �������� Ȯ�� �� �� ����
		
		System.out.println("hello world".replace('l', 'L')); // l �� L�� ������ ������ Ȯ�� �� �� ����(���ڸ� ����)
		System.out.println("hello world".replaceAll("hello", "bye")); //���ڿ��� ���������� �� �� ����
	}

}
