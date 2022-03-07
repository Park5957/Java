package pm2;

import java.util.Arrays;

public class Array_retrining {

	public static void main(String[] args) {
		
//		boolean[] array5 = new boolean[3];
//		int[] array6 =  new int[5];
//		double [] array7 =  new double[7];
//		String[] array8 =  new String[9];
		int[] a = new int[3];
		a[0] =3;
		a[1] =4;
		a[2] =5;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.print(Arrays.toString(a));
//		int[] b = new int[] {3,4,5};
//		int[]c = {3,4,5};
//		
//		
//		int[] array4;
//		array4=  new int[] {3,4,5};
		
		
		//배열에서의 초기화값 정지
		//int,long,short, char, byte -0으로 초기화
		//boolean - false 로 초기화
		//float, double - 0.0 으로 포기화
		//클래스.. null
		
//		int [] vlue4 = null; //null 로 초기화 하여 오류 미발생 
		boolean[] array1 = new boolean[3];
//		for(int i = 0; i<=3; i++) {
//			System.out.println(array1[i]);
//		}
//		
		for (boolean i : array1) {
			System.out.println(i);
		}
	}

}
