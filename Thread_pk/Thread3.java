package Thread_pk;

public class Thread3 extends Thread {

	public static void main(String[] args) {
		Thread smaiFileThread = new VideoThread();
		smaiFileThread.start();

		Thread smaiaudioThread = new audioThread();
		smaiaudioThread.start();

		// 다만 추천하는 방식은 Thread2 의 첫번째 방식으로 파생하여 사용하는 게 좋다.
	}

}

class VideoThread extends Thread {

	@Override
	public void run() {
		int[] vd = { 1, 2, 3, 4, 5 }; // 비디오프레임
		for (int i : vd) {
			System.out.print("비디오프레임" + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}
	}

}

class audioThread extends Thread {

	@Override
	public void run() {

		String[] st = { "하나", "둘", "셋", "넷", "다섯" }; // 자막프레임
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
		}
		for (String i : st) {
			System.out.println(" - 자막번호 " + i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
			}
		}

	}

}
