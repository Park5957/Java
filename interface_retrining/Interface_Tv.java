package interface_retrining;

public interface Interface_Tv { // 본 코드는 tv의 기능으로 구현한 인터페이스의 정의
	
	public int MIN_VOLUME=0; // volume 의 값 최저치 설정
    public int Max_VOLUME=100; // volume 의 값 최대치 설정
    //인터페이스에 선언한 변수는 무조건 상수로 처리된다. 이렇게 선언한 변수는 실행 중에 값을 바꿀 수 없다.
    
	public void turnOn();
    public void turnOff();
    public void changeVolume(int volume);
    public void changeChannel(int channel);
    
    }