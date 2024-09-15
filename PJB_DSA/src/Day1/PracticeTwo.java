package Day1;

import java.util.Scanner;

public class PracticeTwo {
    public static String a(String str) {
        String result = "";
        boolean check = true;
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                result += str.charAt(i);
                continue;
            }
            if (!result.contains(str.charAt(i) + "")) {
                result += str.charAt(i);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while (true) {
            if (check) {
                System.out.println("Your String:");
                String str = sc.nextLine();
                System.out.print("Result: ");
                System.out.println(a(str));
            }
            System.out.println("Continue? (Y/N)");
            String decide = sc.nextLine().trim();

            if (decide.equalsIgnoreCase("y")) {
                check = true;
                continue;
            } else if (decide.equalsIgnoreCase("n")) {
                break;
            } else {
                check = false;
                System.out.println("Please enter Y or N!");
            }
        }
    }
}
