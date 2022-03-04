package pm;

public class While_retring {

	public static void main(String[] args) {
		// do while 
		// 일반 while 과 차이점은 조건식의 검사와 반복 실행의 순서에서 차이가 난다.
		// for문 중첩을 while 중첩으로 사용하는 방법
		int i = 0;
		while (i<3) {
			int j = 0;
			while (j<5) {
				System.out.println(i+" "+j);
				j++;
				}
			i++;
		}
	}
	}

