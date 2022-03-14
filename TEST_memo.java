package pm6;

import java.util.Arrays;

public class TEST_memo {

	public static void main(String[] args) {
		// 배열, 반복, 조건
		// 주석, 클래스, 객체
//		Q1 첫 수 부터 숫자 2개씩을 나누어 출력하세요
		
//		int [] a = {1,2,3,4,5};
//		
//		for(int i = 0; i<a.length-1; i++) {
//			System.out.print(a[i]+","+a[i+1]);
//			System.out.println();
//		}
//		Q2 첫 수 부터 숫자 2개씩을 더한 값이 짝수인 그 해당 숫자 2개의 인덱스 번호를 배열로
		//만들어 줄력하시오
		A c = new A();
		c.m();
	}
}
class A {
	int [] a = {1,3,4,5,6};
	void m(){
		int [] b = new int[2];
		for(int i = 0; i<a.length-1; i++) {
			if ((a[i]+a[i+1])%2 == 0) {
			b[i] = i;
			b[i+1] = i+1;
			}
			}
		System.out.println(Arrays.toString(b));
	}
}
