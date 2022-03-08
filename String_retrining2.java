package pm3;

public class String_retrining2 {

	public static void main(String[] args) {
		// 문자열의 연산
		String a = "안녕"+"하세요"+"!";
		System.out.println(a);
		
		String b = "반갑";
		b += "습니다";
		b += "!";
		System.out.println(b);
		
		String c = "Java Study";
		System.out.println("   s   s    ".trim());//좌우 여백제거
		System.out.println(c.substring(0,5)); //슬라이싱
		
		//문자열의 내용비교 : 문자열을 비교할때는 == 을 쓰지 않는다.
		// .equals() 를 사용한다. ###비밀번호 설정때 많이 사용한다.
		// SHA-256
		// PW 0000 -> SHA-256 -> 5u409fdsk 라는 해시 함수로 변경
		// 이는 역순으로 0000 으로 복수 할 수가 없다.
		
		String str1 = new String("JAVA");
		String str2 = new String("JAVA");
		String str3 = new String("java");
		
				
		System.out.println("-----구분선-----");
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		// 이와같이 .quals() 는 글 자체의 같음을 비교하기에 같다는 사실을 확인 할 수 있다.
		// == 을 사용하면 시스템상 위치를 비교하기 때문에 같지 않다는 결과가 나온다.
		
		System.out.println("-----구분선-----");
		System.out.println(str2.equals(str3));
		//당연한 이야기 이지만 소문자와 대문자는 구분된다.
		
		System.out.println("-----구분선-----");
		System.out.println(str2.equalsIgnoreCase(str3));
		//하지만equalsIgnoreCase() 를 사용한다면 대소문자 구분없이 비교가 가능하다.
		
	}

}
