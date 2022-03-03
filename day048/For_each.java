package pm;

public class For_each {

	public static void main(String[] args) {
//		String k = "*";	
//		for (int i = 0; i<5; i++) {
//			for (int j = i; j<5; j++) {
//				System.out.print(k);
//			}
//			System.out.println(" ");
//
			
//		for (int i = 1; i<=5; i++) {
//			for (int j =1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println(" ");
//		}

//		for (int i = 1; i<=5; i++) {
//			for (int j=5; j>0; j--) {
//				
//				if(j>i) {
//					System.out.print(" ");
//				}
//				else {
//					System.out.print("*");
//					
//					
//					
//				}
//			}
//			System.out.println(" ");
		// 최대값, 최소값, 평균값, 총합 구하기
		int [] num = {70,60,55,75,95,90,80,80,85,100};
		int sum = 0;
		int max = 0;
		int min = 70;
		int i = 1;
		for (int num2  : num) {
			sum += num2;
			
			if (num2 >= max) {
				max = num2;				
			}
			else if (num2 < min) {
				min = num2;
			}
			i++;
			
			
		} 
		System.out.println("전체합계 : "+sum);
		System.out.println("전체평균 : "+(sum/num.length));
		System.out.println(max);
		System.out.println(min);
		
	}
}

