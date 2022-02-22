package day074;

public class Time {

	public static void main(String[] args) {
		/* java.time 패키지
		 * 날싸와 시간을 다루기 위한 패키지
		 * LocalDate 클래스 : 날짜 정보를 저장
		 * 현재 날짜 지정 : now()
		 * 특정 날짜 지정 : of()
		 * 예시
		 * LocalDate ld = LocalDate.now()
		 * LocalDate mld = LocalDate.of(int year, int month, int dayOfMonth);
		 * 									몇년		몇월			몇일
		 * 
		 * LocalTime : 시간 정보를 저장
		 * 현재 시간 지정 : now()
		 * 특정 시간 지정 : of()
		 * 로컬 데이터와 형식은 동일
		 * LocalTime lt = LocalTime.now()
		 * LocalTime mld = LocalTime.of(int hour, int minute, int second, int manoOfSecond);
		 * of(int minute)
		 * of(int minute, int second)
		 * of(int minute, int second, int manoOfSecond)
		 * 
		 * 합본
		 * LocalDateTime ld = LocalDateTime.now()
		 * LocalDateTime mld = LocalDateTime.of(int.year, int month, int dayOfMonth);
		 * 
		 * zoneDateTime 클래스
		 * 지정된 형식에 맞추어 날짜와 시간을 저장하겠다는 의미
		 * zoneDateTime ㅋㅇㅅ = zoneDateTime.noe(zoneDateTime.of("UTC");
		 * 
		 * Instant 클래스 : 특정 시점의 타임 스탬프 객체
		 * 1970.01.01. 부터 현재까지의 시간을 세는 객체
		 */
		
//	     캘린더 (1월이 0으로 시작함) 와는 다르게 LocalDate의 1월은 1부터 시작함.
//		 
		/*LocalDate
		*int			getYear()
		*Month			getMonth()
		*int			getMonthvalue()
		*int			getDayOfYear()
		*int			getDayOfMonth()
		*DayOfWeek		getDayOfWeek()
		*boolean		isLeapYear()
		*/  
		/*LocalTime
		*int		getHour()
		*int		getMinute()
		*int		getSecond()
		*int		getNano()
		*
		*클래스들의 정보 더하기 때기
		*minus 년일월중 하나(long) / plus 년월일중 하나(long)
		*/
		
		/*클래스들의 정보 변경하기
		* with 년일월중 하나(int) / with 년월일중 하나(int)
		*/
	}
}
