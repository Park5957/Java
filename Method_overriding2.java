package pm6;

import java.util.Arrays;

public class Method_overriding2 {

	public static void main(String[] args) {
		Animal[] ani = new Animal[3];
		ani[0] = new Bird();
		ani[1] = new Cat();
		ani[2] = new Dog();
		
//		ani[0].cry();
//		ani[1].cry();
//		ani[2].cry();
		
		for(int i=0; i<ani.length; i++) {
			ani[i].cry();
		}
		
//		or
		System.out.println("---절취선---");
		for (Animal ii : ani ) {
			ii.cry();
		}
		
	}

}

class Animal {
	void cry() {
	}
}

class Bird extends Animal {
	void cry() {
		System.out.println("짹짹");
	}
}

class Cat extends Animal {
	void cry() {
		System.out.println("야옹");
	}
}

class Dog extends Animal {
	void cry() {
		System.out.println("멍멍");
	}
}