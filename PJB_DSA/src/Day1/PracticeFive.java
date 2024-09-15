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
        boolean check = true;

        while (true) {
            if(check) {
                System.out.println("Number of test case: ");
                int t = scanner.nextInt();
                scanner.nextLine();

                for (int i = 0; i < t; i++) {
                    System.out.println("Test case " + (i + 1) + ": ");
                    String sequence = scanner.nextLine();
                    System.out.println(isFullOfColors(sequence));
                }
            }

            System.out.println("Continue? (Y/N)");
            String input = scanner.next();
            if(input.equalsIgnoreCase("y")){
                check = true;
                continue;
            }
            else if(input.equalsIgnoreCase("n")){
                check = false;
                break;
            }
            else{
                System.out.println("Wrong input");
                check = false;
            }
        }

    }
}
