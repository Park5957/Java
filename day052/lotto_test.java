package day052;

import java.util.Random;

public class lotto_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("lotto num");
		
		int N=1;
		
		Random random = new Random();
		
		int a = random.nextInt(45)+1;
		int b = random.nextInt(45)+1;
		int c = random.nextInt(45)+1;
		int d = random.nextInt(45)+1;
		int e = random.nextInt(45)+1;
		
		
		if(a<=45) {
			System.out.println(N+"번:"+a);
			N++;
		}
		
		if(b!=a) {
			System.out.println(N+"번:"+b);
			N++;
			
		}
		
		if (c!=a && c!=b) {
		        
			 System.out.println(N+"번:"+c);
			 N++;
		}
		if (d!=a && d!=b && d!=c) {
	        
			 System.out.println(N+"번:"+d);
			 N++;				
		}
		if (e!=a && e!=b && e!=c && e!=d) {
	        
			 System.out.println(N+"번:"+e);
			 N++;				
		}
		
		System.out.println("로또 번호는("+a+","+b+","+c+","+d+","+e+")입니다");
		}	

			
}

		    
		

	
