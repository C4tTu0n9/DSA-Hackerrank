package Day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

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
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void stairCase2(int n) {
        int[][] arr = new int[n][n];
        int j = n - 1;
        for (int i = 0; i < n; ) {
            arr[i][j--] = 1;
            if (j < n - i) i++;
        }
        j = 0;
        boolean check = false;
        for (int i = 0; i < n; i++) {
            check = false;
            for (int z = 0; z < n; z++) {
                if (arr[i][z] == 1) {
                    check = true;
                    System.out.print("#");
                } else {
                    if (check) {
                        System.out.print("#");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    public static void stairCase3(int n) {
        char[][] arr = new char[n][n];
        int j = 0;
        for (int i = 0; i < n;) {
            arr[i][j] = ' ';
            arr[n-i-1][n-j-1] = '#';
            j++;
            if(j == n - 2){
                j = 0;
                i++;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Number of rows: ");
            int n = Integer.parseInt(bufferedReader.readLine().trim());
            System.out.println("Result: ");
            stairCase3(n);
            while (true) {
                System.out.println("Continue? (Y/N)");
                String input = scan.nextLine().trim().toLowerCase();
                if (input.equals("y")) {
                    break;
                } else if (input.equals("n")) {
                    return;
                } else {
                    System.out.println("Please enter Y or N");
                }
            }
        }


    }

}
