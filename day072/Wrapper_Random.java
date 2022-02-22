package day072;

public class Wrapper_Random {

	public static void main(String[] args) {
		/* Wrapper 클래스
		 * 	기본 자료형들을 객채로 다루기 위해 사용
		 * 자바는 객체 지향임으로, 객체 값을 다룰 일이 많기 떄문에, 일반 자료형의 데이터를 객체로 변환하는 작업이 필요.
		 *  boolean		Boolean클래스
		 *  char		Character클래스
		 *  byte		Byte클래스
		 *  short		Short클래스
		 *  int			Integer클래스
		 *  long		Long클래스
		 *  double		Double클래스
		 *  float		Float클래스
		 *  
		 *  Wrapper 클래스명 객체명 = new Wrapper 클래스명(값);
		 *  	ex) Integer i = new Integer(3);
		 *  		Double b = new Double(3.14);
		 *  
		 *  오토박싱(Auto Boxing)
		 *  기본 자료형 값을 자동으로 Wrapper 클래스의 객체로 변환시켜 주는 것
		 *  
		 *  오토 언박싱(Auto UnBoxing)
		 *  Wrapper 클래스의 객체 값을 자동으로 기본 자료형 값으로 변환시켜 주는 것
		 */
		
		/* Random 클래스
		 * 무작위 값을 추출하기 위한 내부알고리즘
		 * 
		 * Random 객체명 = new Random();
		 * 
		 * Random(); 현재 시간을 seed 값으로 인스턴스생성.
		 * Random(int seed); 받아오는 seed 값으로 인스턴스 생성
		 * 
		 * 관련 method
		 * int 		nextInt()		무작위의 int 값을 반환
		 * int 		nextInt(int n)	0보다 크고 n 보다 작은 int값의 반환
		 * boolean	nextBoolean()	무작위의 boolean 값 반환
		 * long 	nextLonf()		무작위의 long 값 반환
		 * double	nextDouble()	무작위의 double 값 반환
		 * float 	nextFloat()		무작위의 float 값 반환
		 */
	}

}
