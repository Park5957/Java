package pm10;

public class Game369 {
    public static void main(String[] args) {
        String a;        
        int count = 0;
        for (int i = 1; i < 100; i++) {
            a = Integer.toString(i);
            if (i > 9) {
                int i2 = i / 10;
                int i3 = i % 10;

                if (i2 == 3 || i2 == 6 || i2 == 9) {
                    if (i3 == 3 || i3 == 6 || i3 == 9) {
                        a = "짝짝";
                    } else {
                        a = "짝";

                    }

                } else if (i3 == 3 || i3 == 6 || i3 == 9) {
                    a = "짝";
                }
            } else if (i < 10 && i % 3 == 0) {
                a = "짝";
            }

            System.out.print(a + "\t");
            count++;

            if (count % 10 == 0) {
                System.out.print("\n");
            }

        }

    }
}

