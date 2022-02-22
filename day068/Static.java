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
//		InstanceInner ii2 = new InstanceInner(); 스텍틱메서드 에는 인스턴스 맵버가 접근할 수 없음
	}
	
	void InsrancMethod() {
		StaticClnner st3 =new StaticClnner();
		InstanceInner ii3 = new InstanceInner();
	}
	
}