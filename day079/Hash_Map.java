package day079;

import java.util.HashMap;
import java.util.Scanner;

public class Hash_Map {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		Scanner sc = new Scanner(System.in);
		
		//1. put
		hm.put("apple","���");
		hm.put("paper","����");
		hm.put("flower","��");
		
		String voca; 
		System.out.println("�˰���� �ܾ �Է��ϼ��� : ");
		voca = sc.nextLine();
		//2.containsKey(key) : �ش� key �� hashmap�� �����Ѵٸ� true
		if(hm.containsKey(voca)) {
			//3.get(key) : value �� ��ȯ
			System.out.println("�ش��ϴ� ����? : " +hm.get(voca));
		}
		else {
			System.out.println("�ش� �ܾ ���� ���� �����ͺ��̽��� �����ϴ�.");
		}

	}

}
