package day080;

import java.util.ArrayList;

public class ArrylistTryTT {

public static void main(String[] args) {

	String []arr = new String[2];
	arr[0] = "one";
	arr[1] = "two";
	for(int i=0; i<arr.length; i++) {
		System.out.println(arr[i]);
	}
	ArrayList<String> a1 = new ArrayList<>();
	a1.add("one");
	a1.add("two");
	a1.add("three");
	for(int i=0; i<a1.size(); i++) {//size ��� ����
		
		//String value = (String)a1.get(i);
		//���� ���� ���׸� ������ ���� �ʾҴٸ�, �̿Ͱ��� ����ȯ�� �̷�� �� �� ����.
		System.out.println(i+"�ε��� �� : "+a1.get(i));
	}
	System.out.println("�Ѳ����� ����Ʈ�� ����ϴ� ��� : " + a1);
	}

}
