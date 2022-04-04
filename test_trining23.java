package pm18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test_trining23 {

	public static void main(String[] args) {
//		조건
//		1. 버전1과 버전2 번호의 비교
//		2. 버전의 번호는 "." 으로 결합된 형태
//		3. 버전 1은 001과 동일함
//		4. 예시 버전 1.0 은 버전 1.1 보다 작지만
//			버전 0과 버전 1은 0<1 이다.
//		5. 예시 2
//		버전1<버전2 라면 -1   
//		버전1>버전2 라면 1
//		나머지 경우는 모두 0

//		구성 & 이해
//		1. 1이라도 더 높은쪽이 높다.
//		2. 같다면 소수점 이라도 비교한다.
//		3. 다만 점 이하의 수치의 비교는 상수의 값이 동일할 때만 비교하면 된다.
//		   
		Scanner sc = new Scanner(System.in);
		System.out.print("버전1의 의 값을 입력하시 바랍니다. : ");
		String n = sc.next();
		System.out.print("버전2 의 값을 입력하시 바랍니다. : ");
		String m = sc.next();

		ArrayList<Integer> narry = new ArrayList<>(); // 버전1 저장할 리스트
		ArrayList<Integer> marry = new ArrayList<>(); // 버전2 저장할 리스트

		String[] nSplit = n.split("\\."); // 버전1 "." 기준으로 스플릿 \\는 "." 이 기본키 이기 때문

		for (int i = 0; i < nSplit.length; i++) {

			narry.add(Integer.parseInt(nSplit[i])); // 버전 1 어레이 리스트 보관
		}

		
		
		String[] mSplit = m.split("\\."); // 버전2 "." 기준으로 스플릿 \\는 "." 이 기본키 이기 때문

		for (int i = 0; i < mSplit.length; i++) {

			marry.add(Integer.parseInt(mSplit[i])); // 버전2 어레이 리스트 보관
		}

		if (narry.size() > marry.size()) {  // 버전 1과 버전 2의 길이를 비교 짧은 쪽에 0을 추가 (사족 : 1과 001은 같기에 배열 길이를 맞추기위함)
			int difference = narry.size() - marry.size();
			for (int i = 0; i < difference; i++) {
				marry.add(i, 0); // narry더 길기 때문에  marry의 앞에서 부터 0을 추가

			}
		} else if (narry.size() < marry.size()) {
			int difference = narry.size() - marry.size();
			for (int i = 0; i < difference; i++) {
				narry.add(i, 0);

			}
		}

		int result = 0; //결과 카운트

		for (int i = 0; i < narry.size(); i++) { //narry와 marry의 배열 순차적으로 비교
			if (narry.get(i) == 0 && marry.get(i) == 0) {
				continue;

			} else if (narry.get(i) > marry.get(i)) {
				result = 1;
				break;

			} else if (narry.get(i) < marry.get(i)) {
				result = -1;
				break;
			}
		}

		System.out.println(result); //결과 출력


	}

}
