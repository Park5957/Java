package day046;

public class If_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age=15;
		if(age>19) {
			System.out.println("성인입니다.");
			System.out.println("성인요금이 적용됩니다.");
			
		} // 맞을때 출력물
		
		else {//age<=19
			System.out.println("청소년입니다");
			System.out.println("청소년 요금이 적용됩니다.");
			
		} //아닌경우의 출력물
		
		System.out.println("결제를 진행해 주시기 바랍니다.");
		
		
		// if else if 구조에 대하여
		// if (조건1) {조건1 참일때 실행할 명령}
		// else if (조건2) {조건1이 거짓이고 조건2가 참일때 실행할 명령}

	}

}
