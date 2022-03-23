package pm12;

import java.util.Scanner;

public class Test_build03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정숫값입력 : ");
		int a = sc.nextInt();
		int b = 0;
		while (a != 0) {
			b = b + a % 10;
			a = a / 10;
			if (a != 0) {
				b = b * 10;
			}
		}
		System.out.println(b);

	}

}
