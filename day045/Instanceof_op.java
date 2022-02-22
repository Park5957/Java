package day045;

public class Instanceof_op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//기타연산자 객체를 만들기 위한 프레임 특징 앞문자 대문자
		//Integer = int 자료형
		//Float = float
		//Double = double
		//Character = char
		
		
		String s="Helllo";
		int i=3;
		float f=3.14f;
		double d=3.14;
		char c='a';
		
		System.out.println(s instanceof String);
		System.out.println(Integer. valueOf(i) instanceof Integer);
        System.out.println(Float. valueOf(f)instanceof Float);
        System.out.println(Double. valueOf(d)instanceof Double);
		System.out.println(Character. valueOf(c) instanceof Character);
		
		
		// 본 코드는 클래스(각 형태에 맞는) 을 생성하기 위한 코드이며 valuof는 자동완성을 통해 생성할 것
	}

}
