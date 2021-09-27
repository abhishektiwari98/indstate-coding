package indstate;

import java.util.Scanner;

public class ThirtyLoops {
    public static void main(String[] args) {
        // Create a scanner that automatically closes when the try block ends
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        }
    }
}
