package day065;

public class Upcasting {

	public static void main(String[] args) {
		/*
		 * �ǽ����ǿ��� ��� Ŭ���� - �̸� ���� ��� �л�Ŭ���� �̸� ���� ��� �г�
		 */
		Student st1 = new Student("���浿", 20, "�����ϱ�", 3);
		st1.info();
		st1.Study();

		Human H1 = new Student("���浿", 17, "���ϱ�", 1); // ��ĳ������ ����� ���� - ���� ���ε����� ó���Ǿ����� �� �� ����
		H1.info();
		/* ���� ���ε��̶�?
		 * ������ �������� �θ� Ŭ������ �ʵ�� �����ϳ�, ��Ÿ�� �������� �ڽ� Ŭ������ �ʵ�� ȣ�� �� �ż��带 ���� ��
		 */

	}

}

class Human {
	String name;
	int age;
	String hobby;

	public Human(String name, int age, String hobby) { // ���� ������� ����Ʈ ��Ʈ S -> ����Ʈ���� ��¡ Ŭ��
		super();
		this.name = name;
		this.age = age;
		this.hobby = hobby;
	}

	void info() {
		System.out.println("name : " + name);
		System.out.println("age : " + age);
		System.out.println("hobby : " + hobby);
	}
}

class Student extends Human {
	int grade;

	public Student(String name, int age, String hobby, int grade) {
		super(name, age, hobby); // �θ�Ŭ���� �Ű躯�� ������
		this.grade = grade;
	}

	void info() { // �������̵�
		super.info();
		System.out.println("grade : " + grade);
	}
	void Study() { // ��� �������̵��� �ȵ� ���� �߰��ϰ� �ʹٸ� �� ���� ���̵� �ȿ� �־�� ��
		System.out.println("�����ϱ�~");
	}
}
