package am2;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		// Example. 주어진 리스트 의 각 수를 더하여 target에 해당하는 값에 해당하는 인덱스 번호의 리스트 출력
		// 예 a = {1,2,3}  target = 5 output = {1,2}
		
		
//		Example 1
		A a = new A(); // 객체 생성
		a.Example1();  // 객체 호출
	
//		Example 2
		B b = new B();
		b.Example2();
		
//		Example 3
		C c = new C();
		c.Example3();
		
	}

}


class A {						 // Example1 검사용 클래스
	int [] nums = {2,7,11,15};   // 주어진 리스트
	void Example1(){			 // 리턴값이 없는 메서드
		int target = 9;			 // 발견해야 할 값 
		int [] output = new int[2]; // 발견값의 인덱스 번호를 보관랑 리스트
		for (int i = 0; i < nums.length; i++) { // i를 순서대로 nums의 인덱스 번호만큼 반복
			if (nums[i] + nums[i+1] == target) { // i의 번호로 nums의 인덱스 번호에 해당값 확인 합계가 target의 수치와 같은지 비교 맞다면 해당
				output[0] = i;					// 덧셈의 첫번째 번호를 output에 입력
				output[1] = i+1;				// 덧샘의 두번째 번호 output에 입력
				break;							// 발견값을 찾았음으로 반복 중지
			}
		}
		System.out.println("output : "+ Arrays.toString(output)); // 발견값에 대한 인덱스 번호를 가진 리스트 출력
	}
}

class B {
	int [] nums = {3,2,4};
	void Example2(){
		int target = 6;
		int [] output = new int[2];
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] + nums[i+1] == target) {
				output[0] = i;
				output[1] = i+1;
				break;
			}
		}
		System.out.println("output : "+ Arrays.toString(output));
	}
}

class C {
	int [] nums = {3,3};
	void Example3(){
		int target = 6;
		int [] output = new int[2];
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] + nums[i+1] == target) {
				output[0] = i;
				output[1] = i+1;
				break;
			}
		}
		System.out.println("output : "+ Arrays.toString(output));
	}
}
