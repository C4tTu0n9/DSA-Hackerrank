package Day8;

import java.util.Scanner;

public class Pangrams {

    public static String pangrams(String s) {
        // Write your code here
        char[] chars = new char[26];
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLowerCase(s.charAt(i))){
                chars[s.charAt(i) - 'a']++;
            }
            else if (Character.isUpperCase(s.charAt(i))){
                chars[s.charAt(i) - 'A']++;
            }
            else if(s.charAt(i) == ' '){
                continue;
            }
            else{
                return "not pangram";
            }
        }
        for (int i = 0; i < 26; i++) {
            if(chars[i] == 0){
                return "not pangram";
            }
        }
            return "pangrams";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(pangrams(s));
    }
}
