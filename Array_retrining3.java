package pm3;

import java.util.Arrays;

public class Array_retrining3 {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4};
		int[] arr2 = arr1;
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		arr1[0] = 100;
		System.out.println("---구분선---");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		// array 에서는 변경이 실제로도 이루어 진다. arr1의 리스트내용을 arr2가 공유한다는 것을 알 수 있다.
		
		arr2[2] = 200;
		System.out.println("---구분선---");
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		// arr1 이던 arr2 이던 상관이 없이 공유가 이루어 진다.

	}

}
