package day068;

public class Anorymous {

	public static void main(String[] args) {
		
		//익명 클래스 - 이름이 없는 클래스
		// 기존 클래스가 존재해야함
		// 기존 클래스를 오버라이딩 하여 제조하는 것
		/* 기존 클래스의 구조
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
		 *  익명 클래스 구조
		 *             Some annony = new Some(){  이 내부를 새롭게 재 정의하면 됨
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
				System.out.println("새롭게 정의된 익명클래스 메서드 립니다.");
			}
		};
		o.a();
		
		OuterClass1 ok = new OuterClass1();
		ok.a(); // 익명 클래스는 1회용 이며, 즉 아우터 클랙스1 자체를 변경한 것이 아니다.

	}

}

class OuterClass1{
	void a() {System.out.println("method a");}
	void b() {}
}