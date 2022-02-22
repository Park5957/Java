package day063;

public class Constructor2 {

	public static void main(String[] args) {
		cellphone myphone = new cellphone();
		System.out.println(myphone.model);
	

	}

}
class cellphone{
	String model = "Galaxy8";
	String color = "red";
	int capacity=60;
	cellphone() {
		System.out.println("model : " + model);
		System.out.println("color : " + color);
		System.out.println("capacity" + capacity);
	}
	
}