package day068;

public class Static {

	public static void main(String[] args) {
	}
}
class A{
	static class StaticClnner{}
	class InstanceInner{}
	
	StaticClnner st1 = new StaticClnner();
	InstanceInner ii1 = new InstanceInner();
	
	static void StaticMethod() {
		StaticClnner st2 =new StaticClnner();
//		InstanceInner ii2 = new InstanceInner(); ����ƽ�޼��� ���� �ν��Ͻ� �ʹ��� ������ �� ����
	}
	
	void InsrancMethod() {
		StaticClnner st3 =new StaticClnner();
		InstanceInner ii3 = new InstanceInner();
	}
	
}