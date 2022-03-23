package pm12;

import java.util.Arrays;

public class Test_build02 {

	public static void main(String[] args) {
//      a = {1,2,3,4}
//      b = {3,4,5,6}
//      output -> {1,2,5,6}

		int[] a = { 1, 2, 3, 4 };
		int[] b = { 3, 4, 5, 6 };
		int[] c = new int[4];
		int c_count = 0;

		for (int i = 0; i < a.length; i++) { // 중복값을 0 으로 지정
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					a[i] = 0;
					b[j] = 0;

				}
			}
		}
		for (int i = 0; i < a.length; i++) { // 0을 제외한 나머지 값을 c로 지정
			if (a[i] != 0) {
				c[c_count] = a[i];
				c_count++;
			}
			if (b[i] != 0) {
				c[c_count] = b[i];
				c_count++;
			}
		}
		System.out.println(Arrays.toString(c));
	}
}
