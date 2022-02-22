package day077;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10); // 10이라는 공간을 설정한 ArrayList
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		System.out.println("초기상태");
		System.out.println(list1); // 추가된 순서대로 리스트가 작성이 되었음을 알 수 있음
		
		System.out.println("인덱스 1 위치에 B를 추가");
		list1.add(1,"이거");
		System.out.println(list1);
		
		System.out.println("인덱스 2위치의 값 삭제:");
		list1.remove(2); // 자바는 index 값이 0,1,2,3,4,5 순으로 진행되니 주의
		System.out.println(list1);
		
		System.out.println("인덱스 2 위치의 값 반환 : " + list1.get(2));
		
	

	}

}
