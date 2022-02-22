package day077;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		// ��ҵ��� ���� ����Ǿ� �ִ� ����Ʈ
		// ������ �Ÿ����ٴ� �������� ����Ǿ� �ִ� ����Ʈ
		// �Ʒ��� code�� Array �� Likned �� ����Ʈ �Է� �ð��� ���̸� ���� ���� ���̴�.
		// ��������� LinkedList �� �ӵ��� �ξ� �����ٴ� ���� �� �� �ִ�.
		ArrayList a1 = new ArrayList();
		LinkedList ll = new LinkedList();
		
		long start = System.currentTimeMillis(); // �и����� �� ���� ������ ��ȯ
		
		for(int i=0; i<100000; i++) {
			a1.add(0,String.valueOf(i));
		}
		long end = System.currentTimeMillis();
		System.out.println("ArrayList �۾��ð�:" +(end-start));
		
		start = System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			ll.add(0,String.valueOf(i));
		}
		end = System.currentTimeMillis();
		System.out.println("LinkedList �۾��ð� : " + +(end-start));


	}

}
