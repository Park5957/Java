package day062;

public class AnumakArray {

	public static void main(String[] args) {
		
		Animal TS[] = new Animal[3];
		
//		TS[0] = new Animal();
//		TS[1] = new Animal();
//		TS[2] = new Animal();
// 다른 방법도 가능함. 아래의 포문이 간편한 표식
		
		for (int i=0; i<=2; i++) {
			TS[i] = new Animal();
		}
		
		TS[0].kind="고양이";
		TS[0].name="나르";
		TS[0].age=1;
		
		TS[1].kind="강아지";
		TS[1].name="초코";
		TS[1].age=3;
		
		TS[2].kind="고양이";
		TS[2].name="니코";
		TS[2].age=1;
		
//		System.out.println("--------------------");
//		TS[0].info();
//		System.out.println("--------------------");
//		TS[1].info();
//		System.out.println("--------------------");
//		TS[2].info();
		for (int j=0; j<=2; j++) {
			System.out.println("--------------------");
			TS[j].info();
		}
		
	}

}


class Animal {
	String kind;
	String name;
	int age;
	
	void info() {
		System.out.println("Kind : "+kind);
		System.out.println("Name : "+name);
		System.out.println("age : "+age);
	}
}