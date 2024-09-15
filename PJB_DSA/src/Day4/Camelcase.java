package Day4;

import java.util.Scanner;

public class Camelcase {
    public static int camelcase(String s) {
        // Write your code here
        if(s.isEmpty()) return 0;
        int begin = 1;
        int end = s.length() - 1;
        int count = 1;
        while (begin <= end) {
            if(begin == end){
                if(isUpperCase(s.charAt(begin))){
                    count++;
                    break;
                }
            }
            if(isUpperCase(s.charAt(begin++))){
                count++;
            }
            if(isUpperCase(s.charAt(end--))){
                count++;
            }
        }
        return count;
    }

    public static boolean isUpperCase(char s) {
        return (s >= 'A' && s <= 'Z');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Your String:");
            String str = sc.nextLine().trim();
            System.out.println("Result: " + camelcase(str));

            while (true) {
                System.out.println("Continue? (Y/N)");
                String input = sc.nextLine().trim().toLowerCase();
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
