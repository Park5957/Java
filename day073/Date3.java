package day073;

import java.util.Calendar;

public class Date3 {

	public static void main(String[] args) {
		Calendar a = Calendar.getInstance();

		int year = a.get(Calendar.YEAR); // a�� ������ �´�. ������ ���� �ʵ� ��ȣ�� ���� �ص� ������
											// ������ �ʵ��ȣ�� �𸣴� YEAR ��� Fianl ������ ������ ��
		int month = a.get(Calendar.MONTH) + 1; // 1��:0~ 12��:11 �̱� ������ +1�� ������� ���������� Ȯ���� �����ϴ�.
		int date = a.get(Calendar.DATE);
		
		System.out.println(year + "��" + month + "��" + date + "��");
		System.out.print("������ �̹��ֿ��� �� ��° ���ΰ� : "); // ����� �� ��ȭ������� �� �����
		System.out.println(a.get(Calendar.DAY_OF_WEEK));
		
		System.out.print("�̹� �⵵���� ������ �� ��° �ΰ� :");
		System.out.println(a.get(Calendar.DAY_OF_YEAR));
		
		System.out.print("�̹� ���� ��ĥ���� �ִ°� : ");
		System.out.println(a.getActualMaximum(Calendar.DATE));
	}

}
