package day078;

public class Q_S {

	public static void main(String[] args) {
		//Queue
		/* 한쪽 끝에서는 삽입 다른 쪽 끝에서는 삭제가 일어나는 구조
		 * 선입 선출 (FlFO) 의 구조
		 * front:삭제, near:삽입 
		 * 앞 부분   , 뒷 부분
		 * 
		 * 관련 Method
		 *  boolean add(E e)	Queue에 요소 e추가
		 *  E element()			Queue의 재일 상단 요소 반환
		 *  E remove()			Queue의 최상단 요소를 반환 후 제거
		 *  boolean offer(E e)		Queue에 요소 e를 추가
		 *  E peek()			Queue의 제일 상단 요소 반환
		 *  E poll()			Queue의 최상단 요소를 반환 후 제거
		 *  
		 *  Queue 는 인터페이스이다, 사용하려면 업 캐스팅 필요
		 */
		
		//Stack
		/* 한 쪽 끝에서 삽입과 삭제가 모두 일어나는 구조
		 * 후입선충(LIFO) 의 구조
		 * top : 삽입, 삭제
		 * vector의 자식 클래스
		 * 
		 * 관련 Method
		 * E peek()				 top 요소를 반환
		 * E pop() 				 top 요소 제거 후 반환
		 * E push(e item)		 top에 요소 추가
		 * int search(Object O)	 요소 O가 있는지 검색해서 우치 반환
		 * 
		 * Stack 은 클래스이므로, 바로 사용 가능
		 * **** Stack 에 쌓여가는 순번은 top 1 부터 시작을 하니 주의바람
		 */


	}

}
