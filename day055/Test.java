package day055;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String fruits[] = new String[3];
		for (int i=0; i<3; i++) {
			System.out.print("�ֹ��� ����:");
			fruits[i]=sc.next();
		}
		System.out.println("---�ֹ����� ����---");
		for (String eachFruits : fruits) {
			System.out.print(eachFruits+" ");
		}

	}

}
