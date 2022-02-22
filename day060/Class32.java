package day060;

public class Class32 {

	public static void main(String[] args) {
		//같은 패키지 안에 존재하는 class의 명칭은 중복해서 생성 할 수 없다
		//같은 패키지 안에 존재하는 class는 다른 클래스 에서도 사용 할 수 있다.
		Car mycar1 = new Car();
		Car mycar2 = new Car();
		mycar1.color="red";
		mycar2.color="black";
		mycar1.speedUp();
		mycar2.wiper();
		
		System.out.println("mycar1의 색 : " + mycar1.color);
		System.out.println("mycar2의 색 : " + mycar2.color);
		
		System.out.println("mycar1의 speed : " + mycar1.speed);
		System.out.println("mycar2의 speed : " + mycar2.speed);
		
		System.out.println("mycar1의 색 : " + mycar1.wiperOn);
		System.out.println("mycar2의 색 : " + mycar2.wiperOn);
		
		//위와 같은 방식으로 같은 구성의 클래스를 가지고 각기의 다른 차량 두대를 생성함
	}
}



