package day051;

public class line01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//�迭�̶� ���� �ڷ����� �������� ������ ����
		//���� Ÿ���� ������ �����ϱ� ���ؼ� ���
		
		//Ÿ��[]�迭��;               int[]ar;
		//�迭��=newŸ��[����];        ar=new int[3];
		
		//Ÿ��[]�迭��=newŸ��[����]; �迭�� ����� ������ ���ÿ� �ϴ� �ʱ�ȭ
		
		//ar [(0)(1)(2)] �̶�� ����� ������ �������� **���۹�ȣ�� 0
		
		//�ε��� index �迭�� ��ġ���� ���� ��Ī Ȱ�� ar[1] �� ���� ���·� ����
		//�ε��� ���� �����ε� ����� ������ ar[0]=10; ������ ���·�
		
		//������ �迭�� �ʱⰪ : 0
		//������ �迭�� �ʱⰪ : ''
		//�Ǽ��� �迭�� �ʱⰪ 0.0
		// ���ڿ� �迭�� �ʱⰪ : null
		
//		int score1=100;
//		int score2=80;
//		int score3=70;
//		System.out.println("1��:",+sore1);
//		��� �� ���� �������
		
		int[]scores = new int[3];
		scores[0]=100;
		scores[1]=80;
		scores[2]=70;
		
		for(int i=0; i < 3; i++)
//		System.out.println("1��:",+scores[0]);
//		System.out.println("2��:",+scores[1]);
//		System.out.println("3��:",+scores[2]);
			
			System.out.println(i+1+"�л�����:" + scores[i]+"��");
		

	}

}
