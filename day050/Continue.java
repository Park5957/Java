package day050;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//������ �ӷ��� �� ��� ���� ����� �ȵǰ� ��� �ݺ��� �����
		//0 �Է½� �ݺ� ����
		
		
		Scanner sc =new Scanner(System.in);
		int num;
	
		
		while (true) {
			System.out.println("�����Է�");
			num=sc.nextInt();
			
			if(num==0) {
				System.out.println("End");
			}
			if(num<0) {
				System.out.println("�Ʒ� ��� �����ϰ� ���� �ݺ����� ����");
				continue;
				
			}
			
			System.out.println("num:"+num);
		}

	}

}
