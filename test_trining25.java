package pm20;

import java.util.Arrays;
import java.util.Scanner;

public class test_trining25 {

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
		
		HW62 hw = new HW62(); // 재정렬 판독기를 생성
		hw.arrlen(); // 리스트 생성 매서드 실행
		
		int[] arry = hw.arrget(); // DB에 보관중인 생성된 리스트를 뽑아냄
//		System.out.println(Arrays.toString(arry)); //정상입력 확인용
		
		hw.highlist(arry); // 내림차순 재정렬 매서드 실행
		
	}

}

class HW62{ //리스트생성 및 재정렬 판독 class
	Scanner sc = new Scanner(System.in); //입력선포
	private int n; //DB 역할용 보관 //연습용코드. 필요는 없음
	private int[] arr; // DB 역할용 배열보관 //연습용코드. 필요는 없음
	
	public void arrlen() { //배열지정매서드
		System.out.print("총 길이를 입력해 주시기 바랍니다 : ");
		int n = sc.nextInt(); //배열 총 길이 지정
		int[] arr = new int[n]; //배열생성
		
		String me = "1~100000 사이의 값만 입력이 가능합니다.";
		System.out.println(me);//메세지 출력용
		
		for (int i=0; i<n; i++) {
			System.out.print(i+1+"번 째 번호를 입력해 주시기 바랍니다.");
			int num = sc.nextInt(); //배열 순번에 따라 입력
			if(num<1 && num>100000) { //입력해야할 값 최소 최대값 초과시 재입력요청
				System.out.println(me);
				i--;
			}else {
				arr[i] = num; //정상 값이면 입력진행
				
			}this.arr = arr; // DB배열에 보관
		}
	}
	int[] arrget() { //입력배열 출력 매서드
		int[]arry = this.arr;
		
		return arry;
		
	}
	void highlist(int[] a) { //재정렬메서드
		
		for (int i =0; i<a.length; i++) {
			int copy=0; // 재정렬 보관용 변수
			if(i+1 <a.length) {
				for(int j = i+1; j<a.length; j++) { //정렬 비교 기준값 이후의 모든 값과 높낮음을 확인
					if(a[i]<a[j]) {
						copy = a[i];
						a[i] = a[j];
						a[j] = copy;
				}
			
			}
		}else{
			break; // 판독 범위 초과시 정지
		}} System.out.println(Arrays.toString(a)); // 재정렬 출력
	}
	
	
}
