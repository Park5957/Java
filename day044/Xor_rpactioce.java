package day044;

public class Xor_rpactioce {

	public static void main(String[] args) {
		
		
		int a=15;//1111
		int b=5;//0101
		int c=-6;
		
		System.out.println(a&b); //0101
		System.out.println(a|b); //1111
		System.out.println(a^b); //1010
		System.out.println(~b); //1010 = 10�ƴ϶� -6�� ����
		// 64��Ʈ ���� 0000 0000 ...... 1010
		//        �� 1111 1111 ...... 0101 �� �ٲ�� ����
		//��ȣ�� ���� ���� ��ǻ�ʹ� ������ �������� ����
		//��ȣ�� ǥ���ϴ� ��Ʈ�� �ֻ��� ��Ʈ
		//ex) 1 0000 0000 0000 ..... 1010
		//�� �� ��Ʈ 1�� 0�� �Ǹ� (-) ���� ����
		System.out.println(~c);
		//  6   0110
		// -6   1010 (4��Ʈ ǥ���� ��� ��) = ~5
		//  0   0000
		
		
		// 15>>2 == 3
		// 5<<4 == 1010 0000 : 80
		// ��Ʈ ����Ʈ �����
		System.out.println(a>>2);
		System.out.println(b<<4);
		
		// ������ ��ĭ �̵������� /2
		// ���� ��ĭ �̵��� ������ *2 
		
		

	}
}
