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
		System.out.println("�Ѱ����� ����Ű ����");
		
	}

	@Override
	public void sightseeing() {
		System.out.println("�溹�� ���� ����");
		
	}

	@Override
	public void food() {
		System.out.println("���� ����� ����");
	}
	
}
class JT implements Providable{

	@Override
	public void leisureSoprts() {
		System.out.println("����Ÿ�� �������� ����");
		
	}

	@Override
	public void sightseeing() {
		System.out.println("���ī ��������");
	}

	@Override
	public void food() {
		System.out.println("�ʹ� ����");
	}}

class TourGuide{
//	private Providable tour = new KT(); // �������̽��� ������ ������ ������ ���游���� ���� ������ ������ ������
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