package day056;

import java.util.Scanner;

import javax.swing.event.MenuListener;
import javax.swing.text.html.CSS;

public class Caffe_system {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		//�޴� �ֹ��� �� 5���� �ֹ��� �����ϵ��� ��
		String meunList[] = new String [5];
		int total = 0;
		
		while (true) {
			System.out.println("****ī��****");
			System.out.println("1.�ֹ��ϱ�");
			System.out.println("2.����ϱ�");
			System.out.println("3.�����ϱ�");
			System.out.println("4.������");
			int num = sc.nextInt();
			if(num==1) {
				String meanuName="";
				int menuPrice=0;
				System.out.println("1. �Ƹ޸�ī�� \t3800��");
				System.out.println("2. ���������� \t2400��");
				System.out.println("3. ī��� \t4200��");
				System.out.println("4. ��ũƼ \t5100��");
				System.out.println("�ֹ��� �޴���ȣ");
				int meunNum = sc.nextInt();
				if (meunNum==1) {
					meanuName="�Ƹ޸�ī��";
					menuPrice=3800;
				}
				else if (meunNum==2) {
					meanuName="����������";
					menuPrice=2400;
				}
				
				else if (meunNum==3) {
					meanuName="ī����";
					menuPrice=4200;
				}
				else if (meunNum==4) {
					meanuName="��ũƼ";
					menuPrice=5100;
				}
				else {
					System.out.println("�߸��Է��ϼ̽��ϴ�.");
					continue; // �ݺ��� �ʱ�ȭ ��ɾ�
				}
				total+=menuPrice; // ��Ż �Լ��� �� ���ø��� ������ �ø��� ����
				meunList[count]=meanuName;
				count++;
				System.out.println("�ֹ��� �޴��� "+meanuName+"�Դϴ�.");
				System.out.println("������ "+menuPrice+"�Դϴ�.");

			}
			else if(num==2) {
				System.out.println("�ֹ��� �޴�����Ʈ");
				for (int i=0; 1<count; i++) {
					System.out.println(i+1+"."+meunList[i]);
				}
				System.out.println("����� �޴���ȣ:");
				int cancelNum =sc.nextInt();
				if(1<=cancelNum && cancelNum<=count) {
					String delMenu = meunList[cancelNum-1];
					System.out.println(delMenu+"�޴�����");
					for (int i=cancelNum-1; i<count; i++) {
						meunList[i]=meunList[i+1];						
					}
					if(delMenu.equals("�Ƹ޸�ī��")) {
						total-=3800;
					}
					else if (delMenu.equals("����������")) {
						total-=2400;
					}
					else if (delMenu.equals("ī���")) {
						total-=4800;
					}
					else if (delMenu.equals("��ũƼ")) {
						total-=5100;
					}
					count--;
				}
				
			}
			else if(num==3) {
				System.out.println("������ �ݷ�:"+total+"��");
				System.out.println("������ �ݾ�:");
				int money=sc.nextInt();
				if(money<total) {
					System.out.println("�ܵ��� �����մϴ�.");
					continue;
				}
				else {
					System.out.println("�ܵ��� "+(money-total)+"���Դϴ�.");
					total=0;
					for(int i=0; i<5; i++) {
						meunList[i] ="";
				}
					count =0;
					
				}
				
			}
			else if(num==4) {
				System.out.println("�ݺ�����!");
				break;
			}
			else {
				System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}


	}

}
