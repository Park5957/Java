package pm;

public class Switch_plus {

	public static void main(String[] args) {
		//switch의 분량을 줄이는 방법
		int a = 8;
		switch(a) {
		case 10 : case 9 :case 8 :case 7 :
			System.out.println("pass");
			break;		
		default :
			System.out.println("fail");	
	}
		
		//if 문으로 바꾸기
		int b = 8;		
		if( b <= 10 && b >=7) {
			System.out.println("pass");
			}
		else {
			System.out.println("fail");	
		}
		
		

}
}