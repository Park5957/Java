package interface_retrining;

public class LedTv implements Interface_Tv {
	//Interface_Tv 가 가진 기능들을 LedTV도 모두 갖게 하겠다는 뜻.
	//따라서 LedTV는 Interface_Tv가 가진 모든 기능을 반드시 구현해야 한다.

	@Override
	public void turnOn() {
		System.out.println("켜다");

	}

	@Override
	public void turnOff() {
		System.out.println("끄다");

	}

	@Override
	public void changeVolume(int volume) {
		System.out.println("볼륨을 조절하다.");

	}

	@Override
	public void changeChannel(int channel) {
		System.out.println("채널을 변경하다.");

	}

}
