package day050;

import java.util.Scanner;

public class Continue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int money = 10000;
		System.out.println("���� �������� 10000��");
		Scanner sc =new Scanner(System.in);
		
		while (true) {
			System.out.println("�󸶸� ����Ͻðڽ��ϱ�?");
			int i=sc.nextInt();
			
			if (!(0<=i &&i<=money)) { //0���� ũ�ų� ���ų� �Ǵ� ����� 10000��(�Ӵ�) ���� �۴����� ���� �ƴ�(!)�� ����
				System.out.println("�ٽ� �Է����ּ���(�������� Ʋ�Ƚ��ϴ�.)");
				continue;
				
			}
			
			System.out.printf("������ %d ���� ���ҽ��ϴ�.\n" , money-=i);
			if(money==0) {
				
				break;
				
			}
			}
		System.out.println("��� ���� ����մϴ�. ����");

	}
}

