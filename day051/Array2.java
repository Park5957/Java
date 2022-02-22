package day051;

public class Array2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []student = {100,95,90,88,93};
		int sum = 0;
		for (int i=0; i<student.length; i++) { 
			sum+=student[i];
			
		}
		System.out.println("시험점수평균:"+sum/(float)student.length);

}
}