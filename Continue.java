package pm;

public class Continue {

	public static void main(String[] args) {
		//continue 는 특정 구문을 실행하지 않고 건너뛰는 용도로 사용된다.
		//1~10까지 짝수만 출력하기 (continue사용)
		
		for (int i = 0; i<=10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.print(i+" ");
			}
		
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j < 5; j++) {
//				if (j ==3) { // 3을 건너뛰게 만듬
//					continue;
//				}
//				System.out.println(i + "," + j);
//			}
//		}
//	    int i = 10;
//		while (i > 0) {
//			System.out.println(i);
//			i -= 2;
//		}
		
// 
		}

	}

	

