package day071;

public class API {

	public static void main(String[] args) {
		// 기본 API란?
		/* 자바에서 개발자들을 위해 기본적으로 제공하는 클래스
		 */
		
		/* object 클래스
		 *  모든 클래스의 조상 클래스. 모든 클래스는 오브젝트 클래스의 필드를 상속 받는다.
		 */
		
		/* 문자열 클래스
		 * String 클래스
		 * StringBuffer 클래스
		 * StringTokenizer 클래스
		 */
		
		/* String 클래스는 객체 생성 시, 보통 클래스와는 다르게, 기본 자료형 선언처럼 사용한다.
		 * 종류
		 * concat(문자열) 				문자열을 연결
		 * substring (인덱스,잘라낼 길이)		문자열 잘라내기
		 * length() 					문자열의 길이 변환
		 * toUpperCass()				문자열을 대문자로 변환
		 * toLowerCass()				문자열을 소문자로 변환
		 * charAt(인덱스)					인덱스에 해당하는 글자 반환
		 * indexOf(문자열)				문자열의 위치 반환
		 * equals(문자열)					문자열이 같은지 boolean 값 변환
		 * trim()						문자열 앞,뒤 공백제거
		 * replace(기존문자열,대체문자열)		기존문자열을 대체 문자열로 변경
		 * repalceAll(변환할문자열,변환된문자열)문자열 내의 특정부분을 다른 문자열로 변환
		 */
		
		/* StringBuffer 클래스
		 * append()						매개변수로 입력된 갓ㅂ을 문자열로 바꾸어서 더해주는매서드
		 * reverse()					문자열의 순서를 반대로 나열하는 매서드
		 * insert(int pos, Object obj)	두 번째 매개변수의 값을 문자열로 바꾸어서 pos 위치에 추가하는 매서드
		 * delete(int start, int end)	start 위치부터 emd 직전 위치의 문자열을 제거하는 매서드
		 * delete(int index)			index위치에 있는 문자를 제거하는 메서드
		 */
		
		
		/* StringTokenizer 클래스
		 * 문자열 생성
		 * 구분할 문자열 생성
		 * StringTokenizer 객체생성
		 * StringTokenizer st = new StringTokenizer(문자열,구분문자열);
		 * 
		 * 인폴트 해야함.
		 * 
		 * String str = "kim:010-123-234";
		 *                  / 이 지점을 기준으로 문자열이 나뉘었음을 표시 할 수 있음
		 * string delim-=":";
		 * StringTokenizer st = new StringTokenizer(str,delim);
		 * 
		 * 주요method 
		 * nextToken():		다음 토큰으로 이동
		 * hasMoreToken():	다음 토큰이 존재하면 true, 존재하지 않으면 false
		 * countTokens():	남은 토큰의 갯수
		 */
	

	}

}
