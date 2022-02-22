package day063;

public class PhoneConstructor {

	public static void main(String[] args) {
		
		Iphone myIphone1 = new Iphone(); // 지정값 부존재로 아무정보도 뜨지 않음
		Iphone myIphone2 = new Iphone("iphone SE", "White",70); // 지정값 부분만 출력 가능함
		System.out.println(myIphone1.capacity);
		System.out.println(myIphone2.capacity);
	

	}

}
class Iphone{
	String model;
	String color;
	int capacity;
	
	Iphone() {}
	Iphone(String model, String coloy, int capacity) {
		this.model = model;
		this.color = color;
		this.capacity = capacity;
	}
	void info() {
		System.out.println("Model : " + model);
		System.out.println("Color : " + color);
		System.out.println("Capacity : " + capacity);
	}
}