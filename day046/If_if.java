package day046;

import java.util.Scanner;

public class If_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ø if �� - �α��� �ϴ� �˰���
		
		String id, password;  //��������(������ ���� ����)
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("���̵� �Է��� �ּ���:");
		id = input.nextLine();
		
		if(id.equals("java")) {
			System.out.println("id ��ġ!");
			System.out.print("��й�ȣ�� �Է��� �ּ���:");
			password=input.nextLine();
			if(password.equals("abc123")) {
				System.out.println("ok");
				System.out.println("let go!");	
			}
			else {
				System.out.println("��й�ȣ Ʋ�Ƚ��ϴ�.");
			}
		
		}
		else {//����1�� ������ ��� ��
			System.out.println("���̵� ����ġ");
		}
	}

}
