package day054;

import java.util.Arrays;

public class Array_CP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* �迭�� ����
		 * System.array(src,srcPos,destPos,lenght);
		 * src : ������ �迭
		 * srcPos : ���縦 �ϱ� ������ �ε���(��ġ)
		 * dest : ��� �迭
		 * destPost : ����� ������ �ε���(��ġ)
		 * lenght : ������ ����
		 */
		//������ ������ ���� ����
	     int [] a = {1,2,3,4,5,6};
	     int [] b = {0,0,0,0,0,0,0};
	     System.out.println(Arrays.toString(a));
	     System.out.println(Arrays.toString(b));
	     System.arraycopy(a, 2, b, 3, 4);
	     System.out.println(Arrays.toString(b));
	}

}
