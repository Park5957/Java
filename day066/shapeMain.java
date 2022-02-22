package day066;

public class shapeMain {

	public static void main(String[] args) { // 이 구간에서는 객체 배열을 통해 업 캐스팅을 하는 방법을 볼 수 있음
		shape shapes[] = new shape[3];
		//부모 객체 배열 요소에 자식 값을 넣음
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
		System.out.println("도형을 그리다.");
	}
}
class Rect extends shape{
	void draw() {
		System.out.println("사각형을 그리다.");
	}
}
class Circle extends shape{
	void draw() {
		System.out.println("원을 그리다.");
	}
}
class Line extends shape{
	void draw() {
		System.out.println("선을 그리다.");
	}
}
