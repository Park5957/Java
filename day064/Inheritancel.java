package day064;

public class Inheritancel {

	public static void main(String[] args) {
		Student st= new Student();
		st.breath();
		st.learn();
		
		Teacher t = new Teacher();
		t.eat();
		t.teach();
		
		//��ӽÿ� �����ڴ� �������� �ʴ´�
		//���߻������X ��, ���̽�� c++ ������ ������
		//Ŭ���� �� final �̶�� Ű����� �ٸ� Ŭ���� ��� �Ұ�
	}

}
class person{
	void breath() {
		System.out.println("������");
	}
	void eat() {
		System.out.println("��Ա�");
	}
	void say() {
		System.out.println("���ϱ�");
	}
}

class Student extends person{
	void learn() {
		System.out.println("����");
	}
	
}

class Teacher extends person{
	void teach() {
		System.out.println("����ġ��");
	}
}