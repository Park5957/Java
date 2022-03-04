package pm;

public class Break_out {

	public static void main(String[] args) {
	//아래의 방식은 중복 for문을 사용했을때 일괄적으로 break 를 처리하는 방법이다.
		out : //위치지정 레이블
			
		
		for (int i = 0; i<=5; i++) {
			for (int j =0; j<=5; j++) {
				System.out.println(i+" "+j);
				if (j==3) {
					break out;
				}
			}
			System.out.println(" ");
		}
	// i가 3일때 j가 2일때 탈출 조건
	
//	for(int i =0; i<10; i++) {
//		for(int j = 0; j<5; j++) {
//			System.out.println(i+" "+j);
//			if (i == 3 && j == 2) {
//				i = 10;
//				break;
//			}
//			} // 기본형태
		
	out:
	for(int i =0; i<10; i++) {
		for(int j = 0; j<5; j++) {
			System.out.println(i+" "+j);
			if (i == 3 && j == 2) {
				break out;
			}
			}
	}

	}

}
