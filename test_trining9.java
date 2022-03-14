package pm6;

import java.util.Scanner;

public class test_trining9 {

	public static void main(String[] args) {
//		HW01
		String k = "*";
		for (int i=0; i < 5; i++) {
			for (int j=0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---절취선---");
		for (int i=5; i > 0; i--) {
			for (int j = i; j > 0; j--) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
//		HW02
		Scanner sc = new Scanner(System.in);
		System.out.print("소수를 확인할 정수를 입력하시오 : ");
		int num = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num%i == 0) {
				count += 1;
			}
		}
		if (count <= 2 ) {
			System.out.println(num+"은 소수 입니다.");
		}
		else {
			System.out.println(num+"은 소수가 아닙니다.");
		}
		
//		HW03
		System.out.print("정수를 더합니다. 몇개를 더할까요? : ");
		int num2 = sc.nextInt();
		int arr[] = new int[num2];
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print((i+1)+"번째 정수를 입혁하시기 바랍니다 : ");
			arr[i] = sc.nextInt();
			sum = arr[i] + sum; 
		}
		System.out.println("합계는 " + sum);
		System.out.println("평균은 " + (sum/arr.length));
		
//		HW04
		System.out.print("정수를 더합니다. 몇개를 더할까요? : ");
		int num3 = sc.nextInt();
		int arr2[] = new int[num3];
		int sum2 = 0;
		int count2 = 0;
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.print((i+1)+"번째 정수를 입혁하시기 바랍니다 : ");
			arr2[i] = sc.nextInt();
			if (arr2[i] + sum2 > 1000) {
				System.out.println("마지막 값이 1000을 넘었습니다.\n마지막 값은 무시합니다.");
				break;
			}
			else {					
				sum2 = arr2[i] + sum2;
				count2 += 1;
				}
			}
		System.out.println("합계는 " + sum2);
		System.out.println("평균은 " + (sum2/count2));
			
//		HW05
		
		System.out.print("정수를 더합니다. 몇개를 더할까요? : ");
		int num4 = sc.nextInt();
		int arr3[] = new int[num4];
		int sum3 = 0;
		int count3 = 0;
		
		for (int i = 0; i < arr3.length; i++) {
			System.out.print((i+1)+"번째 정수를 입혁하시기 바랍니다 : ");
			arr3[i] = sc.nextInt();
			if (arr3[i] < 0) {
				System.out.println("음수는 더하지 않습니다.");
			}
			else {					
				sum3 = arr3[i] + sum3;
				count3 += 1;
				}
			}
		System.out.println("합계는 " + sum3);
		System.out.println("평균은 " + (sum3/count3));
		
		
		}
		}


	


