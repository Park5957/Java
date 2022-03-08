package pm3;

import java.util.Random;
import java.util.Scanner;

public class JAVA_HW02 {

	public static void main(String[] args) {
//		HW01
		System.out.println("---HW01---");
		Random rd = new Random();
		int a = 1+rd.nextInt(10);
		int b = 1+rd.nextInt(10)*-1;
		int c = 10+rd.nextInt(90);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
//		HW02
		System.out.println("---HW02---");
		Scanner sc = new Scanner(System.in);
		System.out.print("성을 입력하시오 : ");
		String n = sc.next();
		System.out.print("이름을 입력하시오 : ");
		String nn = sc.next();
		
		System.out.println("안녕하세요. "+n+nn+" 씨.");
		
//		HW03
		System.out.println("---HW03---");
		System.out.print("임의의 정수를 입력하시오 : ");
		int num1 = sc.nextInt();
		System.out.print("약수인지 확인할 값을 입력하시오 : ");
		int num2 = sc.nextInt();
		
		if (num1%num2 == 0) {
			System.out.println(num2+ "는 " + num1+"의 약수 입니다.");
		}
		else {
			System.out.println(num2+ "는 " + num1+"의 약수가 아닙니다.");
		}
//		HW04
		System.out.println("---HW04---");
		System.out.print("임의의 정수를 입력하시오 : ");
		int num3 = sc.nextInt();
		String num4 = ( num3>0? "값이 양수입니다.":num3==0? "값이0입니다.":"값이 음수입니다.");
		System.out.println(num4);
//		HW05
		System.out.println("---HW05---");
		System.out.print("aa변수의 값을 입력하시기 바랍니다. : ");
		int aa = sc.nextInt();
		System.out.print("bb변수의 값을 입력하시기 바랍니다. : ");
		int bb = sc.nextInt();
		String num5 = ( aa>bb? "aa가 더 큽니다.":aa==bb? "aa와 bb는 같습니다.": "bb가 더 큽니다.");
		System.out.println("결과 \n"+"변수aa : "+aa+"\n"+"변수bb : "+bb+"\n"+num5);

	}

}
