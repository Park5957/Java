package day062;

import java.util.Scanner;

public class UserArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		User UserArray[] = new User[4];
		
		for(int i=0; i<4; i++) {
			UserArray[i] = new User();
			
		}
		for(int i=0; i<4; i++) {
			System.out.print("�̸� : ");
			UserArray[i].name = sc.next();
			System.out.print("��ȭ��ȣ : ");
			UserArray[i].phone = sc.next();
			System.out.print("���� : ");
			UserArray[i].age = sc.nextInt();
			System.out.print("���� : ");
			UserArray[i].gender = sc.next();			
		}
//		
//		
//		
//		UserArray[0].name = "���浿" ;
//		UserArray[0].phone = 010-1234-1234 ;
//		UserArray[0].age = 20 ;
//		UserArray[0].gender = "����";
//
//		UserArray[1].name = "���浿" ;
//		UserArray[1].phone = 010-3333-4444 ;
//		UserArray[1].age = 20 ;
//		UserArray[1].gender = "����";
//		
//		UserArray[2].name = "�ٱ浿" ;
//		UserArray[2].phone = 010-1111-2222 ;
//		UserArray[2].age = 20 ;
//		UserArray[2].gender = "����";
//		
//		UserArray[3].name = "��浿";
//		UserArray[3].phone = 010-4321-4321 ;
//		UserArray[3].age = 20 ;
//		UserArray[3].gender = "����";
		
		for(int j=0; j<4; j++) {
			System.out.println("-----------");
			UserArray[j].info();
		}
		
	}

}

class User {
	String name;
	String phone;
	int age;
	String gender;
	
	void info() {
		System.out.println("Name : "+name);
		System.out.println("Phone : "+phone);
		System.out.println("Age : "+age);
		System.out.println("Gender : "+gender);
	}
	
	
}