package day073;

import java.util.Calendar;

public class Date4 {
	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		Calendar endOftear = Calendar.getInstance();
		Calendar Chrismas = Calendar.getInstance();
		//set ���� ���� ������ �� ����
		endOftear.set(Calendar.MONTH,11); // 12���� �����ϴ� ���� 1���� 0���� ������
		endOftear.set(Calendar.DATE,31); // Date : 31��
		long diff = endOftear.getTimeInMillis()-today.getTimeInMillis();
		System.out.println("�������� ���� �� : " + diff/(24*60*60*1000));
												// �Ϸ� * �� * �� * m.sec���� �����ϱ�����
		
		Chrismas.set(2022,11,25); // 2020.12.25.
		diff=Chrismas.getTimeInMillis()-today.getTimeInMillis();
		System.out.println("ũ�������� ���� ���� �� : " + diff/(24*60*60*1000));
}
}