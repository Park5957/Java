package day049;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		String answer ="Y";
		
				int count = 0;
				
		while(answer.equals("Y")){ // Y�� �Է������� ī��Ʈ�� �ø��� ��ɾ�
			System.out.println("������ ����ϰڽ��ϱ�?(Y)");
			answer=sc.nextLine();
			
			if(answer.equals("Y")) {
				System.out.printf("������ %d �� ����߽��ϴ�. \n",++count);
				
				
			}
			
		}
		System.out.println("stop"); // �ٸ� ���ڸ� ���� �� ������Ʈ

	}

}
