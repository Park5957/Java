package pm;

import java.util.ArrayList;
import java.util.Random;

public class LottoPU {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		System.out.println("lotto!!!");

		ArrayList<Integer> lo = new ArrayList<>();
		int a;
		Random random = new Random();
		for (int i = 0; i < 6; i++) {

			a = random.nextInt(45) + 1;
			lo.add(a);
			if (lo.size() > 0) {
				for (int j = 0; j <= i; j++) {
					if (lo.get(j) == lo.get(i)) {
						while(lo.get(j) != lo.get(i)) {
							lo.add(i, random.nextInt(45)+1);
						}
						}
				}
			}

		}
		for(int i : lo) {
			System.out.print(i+",");
		}

	}
}