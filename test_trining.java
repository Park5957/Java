package pm;

import java.util.Random;
import java.util.Scanner;

public class test_trining {

	public static void main(String[] args) {
		// 메뉴선택
//		1) 빅맥
//		2) 타코
//		3) 백반
//		원하는 메뉴를 선택하세요 (종료:0)
//		break /continue 꼭 사용할 것
//		Scanner sc = new Scanner(System.in);
//		int pu ;
//		out:
//		while (true) {
//		System.out.print("원하는 메뉴를 선택하세요 (종료:0) : ");
//		pu = sc.nextInt();
//		
//		if (pu == 1){
//			System.out.println("빅맥");
//			continue;
//		}
//		else if (pu == 2) {
//			System.out.println("타코");
//			continue;
//		}
//		else if (pu == 3) {
//			System.out.println("한식");
//			continue;
//		}
//		else if (pu == 0) {
//			System.out.println("프로그램을 종료합다.");
//			break out;
//		}
//		}
		
		// 숫자 하나를 입역받아서 0인지 여부를 판단하는 프로그램을 만드시오
//		}
//	Scanner sc = new Scanner(System.in);
//	
//	System.out.println("숫자를 입력하세요 : ");
//	int pu = sc.nextInt();
//	
//	switch (pu) {
//	case 0 : 
//		System.out.println("0이 맞습니다.");
//		break;
//	
//	default : 
//		System.out.println("0이 아닙니다.");
//		break;
//	}
		
		//90점 이상이면 A 80점 이상이면 B
		// 97 점 이상이면 A+ 97~93은 A0 94미만 A-
//		Scanner sc = new Scanner(System.in);
//		System.out.println("점수를 입력하시기 바랍니다. : ");
//		int pu = sc.nextInt();
//		int i = pu%10;
//		String k = " "; 
//		String j = (i>=7? "+": i<=3? "-":"0");
//		
//		if (pu >=90 ) {
//			k = "A";}
//
//		else if (pu >=80 ) { 
//			k = "B";}
//			
//		else if (pu >=70 ) { 
//			k = "C";
//			}
//		else if (pu >=60 ) { 
//			k = "D";}
//		 			
//		System.out.println("평점은"+k+j+"입니다.");		
		// 가위(1) 바위(2) 보(3) 중 하나를 입력하세요
		// 당신은 1 입니다.
		// 컴은 1 입니다.
//		Scanner sc = new Scanner(System.in);
//		Random rd = new Random(); 
//		System.out.println("가위(1) 바위(2) 보(3) 중 하나를 입력하세요 : ");
//		int pu = sc.nextInt();
//		int r = rd.nextInt(3)+1;
//		
//		if  (pu == r) {
//			System.out.println("당신은"+pu+"입니다."+"\n 컴퓨터는"+r+"입니다.\n 비겼습니다.");}
//		else if (pu == 1) {
//			if (r==2) {
//				System.out.println("당신은"+pu+"입니다."+"\n 컴퓨터는"+r+"입니다.\n 당신이 이겼습니다.");}
//		    if (r==3) {
//		    	System.out.println("당신은"+pu+"입니다."+"\n 컴퓨터는"+r+"입니다.\n 당신이 졌습니다..");}
//		}
//		else if (pu == 2) {
//			if (r==1) {
//				System.out.println("당신은"+pu+"입니다."+"\n 컴퓨터는"+r+"입니다.\n 당신이 이겼습니다.");}
//		    if (r==3) {
//		    	System.out.println("당신은"+pu+"입니다."+"\n 컴퓨터는"+r+"입니다.\n 당신이 졌습니다..");}
//		}
//		else if (pu == 3) {
//			if (r==2) {
//				System.out.println("당신은"+pu+"입니다."+"\n 컴퓨터는"+r+"입니다.\n 당신이 이겼습니다.");}
//		    if (r==1) {
//		    	System.out.println("당신은"+pu+"입니다."+"\n 컴퓨터는"+r+"입니다.\n 당신이 졌습니다..");}
//		}
		Scanner sc = new Scanner(System.in);
		Random rd = new Random(); 
		System.out.println("가위(1) 바위(2) 보(3) 중 하나를 입력하세요 : ");
		int pu = sc.nextInt();
		int r = rd.nextInt(3)+1;
		int k = pu-r;
		switch (k) {
		case 0 : System.out.println("당신은"+pu+"입니다."+"\n 컴퓨터는"+r+"입니다.\n 비겼습니다."); break;
		case -2 :case 1 : System.out.println("당신은"+pu+"입니다."+"\n 컴퓨터는"+r+"입니다.\n 당신이 이겼습니다.");break;
		case 2  :case -1 :System.out.println("당신은"+pu+"입니다."+"\n 컴퓨터는"+r+"입니다.\n 당신이 졌습니다..");break;
		}
	}
	}
	



