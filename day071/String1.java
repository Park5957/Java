package day071;

public class String1 {

	public static void main(String[] args) {
		String str="Hello";
		          //01234 라고 위치를 볼 수 있음 
		System.out.println(str.concat(" World ")); // 주의할 점은 str 자체가 변경된 것은 아님
		System.out.println(str);
		//substring(시작위치,끝위치)
		System.out.println(str.substring(2,4)); // 시작위치 부터 끝 위치까지 가지고 온다고 이해를 하면 된다.
		System.out.println(str.substring(3)); //이렇게 적을시 시작위치부터 끝까지 가지고 와라. 이유는 끝을 지정하지 않았기 떄문
		
		System.out.println(str.length());//문자열이 총 5개이기 때문에 (띄어쓰기 포함) 5라는 수치가 표현됨
		System.out.println(str.toUpperCase()); //문자열도 할 수 있음
		System.out.println(str.toLowerCase());
		System.out.println("Test".toUpperCase());
		
		System.out.println(str.charAt(0)); //0번에 해당하는 첫번째 글자인 h 가 넘어옴
		System.out.println(str.indexOf("o")); //해당 문자가 몇번 째 열에 존재하는지 알 수 있음
												// -1 이 나오는 경우는 찾지 못했을 경우이다
		System.out.println(str.equals("Hello")); //적은 문자열이 참이지 거짓인지 확인이 가능함
		System.out.println(" test ".trim()); // 앞 뒤 공백을 제거함을 확인 할 수 있음
		
		System.out.println("hello world".replace('l', 'L')); // l 을 L로 변경을 했음을 확인 할 수 있음(문자만 가능)
		System.out.println("hello world".replaceAll("hello", "bye")); //문자열을 변경했음을 알 수 있음
	}

}
