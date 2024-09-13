package Day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StairCase {
    public static void staircase(int n) {
        // Write your code here
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= n - i - 1; j--) {
                arr[i][j] = 1;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        staircase(n);

        bufferedReader.close();
    }

}
