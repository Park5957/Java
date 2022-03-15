package interface_retrining;

public class LedExam {

	public static void main(String[] args) {
		
		Interface_Tv tv = new LedTv();
		
		tv.turnOn();
        tv.changeVolume(8);
        tv.changeChannel(39);
        tv.turnOff();
        // 참조 변수의 타입으로 인터페이스를 사용할 수 있다.
        // 인터페이스가 가진 메서드만 사용할 수 있다.
        // 같은 인터페이스를 구현한다는 것은 클래스 사용법이 똑같다는 의미이다.
        // 참고로 클래스는 1개 이상 인터페이스를 구현할 수 있다.
        
        // 일반 클래스와 같은 기능임에도 인터페이스를 사용하는 이유?
        // 중복된 기능들을 인터페이스로 구현을 해 하나의 인터페이스로 처리가 가능하기 때문이다.
        
        // Interface_Tv 은 부모 클래스와 같으며, 명령서와 같다.
        // LedTv 은 일종에 자식클래스와 같은 역할이라 할 수 있으며, 수행서와 같다.
        // LedExam 은 이들을 이용해 실행하는 것이다.
        
	}

}
