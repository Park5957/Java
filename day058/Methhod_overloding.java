package day058;

public class Methhod_overloding {

	public static void main(String[] args) {
		/* �����ε��̶�?
		 * �Ű������� ������ Ÿ���� Ÿ������ �̸��� ���� �ż��带 ������ ���� �ϴ� ��
		 * 
		 */
		sum(10,20);
		sum(1.23,3.12);
		sum(10,20,30);
		//���� �ż��� ������ ������ ����� �ϳ��� �̸����� �����Ͽ� ���� �� �� ����
	}
	
	static void sum(int x, int y) {
		System.out.println(x+y);
	}
	static void sum(double x, double y) {
		System.out.println(x+y);
	}
	static void sum(int x, int y, int z) {
		System.out.println(x+y+z);
		
	}

}
