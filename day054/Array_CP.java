package day054;

import java.util.Arrays;

public class Array_CP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 배열의 복제
		 * System.array(src,srcPos,destPos,lenght);
		 * src : 복사할 배열
		 * srcPos : 복사를 하기 시작할 인덱스(위치)
		 * dest : 덮어쓸 배열
		 * destPost : 덮어쓰기 시작할 인데스(위치)
		 * lenght : 복사할 길이
		 */
		//복사의 과정에 대한 예시
	     int [] a = {1,2,3,4,5,6};
	     int [] b = {0,0,0,0,0,0,0};
	     System.out.println(Arrays.toString(a));
	     System.out.println(Arrays.toString(b));
	     System.arraycopy(a, 2, b, 3, 4);
	     System.out.println(Arrays.toString(b));
	}

}
