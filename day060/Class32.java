package day060;

public class Class32 {

	public static void main(String[] args) {
		//���� ��Ű�� �ȿ� �����ϴ� class�� ��Ī�� �ߺ��ؼ� ���� �� �� ����
		//���� ��Ű�� �ȿ� �����ϴ� class�� �ٸ� Ŭ���� ������ ��� �� �� �ִ�.
		Car mycar1 = new Car();
		Car mycar2 = new Car();
		mycar1.color="red";
		mycar2.color="black";
		mycar1.speedUp();
		mycar2.wiper();
		
		System.out.println("mycar1�� �� : " + mycar1.color);
		System.out.println("mycar2�� �� : " + mycar2.color);
		
		System.out.println("mycar1�� speed : " + mycar1.speed);
		System.out.println("mycar2�� speed : " + mycar2.speed);
		
		System.out.println("mycar1�� �� : " + mycar1.wiperOn);
		System.out.println("mycar2�� �� : " + mycar2.wiperOn);
		
		//���� ���� ������� ���� ������ Ŭ������ ������ ������ �ٸ� ���� �δ븦 ������
	}
}



