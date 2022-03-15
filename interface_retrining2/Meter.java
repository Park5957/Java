package interface_retrining2;

public interface Meter {
//	Meter(택시 미터기) 인터페이스는 start와 stop이라는 추상 메서드가 있습니다.
//	stop 메서드는 택시가 달린 거리에 해당하는 값(distance)을 매개변수로 받아 요금을 int형으로 반환하는 메서드입니다.
//	Meter 인터페이스를 구현하는 택시 클래스를 완성해보세요. 요금은 distance×2로 계산합니다.
	
	
	public int BASE_FARE = 3000;
	
	public void start();
	public int stop(int distance);
	
	public default void afterMidnight() {
	    System.out.println("자정이 넘었습니다. 할증이 필요한 경우 이 메서드를 오버라이드하세요.");
	}

}
