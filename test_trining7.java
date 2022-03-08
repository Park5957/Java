package pm3;

import java.util.Arrays;

public class test_trining7 {

	public static void main(String[] args) {
		//5개의 원소 순서대로 출력 for each 를 사용
		int [] a = {1,2,3,4,5};
		for (int i : a) {
			System.out.println(i);
		}
		
		//b라는 2차원 배열을 생성하시오
		int[][] b = {{1,3,5},{7,9}};
		
//		for (int[] i : b) {
//			for (int j : i) {
//				System.out.println(j);
//			}
//		}
		//이중 for 문을 사용하여 출력
		System.out.println("--- 구분선 ---");
		for (int i = 0; i <b.length; i++) {
			for (int j = 0; j < b[i].length ; j++) {
				System.out.println(b[i][j]);
			}
		}
		
//		String str = "내 이름은 [홍길동] 입니다. 나이는 [15]살 입니다.";
//		name = "홍길동"; age = 15;
//		indexOf, lastIndexOf, substring 모두 사용
		
		String str = "내 이름은 [홍길동] 입니다. 나이는 [15]살 입니다.";
		int name1 = str.indexOf('[')+1;
		int age1 =str.lastIndexOf(']');
		String name = str.substring(name1,10);
		String age = str.substring(22,age1);
		System.out.println(name);
		System.out.println(age);
		
		
		
	}

}
