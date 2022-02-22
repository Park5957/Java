package day051;

import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열생성시 초기값 설정
		int[] a =new int[] {10,20,4,25,18};
		int []b =new int[] {1,2,3,4,5,6,7};
		int c[] =new int[10];
		for (int i=0; i<c.length; i++) { //length 는 배열에 포함된 항목의 총 개수
			c[i] = i;
		}
		for (int i=0; i<c.length; i++) { 			
			System.out.print(c[i]);
	
		}
		
		System.out.println();
		System.out.println(Arrays.toString(c)); // c 배열을 문자 값으로 출력할 떄 사용하는 명령어

	}

}
