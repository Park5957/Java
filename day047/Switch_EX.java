package day047;

public class Switch_EX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ϳ� ���� ���� å ���� ���� ��Ʈ ��� // ��ĳ�� ���� ��Ŵ // ������� int�� �����ϴ� ������
		//�극��ũ�� �������� �ʴٸ� ��� ����� ��µ�. ��, default �� ���� ��� ���� �ÿ� �߻��ϴ� ����
		int book=100;
		book=book/10;
		
		switch(book) {
			case 0 :
			System.out.println("���ݴ� ����Ͻñ� �ٶ��ϴ�.");
			break;
			
			case 1 :
				System.out.println("å�� ���±�");
				break;
				
			case 2 :
				System.out.println("å�� ����ϴ� ����̱���");
				break;
				
			default:
				System.out.println("���� �д±�");
				
		}
	}

}
