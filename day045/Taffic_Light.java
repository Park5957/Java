package day045;

import java.util.Scanner;

public class Taffic_Light {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner(System.in); // ��Ʈ�� ����Ʈ o  �ʼ�!
				System.out.println("��ȣ�� ���α׷�");
		        System.out.println("��ȣ�� �Է��ϼ���");
				System.out.println("������:1,�ʷϺ�:2,�����:3");
				int sign = Sc.nextInt();
				String result=sign==1?"stop~":sign==2?"start~":"slow~";
				// 1�� ������ ��� sign�� �ѹ� �� �߰��Ͽ� �� �� ������ ���� (�б� �˰���)
				System.out.println(result);
						
						

	}

}
