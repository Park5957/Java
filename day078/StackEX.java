package day078;

import java.util.Stack;

public class StackEX {

	public static void main(String[] args) {
		Stack<String> s = new Stack<>();
		//1.push() : date in
		s.push("apple");
		s.push("banana");
		s.push("cherry");
		System.out.println(s);
		
		//2.pop(): top date delete
//		System.out.println("pop : " + s.pop());
//		System.out.println(s);
		
		//3.peek() : top date view
		System.out.println("peek : " + s.peek());
		
		//4.search() : start number top(1)
		System.out.println("search(apple) : "+s.search("apple"));
		System.out.println("search(banana) : "+s.search("banana"));
		System.out.println("search(cherry) : "+s.search("cherry"));

	}

}
