package Thread_pk;

public class Thread5 {
	//쓰레드 생성 2번째 방법
	public static void main(String[] args) {
		
		Runnable smi = new SMI();
		Thread therad1 = new Thread(smi);
		therad1.start();
		
		
		Runnable vt = new VT();
		Thread therad2 = new Thread(vt);
		therad2.start();
		
		
		
	}

}


class VT implements Runnable {

	@Override
	public void run() {
		int[] vd = { 1, 2, 3, 4, 5 }; // 비디오프레임
		for (int i : vd) {
			System.out.print("비디오프레임" + i);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}
	}

}

class SMI implements Runnable {

	@Override
	public void run() {

		String[] st = { "하나", "둘", "셋", "넷", "다섯" }; // 자막프레임
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		for (String i : st) {
			System.out.println(" - 자막번호 " + i);
			try {Thread.sleep(200);} catch (InterruptedException e) {}
		}

	}


}
