package day073;

public class Date1 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println("Start Time : " + start);
		int a = 0;
		for (int i = 1; i < 10000000; i++) {
			a++;
		}
		long end = System.currentTimeMillis();
		System.out.println("End Time : " + end);
		System.out.println("Time taken : " + (end - start));

	}

}
