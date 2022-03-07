package pm2;

import java.util.Arrays;

public class test_trining6 {

	public static void main(String[] args) {
		int[] arr1 = {5,4,3,2,1};
		int[] arr2 = new int[arr1.length];
		int j = arr1.length-1;
		
		for (int i=0; i<arr1.length; i++) {
			arr2[i] = arr1[j];
			j -=1;			
			}				
		System.out.println(Arrays.toString(arr2));
	}
}
