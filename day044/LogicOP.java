package day044;

public class LogicOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean a=true;
		boolean b=false;
		boolean c=true;
		
		System.out.println(a&&b); // a��b ��� ���̸� tlue
		System.out.println(a&&c);
		System.out.println((2<4)&&(4<5));// true&&true
		System.out.println(a||b); //a Ȥ�� b �� true ��� true
		System.out.println(a||c);
		System.out.println(b||b); // false || false �϶��� false
		System.out.println(!a); // ���� ���� �ݴ�ǥ��

	}

}
