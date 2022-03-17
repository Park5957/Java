package pm10;

public class Throw_retrining2_4 extends RuntimeException {

	public void sayNick(String nick) throws Throw_retrining2_4 {

		if ("fool".equals(nick)) {
			throw new Throw_retrining2_4(); // 이것으로 인해 fool을 에러로 바꿔버렸다.
		}
		System.out.println("당신의 별명은 " + nick + "입니다.");

	}

	public static void main(String[] args) {

		Throw_retrining2_4 smp = new Throw_retrining2_4();
		try {
			smp.sayNick("fool");
			smp.sayNick("genious");
		} catch (Throw_retrining2_4 e) {
			System.out.println("Throw_retrining2_4 가 발생했습니다.");
			// fool 이 에러이기에 catch가 실행된다.
			// 이로인해 genious 는 실행이 안된다.
		}

	}

}

//상품발송() {
//    try {
//        포장();
//        영수증발행();
//        발송();
//    }catch(예외) {
//        모두취소();  // 하나라도 실패하면 모두 취소한다.
//    }
//}
//
//포장() throws 예외 {
//   ...
//}
//
//영수증발행() throws 예외 {
//   ...
//}
//
//발송() throws 예외 {
//   ...
//}
// 하나만 실패해도 취소를 원하는 경우이다.


// 각각 개별적인 처리는 아래와 같다.


//상품발송() {
//    포장();
//    영수증발행();
//    발송();
//}
//
//포장(){
//    try {
//       ...
//    }catch(예외) {
//       포장취소();
//    }
//}
//
//영수증발행() {
//    try {
//       ...
//    }catch(예외) {
//       영수증발행취소();
//    }
//}
//
//발송() {
//    try {
//       ...
//    }catch(예외) {
//       발송취소();
//    }
//}

// 하지만 이렇게 각각의 메소드에 예외가 처리되어 있다면 포장은 되었는데 발송은 안되고 포장도 안되었는데 발송이 되고 이런 뒤죽 박죽의 상황이 연출될 것이다.
// 제 프로젝트에서도 두번째 경우처럼 트랜잭션관리를 잘못하여 고생하는 경우를 많이 보았는데 이것은 일종의 재앙에 가깝다.
// 물론 이건 쇼핑몰 이라는 경우에 이렇다는 거지 상황에 따라 방식과 용도가 다르다.