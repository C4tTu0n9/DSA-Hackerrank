package Day1;

import java.util.Scanner;

public class PracticeFive {

    public static boolean isFullOfColors(String sequence) {
        int rCount = 0, gCount = 0, yCount = 0, bCount = 0;

        for (char c : sequence.toCharArray()) {
            switch (c) {
                case 'R':
                    rCount++;
                    break;
                case 'G':
                    gCount++;
                    break;
                case 'Y':
                    yCount++;
                    break;
                case 'B':
                    bCount++;
                    break;
            }

            if (Math.abs(rCount - gCount) > 1 || Math.abs(yCount - bCount) > 1) {
                return false;
            }
        }

        return rCount == gCount && yCount == bCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            String sequence = scanner.nextLine();
            System.out.println(isFullOfColors(sequence));
        }

        scanner.close();
    }
}
