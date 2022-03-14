package pm6;

public class Super_Method2 {

	public static void main(String[] args) {
		/* 부모 클래스에 init() 메서드가 있고 그 매서드의 500줄의 코드가 있다고 가정하자
		 * 그런데 자식 클래스는 그 부모 클래스의 기능에다가 어떤 1줄만 추가하고 싶을때
		 * super가 없다면 자식클래스에 부모 클래스의 메서드의 500줄과 1줄 모두 추가 해야한다.
		 * 
		 * 하지만 super 를 사용하면 자식 클래스의 메서드에서 부모클래스의 매서드를 호출하고
		 * 추가코드 1줄만 작성하면 된다.
		 * 
		 */

	}

}

class U {
	void init(){
		// 어쩌구 저쩌구 500줄
	}
}

class I extends U{
	void init(){
		// 어쩌구 저쩌구 500줄
		// 화면 출력 메서드
	}
}
class K extends U{
	void init(){
		super.init(); // 이렇게 함으로 class U void init() 내용을 또 적을 필요가 없어진다.
		// 화면 출력 메서드
	}

}