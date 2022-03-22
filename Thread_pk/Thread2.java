package Thread_pk;


public class Thread2 extends Thread {

//		첫 번째 방법
//		쓰레드 클래스를 상속 받아서 run() 메서드를 오버라이딩
//		1. 클래스를 정의
//		2. 객체를 생성
//		3. 쓰레드를 실행

//		public class Thread2 extends Thread{}
//		이미 정의 되있기에 상속을 받아 처리하면 된다.


	
	@Override
	public void run() {
		
		String[] st = {"하나","둘","셋","넷","다섯"}; // 자막프레임
		try {Thread.sleep(10);}catch (InterruptedException e) {}
		for (String i : st) {
			System.out.println(" - 자막번호 " + i);
			try {Thread.sleep(200);}catch (InterruptedException e) {}
		}
		


	}


	
	public static void main(String[] args) {
//		Thread1의 잘못된 방식을 분리해서 실행 하는 것임
		//객체 생성 및 자막 시작
		Thread smaiFileThread = new Thread2();
		
		smaiFileThread.start();
		
		
		int[] vd = {1,2,3,4,5}; // 비디오프레임
		for (int i : vd) {
			System.out.print("비디오프레임"+i);
			try {Thread.sleep(200);}catch (InterruptedException e) {}
		}
		
		
//		시간을 지정함으로 영상 프레임당 자막 프레임이 나올수 있도록 하는 것이다. 이유는 두개가 동시에 돌아가고있기 때문이다.
		
//		이전에 단일 쓰레드로 실행했던 비디오 프레임과 자막을 출력하는 프로그램을 멀티 쓰레드로 변경하였다.
//		출력하고자 하는 작업은 비디오프레임의 번호와 자막을 동시 출력하는 것이다.
//		프로그램이 처음 실행될때 이미  main 쓰레드가 실행되고 있으므로 이 2개의 작업을 동시에 실행하기 위해서는
//		적어도 하나 이상의 쓰레드를 추가로 생성하여 실행해야 한다.
		
//		객체를 생성하여 start() 매서드로 실행하였다.
//		main 쓰레드와 smaiFileThread 를 사용하여 각각 비디오 번호와 자막번호를 출력했다.
//		참고로 멀티 쓰레드는 독립적으로 실행되기 떄문에 먼저 start() 매서드로 호출이 되었다 하더라도
//		나중에 실행된 쓰레드 보다 늦게 실행될 수 있다.
		
//		이러한 이유로 자막 번호가 항상 비디오 번호 뒤에 나오도록 쓰레드에 Thread.sleep(10) 을 추가해서
//		0.01초 늦게 출력 되도록 했다.
		
//		try catch 를 넣은 이유는 초를 세다가 이상이 생길 때를 대비해서 넣은 것이다. 이전에 관용적으로 넣는 요소들 중 하나이다.
		
	}
}


