package day047;

public class Switch_EX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//일년 동안 읽은 책 수에 따라 멘트 출력 // 스캐너 제외 시킴 // 결과값은 int로 조정하는 문서임
		//브레이크가 존재하지 않다면 모든 명령이 출력됨. 단, default 의 값에 벗어난 값일 시에 발생하는 문제
		int book=100;
		book=book/10;
		
		switch(book) {
			case 0 :
			System.out.println("조금더 노력하시기 바랍니다.");
			break;
			
			case 1 :
				System.out.println("책을 즐기는군");
				break;
				
			case 2 :
				System.out.println("책을 사람하는 사람이군요");
				break;
				
			default:
				System.out.println("많이 읽는군");
				
		}
	}

}
