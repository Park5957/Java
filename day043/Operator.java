package day043;

public class Operator {

	public static void main(String[] args) {
		
		//�������� ������ �켱����

		//�ֿ켱 ������ [],()
		//���� ! ~ + - ++
		//��� + - * / %
		//����Ʈ << >>
		//���� 
		//�� && ||
		//���� 9����0? �� : ����
		//���� = += -=
		//2+3 = +�� ������ 2,3�� �ǿ����� or ��

		
//		���� 
//		�ֿ켱
//		����
//		���
//		����Ʈ
//		����
//		��
//		����
//		����
		
		// % �� ������ �� ������ ���� �����ϴ� ǥ�� ex 5%3
		// �� ���ó�� ������� Ȧ ¦�� Ȯ���ϱ� ����
		
		int a=10;
		int b=3;
		double doubleB=3;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); // ���� ������ ������ ������ ����(�ݳ���)
		System.out.println(a%b);
		
		System.out.println(a/doubleB); 
		// ����/�Ǽ� �� �� �Ǽ��� ����.
		// ��ǻ�ʹ� �Ǽ��� ������ ������� ���� ���� ������ ǥ����
		
		System.out.println(a%doubleB);
		System.out.println(doubleB%b);
		
	}

}
