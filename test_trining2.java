package pm;

import java.util.Scanner;

public class test_trining2 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("변수 두개를 입력하시기 바랍니다. : ");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		if (a>b) {
//			System.out.println(a+"가 큽니다.");
//		}
//		else if(a<b){
//			System.out.println(b+"가 큽니다.");
//		}
//		else {
//			System.out.println("같습니다.");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("변수 두개를 입력하시기 바랍니다.");
//		System.out.print("a 값을 입력하시오 : ");
//		int a = sc.nextInt();
//		System.out.print("b 값을 입력하시오 : ");
//		int b = sc.nextInt();
//		String c = (a>b? "a가 큽니다" : a<b? "b가 큽니다." : "같습니다." );
//		System.out.println(c);
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("변수 세개를 입력하시기 바랍니다.");
//		
//		ArrayList d = new ArrayList();
//		for (int i = 0; i < 3; i++) {
//			System.out.print(i+"번째 값을 입력하시오 : ");
//			int a = sc.nextInt();
//			d.add(a);
//					
//		}	
//		Collections.sort(d);
//		System.out.println(d);
//		
		Scanner sc = new Scanner(System.in);
		System.out.println("변수 세개를 입력하시기 바랍니다.");
		System.out.print("a 값을 입력하시오 : ");
		int a = sc.nextInt();
		System.out.print("b 값을 입력하시오 : ");
		int b = sc.nextInt();
		System.out.print("c 값을 입력하시오 : ");
		int c = sc.nextInt();
		
		if  (a>b) {int t = a; a = b; b = t;}
		else if  (c>b) {int t = c; c = b; b = t;}
		else if  (b>c) {int t = b; b = c; c = t;}
		
		System.out.println("결과 "+a+" "+b+" "+c);

}
}
		
