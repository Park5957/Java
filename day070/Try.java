package day070;

public class Try {

	public static void main(String[] args) {
	// throw �� throws
	//  ���ܸ� ������ ó���ϴ� �� �� ���ܸ� �ٸ�������� ó���϶�� �ѱ�� ��	
		try {
			Exception e =new Exception ("���� ����");
			throw e; //���������� ���ܸ� �����ڴ�
		}
		catch (Exception e) {
			System.out.println("���ܹ߻�");
			System.out.println(e.getMessage());
		}
	} 
}
