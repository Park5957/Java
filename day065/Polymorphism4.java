package day065;

public class Polymorphism4 {

	public static void main(String[] args) {
		Animal lion1 = new Lion(); // ���̿��� ���ϸ� Ÿ���̱⿡ ���� ���� ������ ���°� �����ϰ� ��.
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
		System.out.println("������");
	}
} // Ŭ������ ���Ḧ ������ �ش� Ŭ������ �ϼ��� ó�� �� �ڿ� �ϴ� Ŭ���� ������ ����
	class Lion extends Animal {
		public String toString() {
			return "����";
		}
	}

	class Rabbit extends Animal {
		public String toString() {
			return "�䳢";
		}
	}

	class Monkey extends Animal {
		public String toString() {
			return "������";
		}
	}

	class Zookeeper {
		void feed(Animal animal) {
			System.out.println(animal + "���� ���̸� �ּ���");
		}
	}
