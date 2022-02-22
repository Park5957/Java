package day074;

import java.util.Timer;
import java.util.TimerTask;

public class Timer_TimerTask {

	public static void main(String[] args) throws InterruptedException{
											// 중간 입텁세트에 따른 예외지정
		//타임테스크를 상속받은 새로운 클래스 선언
		//class Work1 extends TimerTask{}
		
		// run 이라는 추상 메서드에서 하고 싶은 작업 오버라이딩
		// public void run() {}
		
		// 예시 
		// Timer t = new Timer (true); 프로그램 종료시, 객체 자동 소멸
		// TimerTask w1 = new Work1();
		// t.schedule(w1.5000);
		// 1000 == 1초
		
		 Timer t = new Timer (true);
		 TimerTask w1 = new Work1();
		 TimerTask w2 = new Work2();
		 
		 t.schedule(w1, 3000);
		 t.schedule(w2, 1000);
		 
		 Thread.sleep(4000);
		 System.out.println("모든 작업종료");
		 }
}
class Work1 extends TimerTask{
	public void run() {
		System.out.println("Work1 실행");	
	}
}
class Work2 extends TimerTask{
	public void run() {
		System.out.println("Work2 실행");	
	}
}