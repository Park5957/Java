package day056;

import java.util.Arrays;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Test_caffe {

	public static void main(String[] args) {
		
		/* ī�丸���
		 * �˰��� �ۼ�
		 * �ֹ��ϱ�, ����ϱ�, �����ϱ�, ������
		 * �Ƹ޸�ī�� 3800��
		 * ���������� 2400��
		 * ī��� 4200��
		 * ��ũƼ 5100��
		 * 
		 * 
		 * �ֹ��� ������ �޴��� ����Ѵ�
		 * �ֹ� ���� �޴��� �Է¹޴´�
		 * �ֹ��� �޴��� ������ �� �ݾ׿� �����Ѵ�
		 * �ֹ��� �޴��� ��ü �޴�����Ʈ�� �����Ѵ�
		 * �ֹ��� ������ �� �� �����Ѵ�
		 * 
		 * 
		 */
		
		/* ���ۿ� �ʿ��� ���
		 * 1. �ֹ��� �ޱ����� ��� �޼���
		 * 2. �� �޴��� ������ ǥ���ϴ� �޼���
		 * 3. �ֹ��� �Է¹��� �ڵ�
		 * 4. �ֹ� ��Ҹ� �Է¹��� �ڵ�
		 * 5. �ֹ����� �޴��� ��� �޼���
		 * 6. �ֹ����� �޴��� �� ������ ��¸޼���
		 * 7. �� �հ� �ݾ��� ��� �޼���
		 * 8. ���� ��� �޼���
		 * 9. ���� �ݾ��� �Է¹��� �ڵ�
		 * 10. ����� �ܾ��� ǥ�� ��� �޼���
		 * 11. ��
		 * 
		 * �ʿ��� �迭 �� ������ ����
		 * 1. �޴� �̸� �迭
		 * 2. �޴� ���� �迭
		 * 3. �ֹ����� �޴� �迭
		 * 4. �ֹ����� ���� ���� �迭
		 */
		Scanner sc = new Scanner(System.in);
		
		String s[] = new String[] {"","�Ƹ޸�ī��", "����������", "ī���", "��ũƼ"};
		int i[] = new int [] {0,3800,2400,4200,5100};
		String menu[] = new String[] {" ","�ֹ��ϱ�","����ϱ�","�����ϱ�","������"};
//		String ss[] = new String[4][4];
		int call[]= new int[5];
		

		
		
		while (true) {
			System.out.println("******ī�� �ڵ� �ֹ���******");
			for (int j = 1; j <= 4; j++) {
				System.out.print(j + "�� : " + menu[j] + " / ");
			}
			String odrneam;
			int obrpy=0;
			System.out.println();
			System.out.print("���⿡ ��ȣ�� �Է��� �ֽñ� �ٶ��ϴ� : ");
			int m = sc.nextInt();

			if (m == 1) {
				for (int k = 1; k < 5; k++) {
					System.out.print(k + "��:" + s[k] + ":" +   i[k] + "��" + " / ");
				}
				System.out.println();
				System.out.println("�ֹ��� ������ ��ȣ�� �Է��� �ֽñ� �ٶ��ϴ�. :");
				
				for (int q = 1; q < 5; q++) {
					
					call[q]=sc.nextInt();
					
				}
			
				System.out.println("�ֹ��Ͻ� ������" + Arrays.toString(call) + "�� �½��ϱ�? �´ٸ� 1��. Ʋ���ٸ� 2�� �Է��� �ֽñ� �ٶ��ϴ�." );
				int YN = sc.nextInt();
				if ( YN==1 ) {
					System.out.println("�����Ͻ� �ݾ��� �Է��� �ֽñ� �ٶ��ϴ�.");
					int pyU = sc.nextInt();
					if (pyU > obrpy) {
						System.out.println("�ܾ���" + (pyU-obrpy) + "�Դϴ�.");
					}
					else if(pyU < obrpy) {
						System.out.println("�ݾ��� �����մϴ�.");
					}
					else {}
				}
				else if (YN==2) {
					System.out.println("ó������ ���ư��ϴ�.");
				}
				else {
					System.out.println("�߸��Է��ϼ̽��ϴ�.");
					continue;
			}
			}	
			
				
				
			
			else if (m<=3) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� ������ �ֽñ� �ٶ��ϴ�.");
				continue;
			}
			else if (m==4) {
				System.out.println("�����մϴ�. �̿��� �ּż� �����մϴ�.");
				break;
			}
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� ������ �ֽñ� �ٶ��ϴ�.");
				continue;
			}
	
	}
}
}


