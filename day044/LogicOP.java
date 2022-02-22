package day044;

public class LogicOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a=true;
		boolean b=false;
		boolean c=true;
		
		System.out.println(a&&b); // a와b 모두 참이면 tlue
		System.out.println(a&&c);
		System.out.println((2<4)&&(4<5));// true&&true
		System.out.println(a||b); //a 혹은 b 가 true 라면 true
		System.out.println(a||c);
		System.out.println(b||b); // false || false 일때먄 false
		System.out.println(!a); // 참과 거짓 반대표현

	}

}
