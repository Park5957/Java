package day064;

public class SuperConstructor {

	public static void main(String[] args) {
		Sportcar mycar = new Sportcar("red",300);
		System.out.println(mycar.color);
		System.out.println(mycar.speedLimit);
	

	}

}
class Car {
	int wheel;
	int speed;
	String color;
	Car(){} // ������
	Car(String color) {
		this.color = color;
	}
}

class Sportcar extends Car{
	int speedLimit;
	Sportcar (String color, int speedLimit) {
//		super(color) // ������ �ι�° ���
		this.color=color;
		this.speedLimit=speedLimit;
	}
}