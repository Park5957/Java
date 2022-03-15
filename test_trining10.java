package pm7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class test_trining10 {

	public static void main(String[] args) {
		//HW01
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		int r = rd.nextInt(99)+1;
		int count = 0;
		for (int i = 6; i >= 0; i--) {
			if (i==0) {
				System.out.println("정답은 " +r+"입니다.");
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.print("남은 횟수는" + i +"회 어떤 숫자일까?");
			int e = sc.nextInt();
			count +=1;
			if (e == r) {
				System.out.println(count + "만에 맞추셨습니다. ");
				break;
			}
			else if (e > r) {
				System.out.println("더 작은 숫자 입니다.");
			}
			
			else if (e<r) {
				System.out.println("더 큰 숫자 입니다.");
			}
			
			}
		
		//HW02
		double[] a = new double[5];
		for (int i = 0; i < a.length; i++) {
			System.out.println("a["+i+"] = "+a[i]);
		}
		
		//HW03
		int [] aa = new int[5];
		for (int i = 0; i < aa.length; i++) {

			for (int j = 5; j > 0; j--) {
				aa[i] = j;
				System.out.println("a["+i+"] = "+aa[i]);
				i += 1;
				}
			}
		//HW04
		double[] a3 = new double[5];
		double num2 = 1.1;
		for (int i = 0; i < a.length; i++) {
			a3[i] = num2;
			num2 += 1.1;
			if (i==2) {
				a3[i] = 3.3000000000000003;
			}
			System.out.println("a["+i+"] = "+a3[i]);
		}
		//HW05
		System.out.print("요소의 갯수를 지정하세요 : ");
		int num3 = sc.nextInt();
		int arr[] = new int[num3];
			
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i+1)+"번째 요소를 입혁하시기 바랍니다 : ");
			arr[i] = sc.nextInt();
		}
		System.out.println("a ="+Arrays.toString(arr));

	}
		

			
}



		
		