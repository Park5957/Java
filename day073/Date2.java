package day073;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date2 {

	public static void main(String[] args) {
	//	Calendar a = new Calendar(); �̰� �ȵ�. ��ä���� �Ұ��� �����
		Calendar a = Calendar.getInstance(); // �̱�����
		Calendar b = new GregorianCalendar(); // ���� �̱����� ���� ����Ʈ �ؾ���.
		System.out.println(a.toString()); //���� �� ���� �󸶸��� �ð��� �������� Ȯ���ϱ� ���� ���
		System.out.println(b.toString());

	}

}
