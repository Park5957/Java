package day068;

public class Class_Class {

	public static void main(String[] args) {
		/* ����Ŭ����
		 *   Ŭ���� ���ο��� ������ Ŭ����
		 *   
		 *   ����
		 *   class OuterClass{ class InerClass{} }
		 *   
		 *   ����
		 *   Ŭ�������� ���谡 ����� �� ����Ͽ� �ڵ带 �����ϰ� �ϱ� ���� ���
		 *   
		 *   ����
		 *   ���� Ŭ���� ������ ��ġ�� ���� �ν��Ͻ�, ����ƽ, ����, �͸�
		 *   
		 *   �ν��Ͻ�  	class OuterClass{ class InerClass{} }
		 *   ����ƽ   	class OuterClass{ static class InerClass{} }
		 *   ����			class OuterClass{ void A(){ InerClass{} }}
		 *   
		 *   �������� ����
		 *   class OuterClass{
		 *    private class InerClass{}
		 *     protected class InerClass{}
		 *      }
		 */
	}

}
