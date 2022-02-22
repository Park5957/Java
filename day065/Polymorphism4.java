package day065;

public class Polymorphism4 {

	public static void main(String[] args) {
		Animal lion1 = new Lion(); // 라이온이 에니멀 타입이기에 들어가는 것이 가능한 상태가 성립하게 됨.
		Animal rabbit1 = new Rabbit();
		Animal monkey1 = new Monkey();
		Zookeeper james=new Zookeeper();
		james.feed(lion1);
		james.feed(rabbit1);
		james.feed(monkey1);
		
	}
}

class Animal {
	void breath() {
		System.out.println("숨쉬기");
	}
} // 클래스의 졸료를 함으로 해당 클래스의 완성을 처리 한 뒤에 하단 클랙스 변경을 구축
	class Lion extends Animal {
		public String toString() {
			return "사자";
		}
	}

	class Rabbit extends Animal {
		public String toString() {
			return "토끼";
		}
	}

	class Monkey extends Animal {
		public String toString() {
			return "원숭이";
		}
	}

	class Zookeeper {
		void feed(Animal animal) {
			System.out.println(animal + "에게 먹이를 주세요");
		}
	}
