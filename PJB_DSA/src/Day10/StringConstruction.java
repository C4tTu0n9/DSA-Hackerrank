package Day10;

import java.util.Scanner;

public class StringConstruction {
    public static int stringConstruction(String s) {
        // Write your code here
        if (s.isEmpty()) return 0;
        if (s.length() == 1) return 1;
        int count = 0;
        int[] chars = new int[26];
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < 26; i++) {
            if (chars[i] != 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(stringConstruction(s));
    }
}
