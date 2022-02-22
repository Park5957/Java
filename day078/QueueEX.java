package day078;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEX {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		//1.add(e) : near 위치에 e 를 삽입
		q.add("apple");
		q.add("banana");
		q.add("cherry");
		q.add("tomato");
		
		System.out.println(q);
		
		//2.element : front 에 위치한 date를 반환
		System.out.println("element : " + q.element());
		
		//3.remove : front 에 위치한 date를 반환 후 삭제
		System.out.println("remove : " + q.remove());
		System.out.println(q);
		
		//4.offer(e) : near 위치에 e 를 삽입
		q.offer("peach");
		System.out.println(q);
		
		//5.peek() : front 위치에 있는 데이터 값을 반환
		System.out.println("peek : " +q.peek());
		System.out.println(q);
		
		//6.poll() : front 에 위치한 date를 반환 후 삭제
		System.out.println("poll : " +q.poll());
		System.out.println(q);

	}

}
