package day080;

import java.util.ArrayList;

public class ArrylistTryTT {

public static void main(String[] args) {

	String []arr = new String[2];
	arr[0] = "one";
	arr[1] = "two";
	for(int i=0; i<arr.length; i++) {
		System.out.println(arr[i]);
	}
	ArrayList<String> a1 = new ArrayList<>();
	a1.add("one");
	a1.add("two");
	a1.add("three");
	for(int i=0; i<a1.size(); i++) {//size 사용 주의
		
		//String value = (String)a1.get(i);
		//만일 위에 제네릭 설정을 하지 않았다면, 이와같은 형변환도 이루어 질 수 없다.
		System.out.println(i+"인덱스 값 : "+a1.get(i));
	}
	System.out.println("한꺼번에 리스트로 출력하는 방법 : " + a1);
	}

}
