package pm5;

import java.util.Scanner;

public class test_trining8 {

	public static void main(String[] args) {
		C c =new C();
		
		c.averageScore(1);
		c.averageScore(1,2);
		c.averageScore(1,2,3);
		c.averageScore(1,2,3,4);

		
	}

}

class C{
	
	void averageScore(int...m){
		double sum = 0.0;
		for (int each :m) {
			sum += each; 
			}
		double avg = sum / m.length;
	System.out.println("평균은 :" + avg);
}
}
