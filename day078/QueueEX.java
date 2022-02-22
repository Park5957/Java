package day078;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEX {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<String>();
		//1.add(e) : near ��ġ�� e �� ����
		q.add("apple");
		q.add("banana");
		q.add("cherry");
		q.add("tomato");
		
		System.out.println(q);
		
		//2.element : front �� ��ġ�� date�� ��ȯ
		System.out.println("element : " + q.element());
		
		//3.remove : front �� ��ġ�� date�� ��ȯ �� ����
		System.out.println("remove : " + q.remove());
		System.out.println(q);
		
		//4.offer(e) : near ��ġ�� e �� ����
		q.offer("peach");
		System.out.println(q);
		
		//5.peek() : front ��ġ�� �ִ� ������ ���� ��ȯ
		System.out.println("peek : " +q.peek());
		System.out.println(q);
		
		//6.poll() : front �� ��ġ�� date�� ��ȯ �� ����
		System.out.println("poll : " +q.poll());
		System.out.println(q);

	}

}
