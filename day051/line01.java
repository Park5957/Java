package day051;

public class line01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열이란 같은 자료형의 변수들의 나열된 묶음
		//같은 타입의 변수를 관리하기 위해서 사용
		
		//타입[]배열명;               int[]ar;
		//배열명=new타임[길이];        ar=new int[3];
		
		//타입[]배열명=new타입[길이]; 배열의 선언과 생성을 동시에 하는 초기화
		
		//ar [(0)(1)(2)] 이라는 모습이 형성이 가능해짐 **시작번호는 0
		
		//인덱스 index 배열의 위치값에 대한 명칭 활용 ar[1] 와 같은 형태로 가능
		//인데스 값은 변수로도 사용이 가능함 ar[0]=10; 과같은 형태로
		
		//정수형 배열의 초기값 : 0
		//문자형 배열의 초기값 : ''
		//실수형 배열의 초기값 0.0
		// 문자열 배열의 초기값 : null
		
//		int score1=100;
//		int score2=80;
//		int score3=70;
//		System.out.println("1번:",+sore1);
//		라는 걸 쉽게 만들것임
		
		int[]scores = new int[3];
		scores[0]=100;
		scores[1]=80;
		scores[2]=70;
		
		for(int i=0; i < 3; i++)
//		System.out.println("1번:",+scores[0]);
//		System.out.println("2번:",+scores[1]);
//		System.out.println("3번:",+scores[2]);
			
			System.out.println(i+1+"학생점수:" + scores[i]+"점");
		

	}

}
