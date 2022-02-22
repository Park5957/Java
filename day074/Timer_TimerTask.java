package day074;

import java.util.Timer;
import java.util.TimerTask;

public class Timer_TimerTask {

	public static void main(String[] args) throws InterruptedException{
											// �߰� ���Ӽ�Ʈ�� ���� ��������
		//Ÿ���׽�ũ�� ��ӹ��� ���ο� Ŭ���� ����
		//class Work1 extends TimerTask{}
		
		// run �̶�� �߻� �޼��忡�� �ϰ� ���� �۾� �������̵�
		// public void run() {}
		
		// ���� 
		// Timer t = new Timer (true); ���α׷� �����, ��ü �ڵ� �Ҹ�
		// TimerTask w1 = new Work1();
		// t.schedule(w1.5000);
		// 1000 == 1��
		
		 Timer t = new Timer (true);
		 TimerTask w1 = new Work1();
		 TimerTask w2 = new Work2();
		 
		 t.schedule(w1, 3000);
		 t.schedule(w2, 1000);
		 
		 Thread.sleep(4000);
		 System.out.println("��� �۾�����");
		 }
}
class Work1 extends TimerTask{
	public void run() {
		System.out.println("Work1 ����");	
	}
}
class Work2 extends TimerTask{
	public void run() {
		System.out.println("Work2 ����");	
	}
}