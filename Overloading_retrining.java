package pm4;

public class Overloading_retrining {

	public static void main(String[] args) {
		/* Method Overloading
		 * 하나의 메서드 명으로 인수의 개수와 형에 따라 동작을 다르게 한다.
		 */
		
//		printa();
//		printb(3);
		
		print();
		print(3);
	 
	}
//	
//	public static void printa() {
//		System.out.println("데이터가 없습니다.");
//	}
//	public static void printb(int a) {
//		System.out.println(a);
//	}
	
//	같은 이름으로 두 가지를 만듦으로 해당하는 형테 따라 결과가 나올 수 있도록 할 수 있다.
	public static void print() {
		System.out.println("데이터가 없습니다.");
		}
	public static void print(int a) {
		System.out.println(a);
		}
	}

