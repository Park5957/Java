package pm;

import java.util.Random;
import java.util.Scanner;

public class test_trining4 {

	public static void main(String[] args) {
		// 숫자 맟추기 게임
		// 10~99 사이를 맞추기
		Scanner sc = new Scanner(System.in);
		Random rd = new Random(); 
		System.out.println("숫자 맞추기 게임 : ");
		int pu;
		int r = 10+rd.nextInt(90); // 특정범위 지정
		do {			
		pu = sc.nextInt();
		if(pu > r) {System.out.println("더 작은 수 입니다.");}
		else if(pu < r) {System.out.println("더 큰 수 입니다.");}
		}while (pu != r);
		System.out.println("정답니다.");
		}
}
