package pm6;

public class Inheritance_retrining {

	public static void main(String[] args) {
		// 상속 Inheritance 과 다양성
		/* 클래스는 객체지향에서 가장 기본적인 요소이다. 객체 지향적 관점에서 가장 중요한 부분은
		 * "상속" 이다. 상속을 이해하는 것이 객체지향적인 프로그램에서 제일 중요하다.
		 * 
		 * 상속에 대한 이해를 통해 객체 타입변환, 매서드 오버라이딩 super 키워드 super()
		 * 매서드 등 도 쉽게 이해할 수 있다.
		 * 
		 *  1. 상속의 개념 - 인간세계의 상속과 매우 유사하다. 부모의 자원을 자식이 마음대로 가져다가 쓴다.
		 *  
		 *  								(추상화)
		 *  	학생			직장인		-- 공통요소 추출 -->		사람
		 *  
		 *  이름			이름									이름
		 *  나이			나이									나이
		 *  학번			사번									먹기()
		 *  												잠자기()
		 *  먹기()		먹기()						학생				직장인
		 *  잠자기()		잠자기()						학번				사번
		 *  등교하기()		출근하기()						등교하기()			출근하지()
		 *  
		 *  상속의 장점
		 *  1. 코드의 중복성 제거
		 *  2. 다형적 표현가능
		 *  	학생은 사람이다. 직장인은 사람이다.
		 *  
		 *  사과 [] apple = {사과1, 사과2}
		 *  포도 [] grape = {포토1, 포도2} 
		 *  키위 [] kiwi = {키위1, 키위2, 키위3}
		 *  
		 *  과일 fruit1 = new 사과();
		 *  과일 fruit2 = new 포토();
		 *  과일 fruit3 = new 키위();
		 *  
		 *  사과 포토 키위는 모두 과일이다. 따라서 "과일"이라는 부모 클래스를 만들어 각각
		 *  상속을 시키면 다형적 표현을 할 수 있다.
		 *  
		 *  과일[] fruit = {사과, 포토, 키위}; 
		 *  
		 */

	}

}
// 예시)
//class Human {
//	String name;
//	int age;
//	void eat() {}
//	void sleep() {}
//}
//
//class Studrnt extends Human{
//	int studentID;
//	void goToschool() {
//		
//	}
//}
//class Worker extends Human{
//	int WorkerID;
//	void goTowork() {
//		
//	}
//}