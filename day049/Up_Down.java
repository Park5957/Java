package day049;

import java.util.Random;
import java.util.Scanner;

public class Up_Down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Random random =new Random();
		
		int num = random .nextInt(100)+1;
		int user =-1;
		while (user!=num) { //!=�� ���� ����
			
			System.out.println("�����Է�");
			user=sc.nextInt();
			
			if (user==num) {
				System.out.println("ok you good");
						}
				
				
				else if (user>num) {
					System.out.println("Down");
				}
				else if (user<num) {
					System.out.println("UP");
				}
			}
	
	}
	}
	
		

	
