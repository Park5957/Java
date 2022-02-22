package day042;

public class Final_EX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		a=4;
		
		final double PI=3.14;
		// final이 붙었기 때문에 전혀 변경이 안됨
		// 보편적 약속 대문자 변수명은 파이널에 해당하는 변수
		
		System.out.println(a);
		System.out.println(PI);
	}

}
