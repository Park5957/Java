package day048;

public class For2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*반복문
		 * for
		 * while
		 * do while
		 */
//		System.out.println("n1 computer");
//		System.out.println("n2 computer");
//		System.out.println("n3 computer");
//		System.out.println("n4 computer");
//		System.out.println("n5 computer");
//		System.out.println("n6 computer");
//		System.out.println("n7 computer");
//		System.out.println("n8 computer");
//		System.out.println("n9 computer");
//		System.out.println("n10 computer");
//		
		//동일한 명령의 간소화를 위한 코드
		
//		for(초기식;조건식;증감식) ---- 변수생성, 변수릐 마지노선 , 변수의 변화량
		// 초기식이 참일 경우에 반복명령
		// 반복할명령;
//		
//		for(int i=1; i<=10; i++)
//		{
//			System.out.println(i+"n computer");
//		}//역순
//		
//		
//		for(int i=1;1<=10;i++) {
//			if(i%2==0)
//			System.out.println(i+"");
//		}
//		
//		for(int i=1;1<=10;i+=2 /*i=i+2*/) {
//			System.out.println(i+"");
//		}
//		
//		
//		
		
//		int sum=0;
//		for(int i=1; i<=10; i++) {
//			System.out.printf("i=%d, sum=%d\n",i,sum+=i);
//			//앞쪽은 형식지정 뒷쪽은 그 값
//		}
//		
		int sum = 0;
		//1~10까지의 합을 더하는 방법
		
				for(int i=1; i<=10; i++) {
					sum = sum+i;
					
				}
				System.out.println(sum);
	}
}
