package day076;

public class Generic {

	public static void main(String[] args) {
		// Ŭ������ �ٷ� ��ü�� �̸� ����ϴ� ���
		// "���׸� == �Ϲ�ȭ"
		// ex) �ýó� ������ �׳� �ڵ���(�Ϲ�ȭ) ��� �ٷ겾
		// ��, ���׸��� ��� ������ Ÿ���� �ٷ� �� �ֵ���, Ŭ������ �޼��带 Ÿ�� �Ż������� �̿��Ͽ� ������ ���
		
		// Ŭ���� �� �ڿ� <E>,<K>,<V> �� ���� �������� ���
		// �� <> �ȿ��� ���� �ô� ���ĺ�, ���ô�, Ŭ������ �� �� �Ӥ���.
		/* Ÿ��
		 * E : �迭�̳� ���յ��� ��� Ÿ���� ����
		 * T : ������ �ڷ����� ���� Ÿ���� ����
		 * S,U : �������� ������ ����� ����� �� ���� ���
		 * K : Ű Ÿ�� ������ ���
		 * V : �� Ÿ�� ���� �� ���
		 */
		value v = new value();
		v.<Integer>tpeSearch(3);
		// tpeSearch�� Integer�� �ٲ�� ���ؼ��� �տ� ������ ����� �Ѵ�.
		// ������ java8 �� �� ���� ������ �������� �ʾƵ� �ڵ����� ������ ���ش�.
		v.tpeSearch(3.14);
		v.tpeSearch(3.14f);
		v.tpeSearch('a');
		v.tpeSearch("hello");
		v.tpeSearch(true);
	}
}
/* ���� ���
 *  3�� �����Դϴ�.
 *  3.14 �� �Ǽ� �Դϴ�.
 *  3.14 �� �Ǽ� �Դϴ�.
 *  a�� ������ �Դϴ�.
 *  hello�� ���ڿ� �Դϴ�.
 */

class value{
	public <T> void tpeSearch(T x) { // T Ÿ���� x �� ������ �ò�
		if(x instanceof Integer) { // x �� Integer �� ������� ��ü �ΰ�?
			System.out.println(x+"�� ���� �Դϴ�.");
		}
		else if(x instanceof Double||x  instanceof Float) { // x�� ���� or �÷� �̴�?
			System.out.println(x+"�� �Ǽ� �Դϴ�.");
		}
		else if(x instanceof Character) {
			System.out.println(x+"�� ���ڿ� �Դϴ�.");
		}
		else if(x instanceof String) {
			System.out.println(x+"�� ���ڿ� �Դϴ�.");
		}
		else if(x instanceof Boolean) {
			System.out.println(x+"�� ���� �Դϴ�.");
		}
			 
	}
}




















