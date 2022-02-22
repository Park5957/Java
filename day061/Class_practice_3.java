package day061;

public class Class_practice_3 {

	public static void main(String[] args) {
		System.out.println(Car.wheel);
		
		Car myCar1= new Car();
		
		System.out.println(myCar1.speed);
		
		Car myCar2= new Car();
		System.out.println("<변경 전>");
		System.out.println("myCar1.speed : " + myCar1.speed);
		System.out.println("myCar2.speed : " + myCar2.speed);
		System.out.println("myCar1.wheel : " + myCar1.wheel);
		System.out.println("myCar2.wheel : " + myCar2.wheel);
		
		myCar2.speed = 100;  // 객체변수이기에 각각의 마이카는 고유값을 가짐
		myCar2.wheel=5; // 클래스 변수이기 떄문에 하나만 바꿔도 공유되는 클래스 전체가 변경됨
		
		System.out.println("<변경 후>");
		System.out.println("myCar1.speed : " + myCar1.speed);
		System.out.println("myCar2.speed : " + myCar2.speed);
		System.out.println("myCar1.wheel : " + myCar1.wheel);
		System.out.println("myCar2.wheel : " + myCar2.wheel);
		

	}

}


class Car{
	static int wheel = 4;
	int speed;
	
}