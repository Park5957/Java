package day043;

public class Equlity_sign_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a=3.14;
		double b=5.15;
		System.out.println(a==b); //a�� b�� ������?
		System.out.println(a!=b); //a��b �� �ٸ���/
		
		String c1="Hello JAVA!";
		System.out.println(c1=="Hello JAVA!");
		//���ڿ��� ���� �ÿ��� == �� ������� �ʴ´�(����� ��)
		System.out.println(c1.equals("Hello JAVA!"));
		//���ڸ� ���� �� equals �� �����
		System.out.println(c1.equals("hello java!"));
		//

	}

}
