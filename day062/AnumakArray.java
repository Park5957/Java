package day062;

public class AnumakArray {

	public static void main(String[] args) {
		
		Animal TS[] = new Animal[3];
		
//		TS[0] = new Animal();
//		TS[1] = new Animal();
//		TS[2] = new Animal();
// �ٸ� ����� ������. �Ʒ��� ������ ������ ǥ��
		
		for (int i=0; i<=2; i++) {
			TS[i] = new Animal();
		}
		
		TS[0].kind="�����";
		TS[0].name="����";
		TS[0].age=1;
		
		TS[1].kind="������";
		TS[1].name="����";
		TS[1].age=3;
		
		TS[2].kind="�����";
		TS[2].name="����";
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