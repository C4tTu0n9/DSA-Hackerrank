package Day7;
import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.function.*;
        import java.util.regex.*;
        import java.util.stream.*;
        import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int count = 0;
        int max = 0;
        for (int i = 0; i < candles.size(); i++) {
            if(candles.get(i) > max) {
                max = candles.get(i);
                count = 1;
            }
            else if(candles.get(i) == max) {
                count++;
            }
            else {
                continue;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> candles = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            candles.add(sc.nextInt());
        }
        System.out.println(birthdayCakeCandles(candles));
    }
}