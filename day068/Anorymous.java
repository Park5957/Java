package day068;

public class Anorymous {

	public static void main(String[] args) {
		
		//�͸� Ŭ���� - �̸��� ���� Ŭ����
		// ���� Ŭ������ �����ؾ���
		// ���� Ŭ������ �������̵� �Ͽ� �����ϴ� ��
		/* ���� Ŭ������ ����
		 *             class Some{
		 *             			private int a=3;
		 *             			int getter(){
		 *             						return this.a;
		 *             			}
		 *             			void setter(int a){
		 *          							this.a=a;
		 *          			}
		 *          	}
		 *          
		 *  �͸� Ŭ���� ����
		 *             Some annony = new Some(){  �� ���θ� ���Ӱ� �� �����ϸ� ��
		 *             			private int a=4;
		 *             			int getter(){
		 *             						return this.a;
		 *             			}
		 *             			void setter(int a){
		 *          							this.a=a;
		 *          			}
		 *          	};
		 *  
		 */
		OuterClass1 o = new OuterClass1() {
			void a() {
				System.out.println("���Ӱ� ���ǵ� �͸�Ŭ���� �޼��� ���ϴ�.");
			}
		};
		o.a();
		
		OuterClass1 ok = new OuterClass1();
		ok.a(); // �͸� Ŭ������ 1ȸ�� �̸�, �� �ƿ��� Ŭ����1 ��ü�� ������ ���� �ƴϴ�.

	}

}

class OuterClass1{
	void a() {System.out.println("method a");}
	void b() {}
}