package indstate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ThirtyArrays {
    public static void main(String[] args) throws IOException {
        // Create a scanner that automatically closes when the try block ends
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(br.readLine().trim());

            List<Integer> arr = Stream.of(br.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());

            if (arr != null && !arr.isEmpty()) {
                for (int i = arr.size() - 1; i >= 0; i--) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
