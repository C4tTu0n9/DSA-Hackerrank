package Day4;

import java.util.Scanner;

public class Anagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() != b.length()) return false;
        if(a.equalsIgnoreCase(b)) return true;
        a=a.toLowerCase();
        b=b.toLowerCase();
        int[] count = new int[26];
        for(char c : a.toCharArray()){
            char d = c;
            int e = c - 'a';
            count[c - 'a']++;
        }
        for(char c : b.toCharArray()) {
            char d = c;
            int e = c - 'a';
            count[c - 'a']--;
        }
        for(int i : count) if(i != 0) return false;
        return true;

        //////////////////////////////////
//        int[] count = new int[91];
//        a = a.toUpperCase();
//        b = b.toUpperCase();
//        for(char c : a.toCharArray()){
//            count[c]++;
//        }
//        for(char c : b.toCharArray()){
//            count[c]--;
//        }
//        for(int i = 'A'; i <= 'Z'; i++){
//            if(count[i] != 0) return false;
//        }
//        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
