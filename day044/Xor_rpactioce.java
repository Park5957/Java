package day044;

public class Xor_rpactioce {

	public static void main(String[] args) {
		
		
		int a=15;//1111
		int b=5;//0101
		int c=-6;
		
		System.out.println(a&b); //0101
		System.out.println(a|b); //1111
		System.out.println(a^b); //1010
		System.out.println(~b); //1010 = 10아니라 -6이 나옴
		// 64비트 기준 0000 0000 ...... 1010
		//        이 1111 1111 ...... 0101 로 바뀌기 때문
		//부호의 변경 이유 컴퓨터는 음수를 정장하지 못함
		//부호를 표현하는 비트는 최상위 비트
		//ex) 1 0000 0000 0000 ..... 1010
		//맨 앞 비트 1이 0이 되면 (-) 값을 가짐
		System.out.println(~c);
		//  6   0110
		// -6   1010 (4비트 표현에 벗어난 값) = ~5
		//  0   0000
		
		
		// 15>>2 == 3
		// 5<<4 == 1010 0000 : 80
		// 비트 쉬프트 연산다
		System.out.println(a>>2);
		System.out.println(b<<4);
		
		// 오른쪽 한칸 이동때마낟 /2
		// 왼쪽 한칸 이동할 때마다 *2 
		
		

	}
}
