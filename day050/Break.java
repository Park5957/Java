package day050;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//if �ݺ��� ���ߴ� ���
		
	
//		while (true) {�ݺ� �� ���}
		
//		int i=1;
//			while (true) {
//				System.out.println(i++); // �� ������ ���Ѱ���
//			}
//
//		
		Scanner sc =new Scanner(System.in);
				
		int num;
		
				while (true) {
					System.out.println("�����Կ�");
					num=sc.nextInt();
					
					if(num==0 ) {
						System.err.println("END");
						break;
						
					}
					
					System.out.println("�Է°�:"+num);
				}
	}

}
