package day071;

public class StringBufferEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "test";
		StringBuffer buffer = new StringBuffer("test");
		
		str.replace('t', 'T');
		System.out.println(str); // 리플레이스를 사용했지만 변경이 이루어 지지 않음. 스트링 버퍼로 인해 변경 불가
		
	buffer.replace(1,3,"EX"); // 스트링 버퍼를 사용하면 스트링 버퍼의 값 자페를 바꿀 수 있다.
	System.out.println(buffer);

	}

}
