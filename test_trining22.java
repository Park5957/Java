package pm17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test_trining22 {

	public static void main(String[] args) {
//		조건
//		1. N*M 크기의 얼음판
//		2. 구멍이 뚫린 부분은 0
//		3. 칸막이가 존재하는 부분은 1
//		4. 0끼리 상,하,좌,우 로 붙어있는 경우 연결된 것으로 간주
//		5. 0끼리 연결된 전체를 하나로 간주
//		6. 총 0으로 이루어진 덩어리 갯수를 출력

//		예시
//		 4*5 의 틀에서
//		 00110
//		 00011
//		 11111
//		 00000
//		 총 아이스크림의 생산 갯수는 3개

//		BACKGROUND
//		• DFS로 해결
//		• 얼음을 얼릴수 있는 공간이 상,하,좌,우로 연결되어 있다고 표현
//		• 그래프 형태로 모델링
//		1. 특정한 지점의 주변 상,하,좌,우를 살펴본 뒤에 주변 지점 중
//		값이‘0’이면서 아직 방문하지 않은 지점이 있다면 방문
//		2. 방문한 지점에서 다시 상,하,좌,우를 살펴보면서 방문을 다시
//		진행하면,연결되 모든 지점을 방문할 수 있다. 
//		• 1~2번의 과정을 모든 노드에 반복하여 방문하지 않은 지점의 수를 센다

//		구성
//		1. N 입력받기
//		2. M 입력받기
//		3. 가로길이의 아이스크림틀 입력

		Scanner sc = new Scanner(System.in);
		System.out.print("N 의 값을 입력하시 바랍니다. : ");
		int n = sc.nextInt(); // 세로Y
		System.out.print("M 의 값을 입력하시 바랍니다. : ");
		int m = sc.nextInt(); // 가로X

		int[][] icearr = new int[n][m]; // 아이스크림 틀

		for (int i = 0; i < n; i++) {// 배열에 아이스크림틀 입력용
			System.out.print((i + 1) + "번 째 아이스크림 틀을 입력하시기 바랍니다. : ");
			String num = sc.next();

			if (num.length() != m) { // 사용자 입력값이 icearr의 배열값을 초과할 시 재입력요청
				System.out.println("잘못 입력하셨습니다 다시 입력하세요");
				i--;
			} else { // 정상적으로 입력했음을 확인
				String[] numSplit = num.split("");

				for (int j = 0; j < m; j++) { // else로 넘어왔음으로 icearr에 순차적으로 사용자 입력값 입력을 진행
					icearr[i][j] = Integer.parseInt(numSplit[j]); // String을 int로 변환
				}

			}
		}
//		System.out.println(Arrays.deepToString(icearr)); //2차원 배열 icearr이 정상적으로 입력되었는지 확인용

		
		int[] tagetX = { 1, -1 }; // 가로
		int[] tagetY = { 1, -1 }; // 세로

		ArrayList<Integer> icearr0 = new ArrayList<>(); // 0의 좌표값 가로 보관용
		ArrayList<Integer> icearr1 = new ArrayList<>(); // 0의 좌표값 세로 보관용

		for (int i = 0; i < n; i++) { // 0의 좌표 특정을 위한 for문
			for (int j = 0; j < m; j++) {

				if (icearr[i][j] == 0) {
					icearr0.add(i);
					icearr1.add(j);

				}

			}
		}


		for (int i = 0; i < icearr0.size(); i++) { // 특정된 0좌표값을 이용해 인접한0이 존재하는지 확인후 icearr의 인접한 0을 1로 변환
			int n2 = icearr0.get(i);
			int m2 = icearr1.get(i);

			for (int k = 0; k < tagetY.length; k++) {
				int m3 = m2 + (tagetY[k]);
				int n3 = n2 + (tagetY[k]);

				if (n3 < 0 || m3 < 0) {
					continue;
				} else if (n3 >= n || m3 >= m) {
					continue;
				}

				// 수정해야됨 (1.붙어있는 0을 1로 제거를 해야함.)
				//		  (2.최초 0은 1로 제거되면 안됨)
				
				// 아래의 코드는 최초 인접한 십자가형 거리의 0만을 제거함.
				if (icearr[n2][m2] == icearr[n2][m3]) {
					icearr[n2][m3] = 1;

					}
				if (icearr[n2][m2] == icearr[n3][m2]) {
					icearr[n3][m2] = 1;
					}

			}

		}

		int count = 0; // 0의 남은 갯수확인

		for (int i = 0; i < n; i++) { // 0의 좌표 특정을 위한 for문
			for (int j = 0; j < m; j++) {

				if (icearr[i][j] == 0) {
					count++;
				}
			}
		}
		System.out.println(Arrays.deepToString(icearr));
		System.out.println("아이스크림의 갯수 : " + count);

	}
}
