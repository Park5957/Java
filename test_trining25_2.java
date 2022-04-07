package pm20;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class test_trining25_2 {

	public static void main(String[] args) {
//		문제지
//		ALGORITHM HOMEWORK(#62)
//		하나의 수열에는 다양한 수가 존재한다. 이러한 수는 크기에 상관없이
//		나열되어 있다. 이 수를 큰 수 부터 작은 수의 순서로 정렬해야 한다. 
//		수열을 내림차순으로 정렬하는 프로그램을 만드시오.
//		• 첫째 줄에 수열에 속해 있는 수의 개수 N이 주어진다.
//		• 둘째 줄부터 N+1번째 줄까지 N개의 수가 입력된다.
//		• 수의 범위는 1 이상 100000 이하의 자연수이다. 
//		입력으로 주어진 수열이 내림차순으로 정렬된 결과를 공백으로
//		구분하여 출력한다. 동일한 수의 순서는 자유롭게 출력해도 괜찮다.
		
//		예시
//		입력
//		3
//		15
//		27
//		12
//		
//		출력
//		27 15 12
		
//		조건
//		1. 총 갯수는 N을 입력받아 처리함.
//		2. 수의 범위는 1~100000
//		3. 입력받은 수를 내림차순으로 정렬 출력

			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();	// 배열크기입력
			Integer[] arr = new Integer[n];	// n크기 배열선언
			
			for(int i =0; i<n; i++) {
				arr[i] = sc.nextInt();	// 배열값 입력
			}
			
			Arrays.sort(arr, Collections.reverseOrder());	//Collections클래스의 reverseOrder함수를 이용해서 거꾸로 정렬
			System.out.println(Arrays.toString(arr));	// 결과물 산출 
		}

	}