package day077;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		//set �� Ư¡�� �ߺ��� ������� �ʴ´�.
		HashSet hs = new HashSet(); // ��½� ������ ����
		hs.add("demon");
		hs.add("banana");
		hs.add("tomato");
		hs.add("apple");
		hs.add("cargo");
		
		TreeSet ts = new TreeSet(); // ���ĺ� ������� ���ĵǾ� ��µ�
		ts.add("demon");
		ts.add("banana");
		ts.add("tomato");
		ts.add("apple");
		ts.add("cargo");	
		
		Iterator it=hs.iterator(); // ���� ����ִ� ������ ������ ���� ���� ���>
		System.out.println("<Hash Set ���>");
		while (it.hasNext()) { //�̿� ���� �ݺ��� �����Ѵٸ� it���� ���̻� ������ �� ��Ұ� ������ ���� �������
			System.out.print(" "+it.next());
	      }
		System.out.println();
		System.out.println("���� Hash Set�� ũ�� : "+hs.size());
		
		System.out.println();
		System.out.println("<Tree Set ���>");
		Iterator it2=ts.iterator(); // ���� ����ִ� ������ ������ ���� ���� ���>
		while (it2.hasNext()) { //�̿� ���� �ݺ��� �����Ѵٸ� it2���� ���̻� ������ �� ��Ұ� ������ ���� �������
		      System.out.print(" "+it2.next());
		      }
		System.out.println();
		System.out.println("���� TreeSet�� ũ�� : "+ts.size());
	}

}
