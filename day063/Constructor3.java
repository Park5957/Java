package day063;

public class Constructor3 {

	public static void main(String[] args) {
	Bclass b1= new Bclass("���浿");
	System.out.println(b1.name);
	Bclass b=new Bclass();
	System.out.println(b);
		
		
	}

}

class Bclass{
	String name;
	//�����ڿ����ε� : ������ ������ �ߺ�����
	Bclass(){} //�����ε��� ����
	Bclass(String name2) { //�Ű����� ������
		System.out.println("Bclass�� �Ű����� ������()");
		this.name=name2; // this ���� ��ü�� ��Ī�ϱ� ���� Ű����. 
		
	}
}