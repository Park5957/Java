package day064;

public class objectClass {

	public static void main(String[] args) {
//		Aclass a = new Aclass();
		 // a. �� ��� �� ������Ʈ Ŭ���� �޼��尡 �ߴ� ���� �� �� ����
		Aclass a1 = new Aclass();
		Aclass a2 = new Aclass();
		System.out.println(a1.toString()); // toString �� ������ ������
		System.out.println(a1);
		
		System.out.println(a1.equals(a2)); //�������� Ȯ�� ���� Ȯ���ϴ� ���
		
		System.out.println(a1.getClass()); // �ش� ��ü Ŭ������ ������ ������ ��
	}
}
class Aclass{}