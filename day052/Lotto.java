package day052;

import java.util.*;
import java.util.Random;
import java.util.Scanner; // *���̸� ��ƿ �� ��� ��Ŷ�� �̿��� �� ���� ������ ��ĳ�ʴ� ���� ��

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ζ� ��ȣ ������
		
		
		System.out.println("�ζ� ������");
		Scanner sc =new Scanner(System.in);
		Random rd = new Random();
		
		//6���� �ζǹ�ȣ ������ �迭
		//���ʽ� ���� ������ ����
		//����ڿ��� 6�� ���� �Է� �� ������ �迭
		//����ڿ��� ���ʽ� �Կ��޾� ������ ����
		//���� �� ���ڰ� ����� ī���� �� ����
		
		int lottoer[]=new int[6];
		int user[]=new int[6];
		
		int bonus,bonusUaer;
		int count =0; //�ߺ��� ������ ī����
		
		
		for (int i=0; i<6; i++) {
			 lottoer[i] = rd.nextInt(45)+1;
		}
		bonus = rd.nextInt(45)+1;
		System.out.println("���� ������ �Է� :");
		
		System.out.println("�ζǹ�ȣ :"+Arrays.toString(lottoer)+"���ʽ���ȣ :"+bonus);
		//����ڿ��� 6���� ���� �Է�
		for(int i=0; i<6; i++) {
			user[i]= sc.nextInt();
		}
		System.out.print("���ʽ� �� �Է� : ");
		bonusUaer = sc.nextInt();
		
		System.out.println("���� :"+Arrays.toString(user)+"���ʽ���ȣ :"+bonusUaer);
		//�ζ� �迭�� ���� ����� �迭�� ���� ���� ���� � �ִ��� ī����
		
		for(int j=0; j<6; j++) {
			for(int i=0; i<6; i++) {
		       if(lottoer[j]==user[i]) {
			      count++;
		}
		}		
}
		System.out.println("�� ���᰹��"+count);
         //ī��Ʈ�� ������ ���� ����� ����
         if (count==6) {
        	 System.out.println("�����մϴ� 1���Դϴ�.");
         }
         else if (count==5) {
        	 if(bonus==bonusUaer) {
        	 System.out.println("�����մϴ� 2���Դϴ�.");
         }
        	 else {
        		 System.out.println("�����մϴ� 3���Դϴ�");
        	 }
         }
        	 else if (count==4) {
            	 System.out.println("�����մϴ� 4���Դϴ�.");
             }
        	 else if (count==3) {
            	 System.out.println("�����մϴ� 5���Դϴ�.");
             }
        	 else {
        		 System.out.println("��");
        	 }
}
}