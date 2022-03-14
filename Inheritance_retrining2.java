package pm6;

public class Inheritance_retrining2 {

	public static void main(String[] args) {
		Human h1 = new Human();
//		Human[] h2 = new Human[2];
		h1.name = "홍길동";
		h1.age = 13;
		h1.eat();
		h1.sleep();
		
		Studrnt s = new Studrnt();
		s.name = "성춘향";
		s.age = 16;
		s.eat();
		s.sleep();
		
		System.out.println(s.age);
		s.goToschool();
//		System.out.println(h2[0]);
//		System.out.println(h2[1]);
		

	}

}

class Human {
	String name;
	int age;
	void eat() {}
	void sleep() {}
}

class Studrnt extends Human{
	int studentID;
	void goToschool() {
		studentID = age*2;
		System.out.println("ID :" +studentID);
		
	}
}
class Worker extends Human{
	int WorkerID;
	void goTowork() {
		WorkerID = age*2;
		System.out.println("ID :" +WorkerID);
		
	}
}