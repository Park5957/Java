package day053;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int scores[][] = new int[4][3];
		String subject[] = { "국어", "영어", "수학" }; // string subject 는 배열에 이름을 지정하여 저장하는 것
//2차원 배열을 활용해서 사용자에게 입력받은 값 지정하는 방법
		for (int j = 0; j < 4; j++) {
			System.out.println((j + 1) + "번 학생 점수 ---");

			for (int i = 0; i < 3; i++) {
				System.out.print(subject[i] + ":"); //subject를 통해 지정된 배열에 점수를 입력한다는 메세지
				scores[j][i] = sc.nextInt(); // 해당 배열 위치에 입력을 받음
			}
		}
		//2차원 배여에 저장된 값을 출력
		for(int i=0; i<3; i++) {
			System.out.print("\t"+subject[i]);
		}
		System.out.println();
		for (int j = 0; j < 4; j++) {
			System.out.print(j + 1 + "번:\t");
			for (int i = 0; i < 3; i++) {
				System.out.print(scores[j][i] + "\t");
			}
			System.out.println();
		}

	}
}