package day062;

public class Class_class {

	public static void main(String[] args) {
		// ��ü Ÿ���� �迭
		/*
		 * ���� Ŭ������ ������ �迭 ex) Ŭ������ ��ü�迭��[] = new Ŭ������ [ũ��]; Aclass ar[] = new Aclass[3];
		 */

		Aclass ar[] = new Aclass[3]; // �迭�� Ʋ�� ����
		ar[0] = new Aclass(); // ****** �ش� �迭 ��ġ�� Ŭ���� �̽� ******
		ar[0].x = 100;
		ar[0].f1();

	}
}

class Aclass {
	int x;

	void f1() {
		System.out.println("f1()");
	}
}