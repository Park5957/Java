package day058;

public class Arithmetic_Operator {

	public static void main(String[] args) {
		System.out.println(sum(10,20));
		System.out.println(sud(10,20));
		System.out.println(mu1(10,20));
		System.out.println(div(10,20));
		//�Ǽ��� ���	
		System.out.println(sum(1.2,1.3));
		System.out.println(sud(1.2,1.3));
		System.out.println(mu1(1.2,1.3));
		System.out.println(div(1.2,1.3));
		
		System.out.println(sum("hello : ","world"));
	
	}
	//������ ��Ģ���� - �߰��� �ý�������Ʈ ���� �߰����� ���� ������ ������ ������� ����ϱ� ����
	static int sum(int x, int y) {return(x+y);}
	static int sud(int x, int y) {return(x-y);}
	static int mu1(int x, int y) {return(x*y);}
	static int div(int x, int y) {return(x/y);}
	
	//�Ǽ����� ��Ģ����
	static double sum(double x, double y) {return(x+y);}
	static double sud(double x, double y) {return(x-y);}
	static double mu1(double x, double y) {return(x*y);}
	static double div(double x, double y) {return(x/y);}
	//���ڿ� ���׿���
	static String sum(String x, String y) {return (x+y);}

}
