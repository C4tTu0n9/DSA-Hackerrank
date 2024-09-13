package Day3;

import java.util.Scanner;
import java.util.Stack;

public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int begin = 0;
        int end = A.length() - 1;
        boolean check = true;
        while (begin <= end) {
            if (A.charAt(begin) != A.charAt(end)) {
                check = false;
            }
            begin++;
            end--;
        }
        System.out.println(check?"Yes":"No");
    }
}
