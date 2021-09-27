package indstate;

import java.util.Scanner;

public class ThirtyWorldProblem {
    public static void main(String[] args) {
        // Create a scanner that automatically closes when the try block ends
        try (Scanner sc = new Scanner(System.in)) {
            final String inputString = sc.nextLine();

            System.out.printf("Hello, World.");
            System.out.println(inputString);
        }
    }
}
