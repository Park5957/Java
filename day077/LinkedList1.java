package day077;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		// 요소들이 서로 연결되어 있는 리스트
		// 물리적 거리보다는 논리적으로 연결되어 있는 리스트
		// 아래의 code는 Array 와 Likned 의 리스트 입력 시간의 차이를 보기 위한 것이다.
		// 결과적으로 LinkedList 의 속도가 훨씬 빠르다는 것을 알 수 있다.
		ArrayList a1 = new ArrayList();
		LinkedList ll = new LinkedList();
		
		long start = System.currentTimeMillis(); // 밀리단위 초 값을 정수로 반환
		
		for(int i=0; i<100000; i++) {
			a1.add(0,String.valueOf(i));
		}
		long end = System.currentTimeMillis();
		System.out.println("ArrayList 작업시간:" +(end-start));
		
		start = System.currentTimeMillis();
		for(int i=0; i<100000; i++) {
			ll.add(0,String.valueOf(i));
		}
		end = System.currentTimeMillis();
		System.out.println("LinkedList 작업시간 : " + +(end-start));


	}

}
