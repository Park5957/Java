package day046;

import java.util.Scanner;

public class If_else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int age;
		System.out.println("����");
		age=sc.nextInt();
		
		if(age>19 ) {
			System.out.println("�����Դϴ�");
		}
		else if (age>13) {
			System.out.println("û�ҳ��Դϴ�");
			
		}
		else if(age>8) {//�ٷ� �� else if �� ������ ���� �Ļ��� ���� 8<age<=13
			
			System.out.println("����Դϴ�");
			
		}
		
		else { //age<=8
			System.out.println("�����Դϴ�");
		}
		
		System.out.println("������ ������ �ֽñ� �ٶ��ϴ�");

	}

}
