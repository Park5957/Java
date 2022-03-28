package pm14;

import java.util.Arrays;
import java.util.Scanner;

public class test_trining19 {

	public static void main(String[] args) {
//		HW.121
//		what is the meaning of immutable in the context of string?
//				class in java
//		String 타입은 기본 타입(Primitive Type)이 아닌 참조 타입(Reference Type)이며,
//		따라서 Sting은 나머지 자료형과는 다르게 String constant pool 에서 관리저장 되어진다.

//		만일 Sting a = "asd"; 라고 지정한다면 이것은  String pool에 저장된 asd를 참조한 것이다.
//		그리고 이 a = "cxz"; 로 바꾼다면  String pool에 저장된 asd가 cxz 로 바뀌는 것이 아닌
//		a가 String pool의 cxz를 참조해서 a = "cxz"; 가 된다.

//		그리고 바로 이러한 특성이 String의 immutable(불변)을 의미합니다.

//		HW.123
//		code:
//			String s1 = "HelloWorld";
//			String s2 = "HelloWorld";
//			String s3 = "HelloWorld";

//		개체의 수 : 3개

//		HW.124
//		String a = new String("as");
//		String a = "as";
//		총 2가지

//		HW.125
//		code:
//		String s = new String("HelloWorld");
//		생성된 개체 수 : 1개

//		HW126
//		String의 문자열이 같은지를 확인하는 것.
//		String a = "ak";
//		String b = new String("ak");
//		String c = b.intern();
//		
//		System.out.println(a==c); //true
//		이같이 a와 c는 같은 메모리의 String을 공유하기에 같다고 표기된다.
//		System.out.println(b==c); //false
//		하지만 b의 경우는 같은 "ak" 라는 문자열 이지만 메모리의 String 은 다르다
//		
//		System.out.println(a.equals(c)); //true
//		System.out.println(b.equals(c)); //true
//		그렇기에 표면상 보여지는 문자열인 "ak"의 같음은 equals() 로 확인해야한다.

//		HW127
//		String a = "ak2";
//		String b = a;
//		String c = a.intern();
//		위와 같이 같은 위치의 메모리에 지정된 String을 사용하게 될 시 해당 위치를 공유하게 됨으로
//		a를 변경하면 b,c 모두 변경이 되기 때문이다.

//		이를 별개의 변수로 활용하기 위해서는
//		String a = "ak2";
//		String b = new String("ak2");
//		String c = new String("ak2");
//		와 같은 형식으로 변수를 지정해야한다. 

//		HW128
//		String a = "a";
//		위 a 와 같이 String 선언으로 "a" 라는 문자열을 선언후 ak3 라는 문자열을 만들 기 위해서는
//		a = "ak3";
//		라고 하는 재 선언을 하거나 연산을 통해
//		String a3="";
//		a3 += "a";
//		a3 += "k3";
//		작성이 가능하다. 근데 이것은 매번 객체를 생성하여 리턴을 하는 것이다.

//		StringBuffer a2 = new StringBuffer();
//		a2.append("a");
//		a2.append("k3");
//		System.out.println(a2.toString());
//		StringBuffer 의 경우는  위와 같이 ak3 라는 문자열을 만들어낼 수 있다.
//		String과 다르게 이것은 매번 객체를 생성해 리턴하는 것이 아닌 값을 변경하는 것이다.

//		위와 같은 이유로 StringBuffer 는 메모리에 사용량이 높다.
//		문자의 변동량이 적을때는 String 으로 객체를 생성하는 것이 좋다.

//		HW129
//		class AA {
//			private String sa = "nono";
//			
//
//			public void a2(String a) {
//				this.sa = a;
//
//			}
//
//		}

//		HW130
//		toString() 은 최상위 클래스의 매서드이다.
//		int a[] = {1,2,3,4};
//		System.out.println(Arrays.toString(a));
//		과 같이 배열과 같은 문자열들의 내용을 전부 출력하기 위해 사용되며,
//		객체의 정보를 출력하는 용도로 이용된다. 재정의 용도로도 사용된다. 

//		QUESTION(#40)
//		조건 1. N 에서 1을 뺸다.
//		조건 2. N 을 K로 나눈다.
//		조건 3. N 이 1이 될 때까지 몇번이 실행이 되어야 하는가?

//		BACKGROUND
//		• 그리디 알고리즘 (탐욕법)
//		• 단순 무식하게, 탐욕적으로 문제를 푸는 알고리즘
//		• 탐욕적의 의미는
//		• 현재 상황에서 지금 당장 좋은 것만 고르는 방법
//		• 주어진 N에 대하여 ‘최대한 많이 나누기＇를 수행
//		• 가능하면 나누는 것이 항상 더 숫자를 빠르게 줄이는 방법
//		• N이 K의 배수가 될 때까지 1씩 빼기, N을 K로 나누기

		Scanner sc = new Scanner(System.in);
		System.out.print("N의 값을 입력 : ");
		int n = sc.nextInt();
		System.out.print("K의 값을 입력 : ");
		int k = sc.nextInt();
		int n_count = 0;
		int k_count = 0;

		while (n != 1) {
			if (n % k == 0) {
				n = n / k;
				k_count += 1;

			} else {

				n -= 1;
				n_count += 1;

			}

		}
		System.out.println("-1 횟수 : " + n_count);
		System.out.println("/k 횟수 : " + k_count);
		System.out.println("횟수 총 합 : " + (n_count + k_count));

	}

}
