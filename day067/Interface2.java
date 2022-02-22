package day067;

public class Interface2 {

	public static void main(String[] args) {
		TourGuide gulde = new TourGuide();
		gulde.leisureSoprts();
		gulde.sightseeing();
		gulde.food();
	}
}
interface Providable {
	void leisureSoprts();
	void sightseeing();
	void food();
}
class KT implements Providable {

	@Override
	public void leisureSoprts() {
		System.out.println("한강에서 수상스키 투어");
		
	}

	@Override
	public void sightseeing() {
		System.out.println("경복궁 관람 투어");
		
	}

	@Override
	public void food() {
		System.out.println("전주 비빔밥 투어");
	}
	
}
class JT implements Providable{

	@Override
	public void leisureSoprts() {
		System.out.println("토쿄타워 번지점프 투어");
		
	}

	@Override
	public void sightseeing() {
		System.out.println("토사카 관람투어");
	}

	@Override
	public void food() {
		System.out.println("초밥 투어");
	}}

class TourGuide{
//	private Providable tour = new KT(); // 인터페이스를 구현을 함으로 간단한 변경만으로 투어 내용의 변경이 편해짐
	private Providable tour = new JT();
	public void leisureSoprts() {
		tour.leisureSoprts();
	}
	public void sightseeing() {
		tour.sightseeing();
	}
	public void food() {
		tour.food();
	}
}