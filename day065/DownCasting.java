package day065;

public class DownCasting {

	public static void main(String[] args) {
		Human h1 = new Student("���浿",20,"�����ϱ�",3); // ��ĳ����
		
		Student s1 = (Student)h1; //�ٿ� ĳ���� (�ڽ� ���� �θ��� �ִ� ��)(h1�� ���� student ������ ������ ��)
		s1.Study();
	}
}

