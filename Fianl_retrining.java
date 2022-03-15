package pm7;

public class Fianl_retrining {

	public static void main(String[] args) {
		// final 필드, 메서드, 클래스 앞에 위치한다.
		// 의미는 각각 다르다.
		// final 변수 : 변수를 선언할 때만 지정할 수 있고 한번 대입된 값을 수정할 수 없다.
		// 처음 대입한 값이 최종값이 된다. 변수를 상수로 사용할 때 쓴다.
		 		
		// final 은 일단 값이 입력되면 변경이 불가능하다.
		// 생성자라도 변경이 불가능하다.
		
		/* class A1 { //선언과 동시에 값을 대입
		 * 	int a = 3;
		 * 	final int b = 5;
		 * 	A1(){}
		 *  }
		 * 
		 * class A2 { // 선언과 값 대입을 분리
		 * 		int a;
		 * 		final int b;
		 * 		A2(){
		 * 		a = 3;
		 * 		b = 5; //대입을 하면서 final 이기 때문에 더이상은 수정이 불가능함
		 * 		}
		 * 		}
		 * 
		 * class A3{
		 * 		int a = 3 ;
		 * 		final int b = 5;
		 * 		A3(){
		 * 		a = 7; // a는 변수 // 그냥 변수
		 * 		b = 9; // 불가능 // 한번 값을 대입하면 바꿀 수 없다.
		 * 		}
		 * 		}
		 * 
		 *  class B{
		 *  	void bcd(){
		 *  	int a = 3;
		 *  	final int b = 5;
		 *  	a = 7;
		 *  	b = 9; //불가능
		 *  	}
		 *		}
		 *  
		 *  	final double c = 3.14; //특수한 수치를 고정을 하여 사용하는 경우가 많다.
		 *  	어떤 필요에 따라서 복사본을 하나 만들어 원본이 삭제된 이후에도 사용가능하게 하기 위함도 있다.
		 *  
		 */
			
		A1 a1 = new A1();
		A2 a2 = new A2();
		
		a1.a = 7;
		a2.a = 7;
//		a1.b = 8; // final 이기에 불가능
//		a2.b = 8; // final 이기에 불가능 
		System.out.println(a1.a);
		System.out.println(a2.a);
		System.out.println(a1.b);
		System.out.println(a2.b);
		
		

	}

}

 class A1 { //선언과 동시에 값을 대입
 	int a = 3;
 	final int b = 5;
 	A1(){}
  }
 
 class A2 { // 선언과 값 대입을 분리
 		int a;
 		final int b;
 		A2(){
 		a = 3;
 		b = 5; //대입을 하면서 final 이기 때문에 더이상은 수정이 불가능함
 		}
 		}
 
 class A3{
 		int a = 3 ;
 		final int b = 5;
 		A3(){
 		a = 7; // a는 변수 // 그냥 변수
// 		b = 9; // 불가능 // 한번 값을 대입하면 바꿀 수 없다.
 		}
 		}
 
  class B{
  	void bcd(){
  	int a = 3;
  	final int b = 5;
  	a = 7;
//  	b = 9; //불가능
  	}
  }