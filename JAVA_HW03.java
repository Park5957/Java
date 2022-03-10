package pm4;

import java.util.Scanner;

public class JAVA_HW03 {

	public static void main(String[] args) {
//		HW01
		Scanner sc = new Scanner(System.in);
		System.out.print("a 값을 입력하시기 바랍니다 : ");
		int a = sc.nextInt();
		System.out.print("b 값을 입력하시기 바랍니다 : ");
		int b = sc.nextInt();
		System.out.print("c 값을 입력하시기 바랍니다 : ");
		int c = sc.nextInt();
		
		if (a>b || a==b) {
			if(b>c) {
				System.out.println("최소값은 "+c+"입니다.");
			}
			else {
				System.out.println("최소값은 "+b+"입니다.");
			}
		}
		else if (a<b) {
			if(a<c) {
				System.out.println("최소값은 "+a+"입니다.");
			}
			else {
				System.out.println("최소값은 "+c+"입니다.");
			}
		}
//		HW02
		System.out.print("몇 월 입니까? : ");
		int w = sc.nextInt();
		if (w/3 == 1) {
			System.out.println(w+"월은 봄 입니다.");
		}
		else if(w/3 == 2) {
			System.out.println(w+"월은 여름 입니다.");
		}
		else if(w/3 == 3) {
			System.out.println(w+"월은 가을 입니다.");
		}
		else if(w/3 == 4 || w/3 == 0 ) {
			System.out.println(w+"월은 겨울 입니다.");
			
		}
		else {
			System.out.println("그런 월은 없습니다.");
		}
		
//		HW03
		int x;
		do {System.out.print("100~999 사이의 값을 입력하시오 : ");
			x = sc.nextInt();
			
			}while(x<99 || x>1000);
		
		System.out.println("입력한 값은 "+x+"입니다.");
//		HW04
		System.out.print("임의의 정수를 입력하시오 : ");
		int sum = sc.nextInt();
		int n = 0;
		for (int i = 0; i<=sum; i++) {
			n = n + i;				
		}
		System.out.println(n);
//		HW05
		System.out.print("정방형을 표시할 단수를 입력하시오 : ");
		int k =  sc.nextInt();
		String kk = "*";
		for (int i = 1; i<=k; i++) {
			for (int j = 1; j<=k; j++) {
				System.out.print(kk);
				}
			
			System.out.println();
			}
		}
		}
		
		


