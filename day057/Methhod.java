package day057;

public class Methhod {

	public static void main(String[] args) {
		
		//매서드란 여러 명령들의 나열된 묶음.
		//입역 값을 받아서 내부에서 처리 후 결과를 출력 또는 반환 하는 역항
		//매서드는 맴버 함수 라고도 불림, 클래스 내부에서 생성
		//클랙스 안에 존재하는 것이 매서드
//		input x값의 입력
//		funcyon 함수 x+2 
//		output f(x)
//		따라서 f(x) = x+2
//      매서드라는 것은 지정된 명령을 호출하여 사용하기 위함.
		/*구조<구현부>
		 * 반환타입 매서드명(타입 변수명, 타입 변수명){
		 * 명령1;
		 * 명령2;
		 * return값;
		 * }
		 * 메서드는 메인 이외에 제작하여 구성 하고해당 명령은 메인에서 실행함 ******
		 */
		open(); // 메서드 명령을 실행하는 코드
	}
		static void open(){ // 오픈은 이 메서드의 이름, void 는 리턴값이 존재하지 않는다는 의미
			System.out.println("문을열어");
			System.out.println("바닥청소해");
			System.out.println("포스기켜");
			System.out.println("빵을진열해");
		}
		//매개변수-타입변수명
		//함수의 호출부에서 구현부로 전달하고 싶은 값이 있을때 전달할 값을 저장할 공간
		//구조<호출부>
		//매서드명(값1,값2...);
		
		//return 값 : 함수에 구현된 모든 명령 실행 후, 함수가 갖게 될 결과의 값
		//
		
	

	}
