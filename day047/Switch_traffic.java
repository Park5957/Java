package day047;

import java.util.Scanner;

public class Switch_traffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//switch(����){���� �� �� ������, ��ü�� ������ �����
//		case ��1:
//			
//			���� == ��1�϶� ������ ���;
//			break;
		
		// default: ��� case�� �ƴҶ� ������ ���;
		// �� ���°� �⺻���
		
		System.out.println("��ȣ�����α׷�");
		System.out.println("Red1, Yello2, Green3");
		System.out.println("light");
		
		Scanner sc = new Scanner(System.in);
		
		int sign = sc.nextInt();
		
		
		switch(sign) {
		case 1: 
			System.out.println("Redline Stop");
			break;
			
		case 2 :
			System.out.println("Yello break");
			break;
			
		case 3 :
			System.out.println("Green Go");
			break;
			
		default :
			System.out.println("�߸������̽��ϴ�.");
	
	
	}

	}
}
