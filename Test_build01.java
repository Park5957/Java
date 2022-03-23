package pm12;

import java.util.Arrays;

public class Test_build01 {

	public static void main(String[] args) {
//	      a = {1,2,3,4}
//	      b = {3,4,5,6}
//	      output -> {1,2,5,6}

		int[] a = { 1, 2, 3, 4 };
		int[] b = { 3, 4, 5, 6 };
		int[] c = new int[4];
		int c_count = 0;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) { //a의 값이 b의 중복인지 확인
				if (a[i] == b[j]) { 
					c[c_count] = 0;
					c_count -= 1; // 중복일시 카운트를 내림
					break; 		  // 이유:해당 카운트로 지정된 c 배열에는 계속해서 값이 들어간 상태
					 			  // 따라서 다음 b 값이 해당 c 배열에 값을 덮어 씌우기 위함.

				} else {
					c[c_count] = a[i];
				}
			}
			c_count++;

			for (int j = 0; j < a.length; j++) { //b의 값이 a의 중복인지 확인
				if (b[i] == a[j]) {
					c[c_count] = 0;
					c_count -= 1; // 중복일시 카운트를 내림
					break;			 // 이유:해당 카운트로 지정된 c 배열에는 계속해서 값이 들어간 상태
									 // 따라서 다음 b 값이 해당 c 배열에 값을 덮어 씌우기 위함.
				} else {
					c[c_count] = b[i];
				}
			}
			c_count++;

		}

		System.out.println(Arrays.toString(c));
		;
	}
}
