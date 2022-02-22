package day052;

import java.util.*;
import java.util.Random;
import java.util.Scanner; // *붙이면 유틸 내 모든 패킷을 이용할 수 있음 랜덤과 스캐너는 뺴도 됨

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//로또 번호 생성기
		
		
		System.out.println("로또 생성기");
		Scanner sc =new Scanner(System.in);
		Random rd = new Random();
		
		//6개의 로또번호 저장할 배열
		//보너스 숫자 저장할 변수
		//사용자에게 6갸 숫자 입력 후 저장할 배열
		//사용자에게 보너스 입역받아 저장할 변수
		//동일 한 숫자가 몇개인지 카운팅 할 변수
		
		int lottoer[]=new int[6];
		int user[]=new int[6];
		
		int bonus,bonusUaer;
		int count =0; //중복을 점사할 카운팅
		
		
		for (int i=0; i<6; i++) {
			 lottoer[i] = rd.nextInt(45)+1;
		}
		bonus = rd.nextInt(45)+1;
		System.out.println("숫자 여섯개 입력 :");
		
		System.out.println("로또번호 :"+Arrays.toString(lottoer)+"보너스번호 :"+bonus);
		//사용자에게 6개의 값을 입력
		for(int i=0; i<6; i++) {
			user[i]= sc.nextInt();
		}
		System.out.print("보너스 값 입력 : ");
		bonusUaer = sc.nextInt();
		
		System.out.println("유저 :"+Arrays.toString(user)+"보너스번호 :"+bonusUaer);
		//로또 배열의 값과 사용자 배열의 값중 같은 값이 몇개 있는지 카운팅
		
		for(int j=0; j<6; j++) {
			for(int i=0; i<6; i++) {
		       if(lottoer[j]==user[i]) {
			      count++;
		}
		}		
}
		System.out.println("총 맞춘갯수"+count);
         //카운트의 갯수에 따라서 등수를 정함
         if (count==6) {
        	 System.out.println("축하합니다 1등입니다.");
         }
         else if (count==5) {
        	 if(bonus==bonusUaer) {
        	 System.out.println("축하합니다 2등입니다.");
         }
        	 else {
        		 System.out.println("축하합니다 3등입니다");
        	 }
         }
        	 else if (count==4) {
            	 System.out.println("축하합니다 4등입니다.");
             }
        	 else if (count==3) {
            	 System.out.println("축하합니다 5등입니다.");
             }
        	 else {
        		 System.out.println("꽝");
        	 }
}
}