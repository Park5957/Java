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
	Car(){} // 지정자
	Car(String color) {
		this.color = color;
	}
}

class Sportcar extends Car{
	int speedLimit;
	Sportcar (String color, int speedLimit) {
//		super(color) // 지정자 두번째 방법
		this.color=color;
		this.speedLimit=speedLimit;
	}
}