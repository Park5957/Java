package day064;

public class Inheritancel2 {

	public static void main(String[] args) {
		Leader leader = new Leader();
		leader.say();
	}

}
class Student2 {


	void lead() {
		System.out.println("����");
	}
	void eat() {
		System.out.println("��Ա�");
	}
	void say() {
		System.out.println("������ �ȳ��ϼ���");
	}
}
class Leader extends Student2{
	void lead() {}
	void say() {//�ż��� �������̵�
		System.out.println("�����Բ� �λ�");
		
		super.say(); // �θ�Ŭ������ say�� ����� �ϰ� �ʹٸ� super �� �տ� ���̸� ��
	}
}