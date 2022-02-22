package day055;

public class For_each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for(자료형 변수명 : 배열명){변수가 배열을 순환하면서 반복할 명령;}
		
		String a[]= {"Java","Hello","Programming"};
		for(String i:a) {
			System.out.printf(i+",");
			
		}
		System.out.println();
		
		int b[] = {1,2,3,4,5};
		for(int i:b) {
			System.out.print(i);
		}
		
		

	}

}
