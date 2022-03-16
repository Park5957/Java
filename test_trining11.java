package pm9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class test_trining11 {
	
	public static void main(String[] args) {
		
//		HW01
		int [] num = {22,57,11,32,91,32,70};
		Scanner sc = new Scanner(System.in);
		System.out.print("찾을 숫자 : ");
		int n = sc.nextInt();
		
		for (int i = 0; i < num.length; i++) {
			if (n == num[i]) {
				System.out.println("그 값은 num["+i+"]"+"에 있습니다.");
				break;
			}
		}
//		HW02,HW03
		Random rd = new Random();
		int[] num2 = new int[7];
		
		 
		for (int i = 0; i < num2.length; i++) {
			int k2 = rd.nextInt(10)+1;
			num2[i] = k2;
			} // 램덤 배열 생성
		
		for (int i = 0; i < num2.length; i++) {
			for (int j = 0; j < num2.length; j++) {
				if (i!=j) {// 중복 값 검수
					while (num2[i] == num2[j]) {//중복 값 재지정
						int k2 = rd.nextInt(10)+1;
						num2[i] = k2;
						}
					}
				}
			}
		System.out.println(Arrays.toString(num2));
//		HW04
		
		int[] num3 = new int[7];
		for (int i = 0; i < num3.length; i++) {
		int k2 = rd.nextInt(100)+1;
		num3[i] = k2;
		} // 램덤 배열 생성
		
		System.out.println(Arrays.toString(num3));
		// 생성된 배열 값 확인
		
		int count = 0;// 반복카운트 겸 인덱스특정
		int num4 = 0; // 임시보관함
		while (count < num3.length) { //래덤으로 자리 재배치 
			int k2 = rd.nextInt(num3.length);
			
			num4 = num3[count];
			num3[count] = num3[k2];
			num3[k2] = num4;
			count +=1;
		}
		System.out.println(Arrays.toString(num3));
		//재배열 확인
		
//		HW05
		int[] num5 = new int[5];
		int[] num6 = new int[5]; //역순넣을 빈 배열
		for (int i = 0; i < num5.length; i++) {
		int k2 = rd.nextInt(20)+1;
		num5[i] = k2;
		} // 램덤 배열 생성
		System.out.println(Arrays.toString(num5)); //랜덤 배열 값 확인
		
		for(int j = 4; j>=0; j--) {
			for (int i : num5) { //역순 배열에 넣은 반복문
				num6[j] = i;
				j -= 1;
		}		
		}
		System.out.println(Arrays.toString(num6)); //역배열 확인
	}
}
		
	

