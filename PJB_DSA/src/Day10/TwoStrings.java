package Day10;

import java.util.Scanner;

public class TwoStrings {
    public static String twoStrings(String s1, String s2) {
        // Write your code here
        for(int i=0;i<26;i++) {
            if(s1.indexOf(i+'a') != -1 && s2.indexOf(i+'a') != -1) return "YES";
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String s = sc.nextLine();
        String s1 = sc.nextLine();
        System.out.println(twoStrings(s, s1));

    }
}
