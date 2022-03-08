package pm3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class String_retrining {
	public static void main(String[] args) {
		

		
		//String 의 특징 
		//1. 한번 정의된 문자열은 변경할 수 없다.
		//	만약 문자열의 내용을 변경하면 자바가 기존 문자열을 수정하는 것이 아니다.
		//	새로운 문자열을 생성하여 사용하게 되는 것이다. 그리고 기존의 객체는 버리게 된다.
		//	즉, 결과적으로는 수정처럼 보이지만 시스템적으로는 아니라는것.
		//2. 문자열을 입력해서 객체를 생성할 때 같은 문자열 끼리 객체를 공유한다.
		//	이것은 메모리의 효율성 때문이다.
		
		String a = "오케이!";
		String b = a;
		System.out.println(a);
		System.out.println(b);
		
		a = "야호!";
		System.out.println("---구분선---");
		System.out.println(a);
		System.out.println(b);
		
		String str1 = new String("안녕");
		String str2 = "안녕"; 
		String str3 = "안녕";
		String str4 = new String("안녕");
		
		// 위 상태의 시스템적인 차이점에서 str2와 str3은 같은 지점에 위치한 "안녕" 이라는 단어를 사용한다.
		// 하지만 new String 변수생성을 한 st1과 str4는 다른 지점에 위치한 "안녕" 이라는 단어를 사용하고 있다.
		System.out.println("---구분선---");
		System.out.println(str1 == str2);
		System.out.println(str2 == str3); 
		System.out.println(str3 == str4);
		System.out.println(str4 == str2);
		System.out.println(str1 == str4);
		//결과를 보면 알겠지만 시스템의(메모리) 상 str2와 str3 이 두 변수만이 같다고 판단하는 것을 알 수 있다.
		
		System.out.println("---구분선---");
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));

	}

}
