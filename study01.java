package Day1;

import java.util.ArrayList;
import java.util.Scanner;

public class study01 {

	public static void main(String[] args) {
//		조건
//		1. n 명이 원형으로 배치
//		2. k 번째 사람이 사망
//		예시 8명 배치 3명마다 죽기로 결정
//		반복이기에 시작순서에 상관없이 1명 이면 정지
//		3. 배치 값 8,3으로 했을시 마지막 1명이 몇번째 사람인지 찾기
//		
//		구성
//		1. 총원 입력받아 리스트 생성
//		2. 시작 번호 입력받아 지정
//		3. 몇번째 부터 사망할 것인지 입력받아 지정
//		4. 파라미터 값 입력임으로 클래스 생성
//		5. while문으로 진행 리스트 가 한명이 될 떄까지 진행.

		Scanner sc = new Scanner(System.in);
		System.out.print("배치될 인원을 적어주시기 바랍니다.");
		int n = sc.nextInt();
		System.out.print("몇 번쨰 사람부터 사망할지 정해주세요 : ");
		int k = sc.nextInt();

		Kill kkk = new Kill();
		kkk.K(n, k);
	}

}

class Kill {
	Scanner sc = new Scanner(System.in);

	void K(int n, int k) {

		ArrayList<Integer> svc = new ArrayList<>();

		for (int i = 1; i < n + 1; i++) {
			svc.add(i);
		} // 원형배치 리스트 생성
		System.out.println(n + ":" + k);

		while (svc.size() != 1) {

			if (k <= svc.size()) {
				System.out.println(svc.get(k - 1) + "번 째 군사가 죽습니다.");
				svc.remove(k - 1);
				k = k + k - 1;

			} else {
				k = k - svc.size();

			}
		}
		System.out.println("김신은" + svc.get(0) + "번 째 서 있으면 됩니다.");

	}
}
