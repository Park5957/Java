package day077;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10); // 10�̶�� ������ ������ ArrayList
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		System.out.println("�ʱ����");
		System.out.println(list1); // �߰��� ������� ����Ʈ�� �ۼ��� �Ǿ����� �� �� ����
		
		System.out.println("�ε��� 1 ��ġ�� B�� �߰�");
		list1.add(1,"�̰�");
		System.out.println(list1);
		
		System.out.println("�ε��� 2��ġ�� �� ����:");
		list1.remove(2); // �ڹٴ� index ���� 0,1,2,3,4,5 ������ ����Ǵ� ����
		System.out.println(list1);
		
		System.out.println("�ε��� 2 ��ġ�� �� ��ȯ : " + list1.get(2));
		
	

	}

}
