package day060;

public class Class31 {

	public static void main(String[] args) {
		Car mycar = new Car();
		System.out.println("�õ� ó�� �ʱ�ȭ"+mycar.powerOn);
		System.out.println("���� ���� �ʱ�ȭ"+mycar.color);
		System.out.println("������ �� "+mycar.wheel);
		System.out.println("�ӷ� �ʱ�ȭ"+mycar.speed);
		System.out.println("������ �۵� �ʱ�ȭ"+mycar.wiperOn);
		
		mycar.power();
		System.out.println("�õ� �޼��� ����"+mycar.powerOn);
		
		mycar.power();
		System.out.println("�õ� �޼��� ����"+mycar.powerOn);
		
		mycar.color ="black";
		System.out.println("�������� ����" + " : " + mycar.color);

	}

}


class Car{
	boolean powerOn;
	String color;
	int wheel;
	int speed;
	boolean wiperOn;
	
	void power() {powerOn=!powerOn;} //������ ��������. ������ Ʈ���
	void speedUp() {speed++;}
	void speedDown() {speed--;}
	void wiper() {wiperOn=!wiperOn;} //������ ��������. ������ Ʈ���
}