package day076;

public class Generic {

	public static void main(String[] args) {
		// 클래스가 다룰 객체를 미리 명시하는 기법
		// "제네릭 == 일반화"
		// ex) 택시나 버스나 그냥 자동차(일반화) 라고 다룰꼐
		// 즉, 제네릭은 모둔 종류의 타입을 다룰 수 있도록, 클랙스나 메서드를 타입 매새변수를 이용하여 선언한 기법
		
		// 클래스 명 뒤에 <E>,<K>,<V> 와 같은 형식으로 사용
		// 단 <> 안에는 구현 시는 알파벳, 사용시는, 클랙스만 들어갈 숭 ㅣㅆ다.
		/* 타입
		 * E : 배열이나 집합들의 요소 타입을 지정
		 * T : 변수의 자료형과 같은 타입을 지정
		 * S,U : 여러개의 제네익 기법을 사용할 때 많이 사용
		 * K : 키 타입 지정시 사용
		 * V : 값 타입 지정 시 사용
		 */
		value v = new value();
		v.<Integer>tpeSearch(3);
		// tpeSearch가 Integer로 바뀌기 위해서는 앞에 지정을 해줘야 한다.
		// 하지만 java8 이 후 에는 형식을 지정하지 않아도 자동으로 지정을 해준다.
		v.tpeSearch(3.14);
		v.tpeSearch(3.14f);
		v.tpeSearch('a');
		v.tpeSearch("hello");
		v.tpeSearch(true);
	}
}
/* 실행 결과
 *  3은 정수입니다.
 *  3.14 는 실수 입니다.
 *  3.14 는 실수 입니다.
 *  a는 문자형 입니다.
 *  hello는 문자열 입니다.
 */

class value{
	public <T> void tpeSearch(T x) { // T 타입의 x 를 가지고 올께
		if(x instanceof Integer) { // x 가 Integer 로 만들어진 객체 인가?
			System.out.println(x+"는 정수 입니다.");
		}
		else if(x instanceof Double||x  instanceof Float) { // x가 더블 or 플롯 이니?
			System.out.println(x+"는 실수 입니다.");
		}
		else if(x instanceof Character) {
			System.out.println(x+"는 문자열 입니다.");
		}
		else if(x instanceof String) {
			System.out.println(x+"는 문자열 입니다.");
		}
		else if(x instanceof Boolean) {
			System.out.println(x+"는 논리형 입니다.");
		}
			 
	}
}




















