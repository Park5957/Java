package day066;

public class AstractClass1 {

	public static void main(String[] args) {
		Pokemon pokemon = new Pikachu();
		System.out.println("?? ???ϸ??? : "+pokemon.getName());
		pokemon.attack();
		pokemon.sound();
		
		pokemon=new Squ();
		System.out.println("?? ???ϸ??? : "+pokemon.getName());
		pokemon.attack();
		pokemon.sound();

	}

}
abstract class Pokemon{
	String name;
	abstract void attack();
	abstract void sound();
	
	public String getName() {
		return this.name;
	}
}
class Pikachu extends Pokemon{
	Pikachu() {
		this.name="??ī??";
	}
	@Override
	void attack() {
		System.out.println("???? ????");	
	}
	@Override
	void sound() {
		System.out.println("??ī ??ī");
	}
}

class Squ extends Pokemon{
	Squ() {
		this.name="???α?";
	}
	@Override
	void attack() {
		System.out.println("?? ????");	
	}
	@Override
	void sound() {
		System.out.println("???? ????");
	}
}
