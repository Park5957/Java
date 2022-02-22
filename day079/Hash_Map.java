package day079;

import java.util.HashMap;
import java.util.Scanner;

public class Hash_Map {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<String,String>();
		Scanner sc = new Scanner(System.in);
		
		//1. put
		hm.put("apple","사과");
		hm.put("paper","종이");
		hm.put("flower","꽃");
		
		String voca; 
		System.out.println("알고싶은 단어를 입력하세요 : ");
		voca = sc.nextLine();
		//2.containsKey(key) : 해당 key 가 hashmap에 존재한다면 true
		if(hm.containsKey(voca)) {
			//3.get(key) : value 값 반환
			System.out.println("해당하는 뜻은? : " +hm.get(voca));
		}
		else {
			System.out.println("해당 단어에 대한 뜻은 데이터베이스에 없습니다.");
		}

	}

}
