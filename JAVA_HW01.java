package pm3;

import java.util.Arrays;
import java.util.Scanner;

public class JAVA_HW01 {

	public static void main(String[] args) {
//		HW01
		System.out.println("홍");
		System.out.println();
		System.out.println("길");
		System.out.println("동");
		System.out.println();
		System.out.println("홍 \n\n길\n동");
		System.out.println();
//		HW02
		int x = 63;
		int y = 18;
		System.out.println(x+y);
		int c = x+y;
		System.out.println(c/2);
		System.out.println();
//		HW03
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시기 바랍니다. : ");
		int num = sc.nextInt();
		System.out.println(num+"를 입력했습니다.");
		System.out.println();
//		HW04
		System.out.print("정수를 입력하시기 바랍니다. : ");
		int num2 = sc.nextInt();
		System.out.println("10을 더한 값은"+(num2+10)+"입니다.");
		System.out.println("10을 뺀 값은"+(num2-10)+"입니다.");
		System.out.println();
//		HW05
		System.out.print("정수를 입력하시기 바랍니다. : ");
		int num3 = sc.nextInt();
		System.out.println("마지막 자릿수를 제외한 값은 : "+num3/10);
		System.out.println("마지막 자릿수는 : "+num3%10);
		
		
		
		
				
		
		
	}

}
