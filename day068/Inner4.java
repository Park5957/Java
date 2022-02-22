package day068;

public class Inner4 {

	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		System.out.println("OuterClass �� a�� �� : " + oc.a);
		System.out.println("OuterClass �� b�� �� : " + OuterClass.b);
		//����ƽ Ŭ������ ��ü�� �������� �ʾƵ� ������ �����ϴٴ� ���ð� b�� ���̴�.
		
		System.out.println("===inner Ŭ���� ��������===");
		OuterClass oc2 = new OuterClass();
		OuterClass.Inner i=oc2.new Inner();
		/* ����Ŭ���� ��ü �������
		 * �ܺ�Ŭ����.����Ŭ���� ��ü�� = new �ܺ�Ŭ����������().����Ŭ����������();
		 * 						 �ܺ�Ŭ������ü.new ����Ŭ����������();
		 */
		System.out.println("Inner�� c�� �� : "+i.c);
		i.innerMethod();
		
		OuterClass.StartcInner si = new OuterClass.StartcInner();
		System.out.println("StacicInner�� d�� �� : "+si.d);
		
		si.StaticMethod(); // -> ��ü�� ������� �ʰ� Ŭ�������� ����ؼ� ȣ�� �� �� �ִ�.
		OuterClass.StartcInner.StaticMethod();
		
	}

}

class OuterClass{
	int a=3;
	static int b=4;
	class Inner{
		int c=5;
		public void innerMethod() {
			System.out.println("<Inner Class>");
		}
	}
	static class StartcInner{
		int d=6;
		static int atart=10;
		public static void StaticMethod() {
			System.out.println("<Static Inner>");
		}
	}
	
}