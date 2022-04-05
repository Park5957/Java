package pm19;

import java.util.Arrays;
import java.util.Scanner;

public class test_trining24 {

	public static void main(String[] args) {

//		조건
//		1. N*M 크기의 미로
//		2. 미로에 괴물이 있음 피해야함
//		3. 사용자는 한번에 한칸 이동가능
//		4. 사용자의 위치는 (1,1)
//		5. 괴물이 있는 위치는 0 없으면 1
//		6. 사용자가 탈출을 하기위해 이동해야 하는 칸의 갯수(최소)

//		입력조건
//		1. n와 m은 (4<=n, M<=200)
//		2. n개의 줄 각각에 m(0,1)을 한줄로 입력처리(공백없이)
//		3. 시작칸과 마지막 (0,0)(n,m) 은 무조건 1로 처리

//		출력조건
//		1. 이동한 칸의 갯수

//		예시)
//		입력
//		5,6
//		101010
//		111111
//		000001
//		111111
//		111111

//		출력
//		10

//		필수조건추측
//		공간과 시작 위치 특성상
//		남 동 북 서 순으로 길이 있는지 파악하면 최단 루트 측정 가능(이유 최초의 이동이 남쪽과 동쪽)
//												 도착지가 오른쪽 아래 맨 끝이기 때문
//												서쪽과 북쪽은 돌아가는 길이기 때문에 최후에 검증을 해야함.)

//		System.out.println(Arrays.deepToString(MazeSize)); // 미로생성이 제대로 되었는지 확인용

//		검증기
		MAZE ma = new MAZE();

		int n = ma.MazeSizeScN();
		int m = ma.MazeSizeScM();

		int[][] MazeSize = ma.MazeSize(n, m);

		System.out.println(Arrays.deepToString(MazeSize)); // 미로생성이 정상적으로 완료 되었는지 확인.

		int[] location = { 1, 1, -1, -1 }; // 사용자 좌표 이동을 위한 배열
											// location[0] 은 남쪽으로 이동 이 후 동 북 서 로 사용 될 것임

		boolean ss = true; // 각 남 동 북 서 진입 가능여부 판독기
		boolean es = true; // 초기 값 지정이 가능한 이유는 처음 시작 위치가 0,0 고정이기 때문
		boolean ns = false;
		boolean ws = false; // true면 진입 가능 false면 진입 불가능

		int[] user = { 0, 0 };// 사용자의 위치
		int MoveCount = 1; // 최초의 지점부터 1을 적용하기 때문에 1로 지정
							// 사용자가 몇번이나 움직이는지 판단

		while (user[0]+user[1] != (n-1)+(m-1)) {
//			System.out.println("유저 현재 위치 확인" + Arrays.toString(user));

			if (user[0] + location[0] < n && MazeSize[user[0] + location[0]][user[1]] == 1) {
				ss = true;

			} else {
				ss = false;
			}

			if (user[1] + location[1] < m && MazeSize[user[0]][user[1] + location[1]] == 1) {
				es = true;
			} else {
				es = false;
			}
			if (user[0] + (location[2]) >= 0 && MazeSize[user[0] + (location[2])][user[1]] == 1) {
				ns = true;
			} else {
				ns = false;
			}

			if (user[1] + (location[3]) >= 0 && MazeSize[user[0]][user[1] + (location[3])] == 1) {
				ws = true;
			} else {
				ws = false;
			}

			try {
				if (ss == true) {
					user[0] = user[0] + location[0];
					user[1] = user[1];
					MoveCount++;
					System.out.println("ss:" + ss + Arrays.toString(user));

				} else {

					if (es == true) {

						user[0] = user[0];
						user[1] = user[1] + location[1];
						MoveCount++;
						System.out.println("es:" + es + Arrays.toString(user));
					} else {

						if (ns == true) {

							user[0] = user[0] + (location[2]);
							user[1] = user[1];
							MoveCount++;
							System.out.println("ns:" + ns + Arrays.toString(user));
						} else {

							if (ws == true) {

								user[0] = user[0];
								user[1] = user[1] + (location[3]);
								MoveCount++;
								System.out.println("ws:" + ws + Arrays.toString(user));
							}
						}

					}

				}

			} catch (Exception e) {
				System.out.println("탈출이 불가능한 미로입니다. 미로를 다시 설정해 주시기 바랍니다.");
				break;
			}
		}
		System.out.println("정상적으로 탈출 했습니다. 총 이동거리는 " + MoveCount + "입니다.");

	}

}

class MAZE {
	Scanner sc = new Scanner(System.in);
	private int n;
	private int m;

	int MazeSizeScN() {
		System.out.print("N 의 값을 입력하시 바랍니다 : ");
		int n = sc.nextInt(); // 세로Y
		return n;
	}

	int MazeSizeScM() {
		System.out.print("M 의 값을 입력하시 바랍니다 : ");
		int m = sc.nextInt(); // 가로X
		return m;

	}

	public int[][] MazeSize(int n, int m) {

		int[][] MazeSize = new int[n][m];
		do {

			for (int i = 0; i < n; i++) {
				System.out.print("[0괴물 있음,1괴물 없음]\n" + (i + 1) + "번 째 행의 열을 입력하시기 바랍니다 : ");
				String MazeColumn = sc.next(); // 각 행의 열에 들어갈 값 입력

				if (MazeColumn.length() == m) { // 정상입력 여부(x축인 가로의 최대값과 같아야 함.
					String[] MazeColumnSplit = MazeColumn.split("");// 입력받은 값 분해 리스트 재배치
					for (int j = 0; j < m; j++) {// 분해된 값 미로에 입력
						MazeSize[i][j] = Integer.parseInt(MazeColumnSplit[j]); // String 을 int 로 변환하여 입력
					}

				} else { // x축(가로의 크기)를 벗어나거나 혹은 부족할 시 재입력 요청
					System.out.println("잘못 입력하셨습니다. 다시 입력해 주시기 바랍니다.");
					i--; // 잘못입력된 행으로 돌아가기 위함
				}
			}
			if (MazeSize[0][0] == 0 || MazeSize[n - 1][m - 1] == 0) { // 시작과 끝이 0인지 1인지 확인
				System.out.println("시작값 또는 마지막 값이 0입니다. \n 괴물이 없으면 1입니다. \n 다시 지정해 주시기 바랍니다.");
			}
		} while (MazeSize[0][0] == 0 || MazeSize[n - 1][m - 1] == 0);

		return MazeSize;

	}
}
