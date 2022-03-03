package pm;

import java.util.Scanner;

public class Switch_T2 {

	public static void main(String[] args) {
		//3,4,5 봄입니다
		//6,7,8 여름입니다.
		//9,10,11 가을입니다.
		//12,1,2 겨울입니다.
		//case 5개 이하로 만들것 전체 10개 이하.
//		int mon = 3;
//		switch(mon/3) {
//		case 1:
//			System.out.println("봄입니다.");break;
//		case 2 :
//			System.out.println("여름입니다.");break;
//		case 3 :
//			System.out.println("가을입니다.");break;
//		default : System.out.println("겨울입니다.");	
	//스캐너를 사용해서 날짜를 처리하시오
		Scanner sc = new Scanner(System.in);
		int mon = sc.nextInt();
		switch(mon) {
		case 1:
			System.out.println("Jan");break;
		case 2 :
			System.out.println("Fed");break;
		case 3 :
			System.out.println("Mer.");break;
		case 4 :
			System.out.println("Apr");break;
		case 5 :
			System.out.println("May.");break;
		case 6 :
			System.out.println("Jun.");break;
		case 7 :
			System.out.println("Jul.");break;
		case 8 :
			System.out.println("Aug.");break;
		case 9 :
			System.out.println("Sep.");break;
		case 10 :
			System.out.println("Oct.");break;
		case 11 :
			System.out.println("Nov.");break;
		default : System.out.println("Dec.");
		}
	}

}
