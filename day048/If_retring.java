package pm;

public class If_retring {

	public static void main(String[] args) {
		
		int a = 85;
		
		if( a < 80 && a >=70) {
			System.out.println("C학점");
			}
		else if (a >= 80 && a<90) {
			System.out.println("B학점");
		}
		else if (a >=90) {
			System.out.println("A학점");
		}
		else {
			System.out.println("F학점");
		}
		
		

	}

}
