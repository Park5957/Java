package day045;

public class Instanceof_op {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//��Ÿ������ ��ü�� ����� ���� ������ Ư¡ �չ��� �빮��
		//Integer = int �ڷ���
		//Float = float
		//Double = double
		//Character = char
		
		
		String s="Helllo";
		int i=3;
		float f=3.14f;
		double d=3.14;
		char c='a';
		
		System.out.println(s instanceof String);
		System.out.println(Integer. valueOf(i) instanceof Integer);
        System.out.println(Float. valueOf(f)instanceof Float);
        System.out.println(Double. valueOf(d)instanceof Double);
		System.out.println(Character. valueOf(c) instanceof Character);
		
		
		// �� �ڵ�� Ŭ����(�� ���¿� �´�) �� �����ϱ� ���� �ڵ��̸� valuof�� �ڵ��ϼ��� ���� ������ ��
	}

}
