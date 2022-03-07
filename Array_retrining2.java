package pm2;

public class Array_retrining2 {
	public static void main(String[] args) {
		/*배열의 특징
		먼저 기본 자료형과 참조 자료형에서 변수를 복사할 때를 생각해 보자.
		대입연산자(=) 를 이용해서 변수가 복사되는 과정을 이해해 보자
		변수의 복사 라는 말의 의미는 무엇일까?
		바로 변수에 포함된 메모리 값이다.
		
		그런데 기본 자료형과 참조 자료형의 저장되는 메모리 값의 의미가 다르다.
		따라서 둘 사이에 차이가 발생된다.
		
		그럼 기본 자료형을 살펴보자. 기본 자료형은 메모리에 실제 데이터 값을 저장한다.
		따라서 기본 자료형 변수를 복사하면 실제 데이터 값이 1개 더 복사된다.
		
		이 후 복사된 값을 아무리 변경해도 원본 값은 아무런 영향을 받지 않는다.
		*/
//		int a = 3;
//		int b = a;
//		b = 7;
//		System.out.println(a); //결과값 3
//		System.out.println(b); //결과값 7
		
		/* 이제 참조 자료형을 살펴보자. 참조 자료형은 실제 데이터 값이 아닌 저장된 위치 값을 가지고 있다.
		 * 따라서 참조 자료형 변수를 복사하면 실제 데이터가 복사되는 것이 아니라
		 * 실제 데이터의 위치값이 복사된다.
		 */
		
//		int c [] = {3,4,5};
//		int[] d = c;
//		d[0] = 7;
//		System.out.println(c[0]); //결과값 7
//		System.out.println(d[0]); //결과값 7
		
		//배열의 갯수를 확인하는 방법
//		int[] a = {3,4,5,6,7};
//		System.out.println(a.length);
//		갯수를 사용하여 출력
//		for (int i = 0; i<a.length; i++) {
//			System.out.println(a[i]);
//			
//		for (int j : a) {
//			System.out.println(j);
//		}
//		}
		
		/*2차원 배열  : 가로와 세로 2차원으로 데이터를 저장하는 배열
		 * 매열의 선언을 보면 차원이 1개씩 늘어날 때마다 대괄호가 1개씩 늘어난다.
		 * 
		 * 자료형[][] 변수명;
		 * */
		int[][] a = {{1,2},{3,4,5}};
//		
////		for (int i = 0; i<a.length; i++) {
////			for (int j = 0; j<a[i].length; j++) {
////				System.out.println(a[i][j]);
////			}
////		}
		for (int[] i : a) {
			for (int k : i) {
			System.out.print(k+" ");
		}
		}
		
	}
}
