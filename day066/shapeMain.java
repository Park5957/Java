package day066;

public class shapeMain {

	public static void main(String[] args) { // �� ���������� ��ü �迭�� ���� �� ĳ������ �ϴ� ����� �� �� ����
		shape shapes[] = new shape[3];
		//�θ� ��ü �迭 ��ҿ� �ڽ� ���� ����
		shapes[0] = new Rect();
		shapes[1] = new Circle();
		shapes[2] = new Line();
		
		for (int i=0; i<3; i++) {
			shapes[i].draw();
		}
	}
}
class shape{
	void draw() {
		System.out.println("������ �׸���.");
	}
}
class Rect extends shape{
	void draw() {
		System.out.println("�簢���� �׸���.");
	}
}
class Circle extends shape{
	void draw() {
		System.out.println("���� �׸���.");
	}
}
class Line extends shape{
	void draw() {
		System.out.println("���� �׸���.");
	}
}
