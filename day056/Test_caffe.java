package day056;

import java.util.Arrays;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Test_caffe {

	public static void main(String[] args) {
		
		/* 카페만들기
		 * 알고리즘 작성
		 * 주문하기, 취소하기, 결제하기, 끝내기
		 * 아메리카노 3800원
		 * 에스프레소 2400원
		 * 카페라떼 4200원
		 * 밀크티 5100원
		 * 
		 * 
		 * 주문을 가능한 메뉴를 출력한다
		 * 주문 받을 메뉴를 입력받는다
		 * 주문한 메뉴의 가격을 총 금액에 누적한다
		 * 주문한 메뉴를 전체 메뉴리스트에 기입한다
		 * 주문한 개수를 한 개 증가한다
		 * 
		 * 
		 */
		
		/* 제작에 필요한 요소
		 * 1. 주문을 받기위한 출력 메세지
		 * 2. 각 메뉴과 가격을 표시하는 메세지
		 * 3. 주문을 입력받을 코드
		 * 4. 주문 취소를 입력받을 코드
		 * 5. 주문받은 메뉴의 출력 메세지
		 * 6. 주문받은 메뉴의 각 가격의 출력메세지
		 * 7. 촙 합계 금액의 출력 메세지
		 * 8. 결제 출력 메세지
		 * 9. 결제 금액을 입력받을 코드
		 * 10. 계산후 잔액을 표시 출력 메세지
		 * 11. 끝
		 * 
		 * 필요한 배열 및 변수의 종류
		 * 1. 메뉴 이름 배열
		 * 2. 메뉴 가격 배열
		 * 3. 주문받을 메뉴 배열
		 * 4. 주문받은 메유 가격 배열
		 */
		Scanner sc = new Scanner(System.in);
		
		String s[] = new String[] {"","아메리카노", "에스프레소", "카페라떼", "밀크티"};
		int i[] = new int [] {0,3800,2400,4200,5100};
		String menu[] = new String[] {" ","주문하기","취소하기","결제하기","끝내기"};
//		String ss[] = new String[4][4];
		int call[]= new int[5];
		

		
		
		while (true) {
			System.out.println("******카페 자동 주문기******");
			for (int j = 1; j <= 4; j++) {
				System.out.print(j + "번 : " + menu[j] + " / ");
			}
			String odrneam;
			int obrpy=0;
			System.out.println();
			System.out.print("여기에 번호를 입력해 주시기 바랍니다 : ");
			int m = sc.nextInt();

			if (m == 1) {
				for (int k = 1; k < 5; k++) {
					System.out.print(k + "번:" + s[k] + ":" +   i[k] + "원" + " / ");
				}
				System.out.println();
				System.out.println("주문할 음료의 번호를 입력해 주시기 바랍니다. :");
				
				for (int q = 1; q < 5; q++) {
					
					call[q]=sc.nextInt();
					
				}
			
				System.out.println("주문하신 내역이" + Arrays.toString(call) + "이 맞습니까? 맞다면 1을. 틀리다면 2를 입력해 주시기 바랍니다." );
				int YN = sc.nextInt();
				if ( YN==1 ) {
					System.out.println("결제하실 금액을 입력해 주시기 바랍니다.");
					int pyU = sc.nextInt();
					if (pyU > obrpy) {
						System.out.println("잔액은" + (pyU-obrpy) + "입니다.");
					}
					else if(pyU < obrpy) {
						System.out.println("금액이 부족합니다.");
					}
					else {}
				}
				else if (YN==2) {
					System.out.println("처음으로 돌아갑니다.");
				}
				else {
					System.out.println("잘못입력하셨습니다.");
					continue;
			}
			}	
			
				
				
			
			else if (m<=3) {
				System.out.println("잘못 입력하셨습니다. 다시 선택해 주시기 바랍니다.");
				continue;
			}
			else if (m==4) {
				System.out.println("종료합니다. 이용해 주셔서 감사합니다.");
				break;
			}
			else {
				System.out.println("잘못 입력하셨습니다. 다시 선택해 주시기 바랍니다.");
				continue;
			}
	
	}
}
}


