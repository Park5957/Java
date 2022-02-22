package day066;

public class AstractClass1 {

	public static void main(String[] args) {
		Pokemon pokemon = new Pikachu();
		System.out.println("이 포켓몬은 : "+pokemon.getName());
		pokemon.attack();
		pokemon.sound();
		
		pokemon=new Squ();
		System.out.println("이 포켓몬은 : "+pokemon.getName());
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
		this.name="피카츄";
	}
	@Override
	void attack() {
		System.out.println("전기 공격");	
	}
	@Override
	void sound() {
		System.out.println("피카 피카");
	}
}

class Squ extends Pokemon{
	Squ() {
		this.name="꼬부기";
	}
	@Override
	void attack() {
		System.out.println("물 공격");	
	}
	@Override
	void sound() {
		System.out.println("꼬북 꼬북");
	}
}
