package day047;

import java.util.Random;

public class Pokemon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Random Ŭ����  anwkrdl todtjd
		// nextint() �������� ����
		// nextint (����) 0 ~ -1 ���� �������� ������ �߻���Ŵ(���� -case �� ������� �ʱ����� +1�� �ؾ���.
		// nextFloat() 0.0 1.0 ���� 0.0~1.0 ����
		
 		Random random = new Random();
 				
		System.out.println("���ϸ� �����̱�");
		System.out.println("PK");
		System.out.println("CB");
		System.out.println("IS");
		
		int mypokemon = random.nextInt(3)+1; // 0~2, 1~3
		// (3)�� ������ 0,1,2 �� �߻��� �ϱ� ������ case ������ ���߱� ���ؼ� +1�� ����
		
		switch(mypokemon) {
				
		case 1 :
			System.out.println("�");
			break;
		
		case 2 :
			System.out.println("����");
			break;
			
		case 3 :
			System.out.println("�̻��̻�");
			break;
				
			
			// ���� Ŭ������ ��Ƣġ �Ӹ� �ƴ϶� if���� ������ �� �� �ִ� �̼� Ȯ�� �������� ����� ������.
			
		}

	}

}
