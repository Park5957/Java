package day056;

import java.util.Scanner;

import javax.swing.event.MenuListener;
import javax.swing.text.html.CSS;

public class Caffe_system {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		//메뉴 주문을 총 5까지 주문이 가능하도록 함
		String meunList[] = new String [5];
		int total = 0;
		
		while (true) {
			System.out.println("****카페****");
			System.out.println("1.주문하기");
			System.out.println("2.취소하기");
			System.out.println("3.결제하기");
			System.out.println("4.끝내기");
			int num = sc.nextInt();
			if(num==1) {
				String meanuName="";
				int menuPrice=0;
				System.out.println("1. 아메리카노 \t3800원");
				System.out.println("2. 에스프레소 \t2400원");
				System.out.println("3. 카페라떼 \t4200원");
				System.out.println("4. 밀크티 \t5100원");
				System.out.println("주문할 메뉴번호");
				int meunNum = sc.nextInt();
				if (meunNum==1) {
					meanuName="아메리카노";
					menuPrice=3800;
				}
				else if (meunNum==2) {
					meanuName="에스프레소";
					menuPrice=2400;
				}
				
				else if (meunNum==3) {
					meanuName="카페라뗴";
					menuPrice=4200;
				}
				else if (meunNum==4) {
					meanuName="밀크티";
					menuPrice=5100;
				}
				else {
					System.out.println("잘못입력하셨습니다.");
					continue; // 반복문 초기화 명령어
				}
				total+=menuPrice; // 토탈 함수에 매 선택마다 가격을 올리는 것임
				meunList[count]=meanuName;
				count++;
				System.out.println("주문한 메뉴는 "+meanuName+"입니다.");
				System.out.println("가격은 "+menuPrice+"입니다.");

			}
			else if(num==2) {
				System.out.println("주문한 메뉴리스트");
				for (int i=0; 1<count; i++) {
					System.out.println(i+1+"."+meunList[i]);
				}
				System.out.println("취소할 메뉴번호:");
				int cancelNum =sc.nextInt();
				if(1<=cancelNum && cancelNum<=count) {
					String delMenu = meunList[cancelNum-1];
					System.out.println(delMenu+"메뉴삭제");
					for (int i=cancelNum-1; i<count; i++) {
						meunList[i]=meunList[i+1];						
					}
					if(delMenu.equals("아메리카노")) {
						total-=3800;
					}
					else if (delMenu.equals("에스프레소")) {
						total-=2400;
					}
					else if (delMenu.equals("카페라떼")) {
						total-=4800;
					}
					else if (delMenu.equals("밀크티")) {
						total-=5100;
					}
					count--;
				}
				
			}
			else if(num==3) {
				System.out.println("결제할 금랙:"+total+"원");
				System.out.println("지불할 금액:");
				int money=sc.nextInt();
				if(money<total) {
					System.out.println("잔돈이 부족합니다.");
					continue;
				}
				else {
					System.out.println("잔돈은 "+(money-total)+"원입니다.");
					total=0;
					for(int i=0; i<5; i++) {
						meunList[i] ="";
				}
					count =0;
					
				}
				
			}
			else if(num==4) {
				System.out.println("반복종료!");
				break;
			}
			else {
				System.out.println("잘못입력하셨습니다.");
			}
		}


	}

}
