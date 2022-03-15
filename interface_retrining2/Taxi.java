package interface_retrining2;

import java.util.Scanner;

public class Taxi implements Meter {
	Scanner sc = new Scanner(System.in);
	@Override
	public void start() {
		
		System.out.println("운행을 시작합니다");
		afterMidnight();
		System.out.print("이동거리를 입력해 주시기 바랍니다. : ");
		int distance = sc.nextInt();
		System.out.println(distance + "거리가 입력되었습니다.");
		stop(distance);
	}

	@Override
	public int stop(int distance) {
        int fare = BASE_FARE + (distance*2);
        System.out.println("운행을 종료합니다. 요금은 " + fare + "원입니다.");
        return fare;
		
	}

}
