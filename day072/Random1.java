package day072;

import java.util.Random;

public class Random1 {

	public static void main(String[] args) {
		Random random = new Random();		// seed�� ���� �ð�
		Random random1 = new Random();		// seed�� ���� �ð�
		Random random2 = new Random(2);
		Random random3 = new Random(2);
		System.out.println(System.currentTimeMillis()); // ����ð��� ���������� ǥ���� �ִ� ��
		
		
		for(int i=0; i<5; i++) {
			System.out.println("�⺻������ :"+i+"��°��"+random.nextInt());
		}
		for(int i=0; i<5; i++) {
			System.out.println("�⺻������1 :"+i+"��°��"+random1.nextInt(10));
		}
		for(int i=0; i<5; i++) {
			System.out.println("�⺻������2 :"+i+"��°��"+random2.nextInt());
		}

		for(int i=0; i<5; i++) {
			System.out.println("�⺻������3 :"+i+"��°��"+random3.nextInt(10));
		}


	}

}
