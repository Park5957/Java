package pm9;

interface PredatorBarkable extends Predator, Barkable{
	// interface Predator, Barkable 이 둘을 상속받는 인터페이스를 만들수 있다.
	// 인터페이스는 일반 클래스와는 달리 extends 를 이용하여 여러개의 인터페이스(Predator, Barkable)를 동시에 상속할 수 있다.
	// 즉, 다중 상속이 지원된다.  ※ 일반 클래스는 단일상속만 가능하다.
}

interface Predator{
	   String getFood();
	   
	   default void printFood() {
	      System.out.printf("my food is %s\n", getFood());
	   }

	   int LEG_COUNT = 4;
	   static int speed() {
	      return LEG_COUNT * 30;
	   }
	}

interface Barkable {
    void bark();
}


	class Animal {
	   String name;
	   
	   void setName(String name) {
	      this.name = name;
	      
	   }
	}

	class Tiger extends Animal implements PredatorBarkable{
	   public String getFood() {
	      return "apple";
	   }
	   public void bark() {
	        System.out.println("어흥");
	    }
	}
	

	class Lion extends Animal implements PredatorBarkable {
	   public String getFood() {
	      return "banana";
	   }
	    public void bark() {
	        System.out.println("으르렁");
	    }
	}

	class ZooKeeper {
	   void feed(Predator predator) {
	      System.out.println("feed " + predator.getFood());
	      }
	}
	class Bouncer {
		void barkAnimal(Barkable animal) {
		    animal.bark();
		}
	}
	public class Sample {

	   public static void main(String[] args) {

	      ZooKeeper zooKeeper = new ZooKeeper();
	      Tiger tiger = new Tiger(); 
	      Lion lion = new Lion();
	      
	      zooKeeper.feed(tiger);//매서드 오버로딩
	      zooKeeper.feed(lion);
	      System.out.println("--- 절취선 ---");
	      Bouncer bouncer= new Bouncer();
	      bouncer.barkAnimal(tiger);
	      bouncer.barkAnimal(lion);
	   }

	}
