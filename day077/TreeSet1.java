package day077;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		//set 의 특징은 중복을 허용하지 않는다.
		HashSet hs = new HashSet(); // 출력시 순서가 없음
		hs.add("demon");
		hs.add("banana");
		hs.add("tomato");
		hs.add("apple");
		hs.add("cargo");
		
		TreeSet ts = new TreeSet(); // 알파벳 순서대로 정렬되어 출력됨
		ts.add("demon");
		ts.add("banana");
		ts.add("tomato");
		ts.add("apple");
		ts.add("cargo");	
		
		Iterator it=hs.iterator(); // 위에 들어있는 내용을 끄집어 내기 위한 방법>
		System.out.println("<Hash Set 출력>");
		while (it.hasNext()) { //이와 같은 반복을 설정한다면 it에서 더이상 가지고 올 요소가 없을때 까지 가ㅈ고옴
			System.out.print(" "+it.next());
	      }
		System.out.println();
		System.out.println("현재 Hash Set의 크기 : "+hs.size());
		
		System.out.println();
		System.out.println("<Tree Set 출력>");
		Iterator it2=ts.iterator(); // 위에 들어있는 내용을 끄집어 내기 위한 방법>
		while (it2.hasNext()) { //이와 같은 반복을 설정한다면 it2에서 더이상 가지고 올 요소가 없을때 까지 가ㅈ고옴
		      System.out.print(" "+it2.next());
		      }
		System.out.println();
		System.out.println("현재 TreeSet의 크기 : "+ts.size());
	}

}
