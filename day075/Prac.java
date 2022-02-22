package day075;

import java.io.FileInputStream;
import java.util.Scanner;

public class Prac {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("src//day075//sample.txt"); 
			Scanner s = new Scanner(fis);
			while(s.hasNext()) { //file 에서 한줄씩 입력 받겠다.
				System.out.println(s.nextLine());
			}
		}catch(Exception e) {
			e.printStackTrace();
		} // 의와 같은 과정을 통해 txt 파일에 저장된 문항을 풀력 할 수 있는 것을 확인 할 수 있다.

	}

}
