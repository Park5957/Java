package pm15;

import java.util.Arrays;
import java.util.Scanner;

public class test_trining20 {

	public static void main(String[] args) {

//		QUESTION(#41)
//		정사각형
//		모든 공간은 1*1의 크기로 이루어짐
//		시작좌표 1,1(가장 왼쪽)
//		끝 좌표 N,N(가장 오른쪽 아래)
//		여행자 A
//		
//		L : 왼쪽으로 한칸
//		R : 오른쪽으로 한칸
//		U : 위로 한칸
//		D : 아래로 한칸
//		
//		입력조건
//		1. 첫 째 줄에 공간의 크기를 나타내는 N 이 주어진다. (1<= N <=100)
//		2. 둘 째줄에 여행자가 A 가 이동할 계획서 내용이 주어진다. (1<= 이동횟수 <=100)
//		사용자가 최종적으로 도착할 좌표 출력 

//		문제의 해석
//		• 입력예시 5
//		R R R U D D
//		• 출력예시
//		3 4 

//		BACKGROUND
//		구현, implementation
//		• 알고리즘을 소스코드로 바꾸는 과정
//		• 모든 범위의 코딩 문제 유형을 포함하는 개념
//		• 풀이를 떠올리는 것은 쉽지만 코드로 옮기기 어려운 문제
//		• 완전탐색 : 모든 경우의 수를 다 계산하는 방법
//		• 시뮬레이션 : 알고리즘을 한 단계식 차례대로 직접 수행
//		• 파이썬에서 리스트의 크기(크기와 제한시간)
//		▪ 데이터의 개수 1000 메모리 약 4KB
//		▪ 1000000 4MB
//		▪ 10000000 40MB

		Scanner sc = new Scanner(System.in);
		System.out.print("공간형성할 정사각형 최대 값 : ");
		int n = sc.nextInt(); // 공간형성 입력받을 n
		System.out.print("지도입력 갯수 : ");
		int m = sc.nextInt(); // 지도를 입력받기위해 최대값 지정
		
		String[] mapg = { "L", "U", "D", "R" }; // 맵 이동 가이드
//		String[] maping = { "R", "R", "R", "U", "D", "D" }; // 이동할 맵(과제제시)
		System.out.println("이동가이드 :" + Arrays.toString(mapg));
		System.out.println("L : 왼쪽으로 한칸\nR : 오른쪽으로 한칸\nU : 위로 한칸\nD : 아래로 한칸");
		String[] maping = new String[m]; //지도의 최대값 공간 설정
		for (int i = 0; i < m; i++){
			System.out.print("방향을 입력해주세요 : ");
			maping[i] = sc.next();
			if (Arrays.asList(mapg).contains(maping[i])) {
				continue;
			}else {
				if (i > 0) {
				System.out.println("잘못 입력 했습니다.");
				i--;}
				else {
					System.out.println("잘못 입력 했습니다.");
					i = 0;
				}
			}
		}
		

		int[] xc = { 0, 1, -1 }; // x축 이동 값배열
		int[] yc = { 0, 1, -1 }; // y축 이동 값배열



		int ax = 1; // 여행자의 x 축 좌표
		int ay = 1; // 여행자의 y 축 좌표
		int[] a = { ax, ay }; // 여행자의 위치

		while (ax != n && ay != n) {

			for (String i : maping) {
				
				if (i.equals(mapg[0])) {
					if (a[0] == 1) {
						continue;
					} else {
						ax += xc[2];
						ay += yc[0];

					}

				} else if (i.equals(mapg[1])) {
					if (a[1] == 1) {
						continue;
					} else {

						ax += xc[0];
						ay += yc[2];
					}
				}

				else if (i.equals(mapg[2])) {
					if (a[1] == n) {
						continue;
					} else {
						ax += xc[0];
						ay += yc[1];
					}
					
				} else if (i.equals(mapg[3])) {
					if (a[0] == n) {
						continue;
					} else {
						ax += xc[1];
						ay += yc[0];
					}

				}

				a[0] = ax;
				a[1] = ay;

			}break;
		}
		System.out.println("여행자A의 도착지점 :"+ Arrays.toString(a));

	}

}
