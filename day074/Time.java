package day074;

public class Time {

	public static void main(String[] args) {
		/* java.time ��Ű��
		 * ���ο� �ð��� �ٷ�� ���� ��Ű��
		 * LocalDate Ŭ���� : ��¥ ������ ����
		 * ���� ��¥ ���� : now()
		 * Ư�� ��¥ ���� : of()
		 * ����
		 * LocalDate ld = LocalDate.now()
		 * LocalDate mld = LocalDate.of(int year, int month, int dayOfMonth);
		 * 									���		���			����
		 * 
		 * LocalTime : �ð� ������ ����
		 * ���� �ð� ���� : now()
		 * Ư�� �ð� ���� : of()
		 * ���� �����Ϳ� ������ ����
		 * LocalTime lt = LocalTime.now()
		 * LocalTime mld = LocalTime.of(int hour, int minute, int second, int manoOfSecond);
		 * of(int minute)
		 * of(int minute, int second)
		 * of(int minute, int second, int manoOfSecond)
		 * 
		 * �պ�
		 * LocalDateTime ld = LocalDateTime.now()
		 * LocalDateTime mld = LocalDateTime.of(int.year, int month, int dayOfMonth);
		 * 
		 * zoneDateTime Ŭ����
		 * ������ ���Ŀ� ���߾� ��¥�� �ð��� �����ϰڴٴ� �ǹ�
		 * zoneDateTime ������ = zoneDateTime.noe(zoneDateTime.of("UTC");
		 * 
		 * Instant Ŭ���� : Ư�� ������ Ÿ�� ������ ��ü
		 * 1970.01.01. ���� ��������� �ð��� ���� ��ü
		 */
		
//	     Ķ���� (1���� 0���� ������) �ʹ� �ٸ��� LocalDate�� 1���� 1���� ������.
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
		*Ŭ�������� ���� ���ϱ� ����
		*minus ���Ͽ��� �ϳ�(long) / plus ������� �ϳ�(long)
		*/
		
		/*Ŭ�������� ���� �����ϱ�
		* with ���Ͽ��� �ϳ�(int) / with ������� �ϳ�(int)
		*/
	}
}
