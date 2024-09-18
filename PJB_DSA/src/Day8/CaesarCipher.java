package Day8;

import java.util.Scanner;

public class CaesarCipher {

    public static String caesarCipher(String s, int k) {
        // Write your code here
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isAlphabetic(c)) {
                if (Character.isLowerCase(c)) {
                    c -= 'a';
                    c += k;
                    c = (char) (c % 26 + 97);
                } else if (Character.isUpperCase(c)) {
                    c -= 'A';
                    c += k;
                    c = (char) (c % 26 + 65);
                }
            }
            res.append(c);
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("The alphabet rotation factor k= ");
        int k = sc.nextInt();
        System.out.println("Caesar Cipher: " + caesarCipher(s, k));

    }
}
