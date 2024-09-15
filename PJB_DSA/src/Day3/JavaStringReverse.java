package Day3;

import java.util.Scanner;

public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while (true){
            if(check) {
                System.out.println("Your String: ");
                String A = sc.next();
                /* Enter your code here. Print output to STDOUT. */
                int begin = 0;
                int end = A.length() - 1;
                boolean check2 = true;
                while (begin <= end) {
                    if (A.charAt(begin) != A.charAt(end)) {
                        check2 = false;
                    }
                    begin++;
                    end--;
                }
                System.out.println(check2?"Yes":"No");
            }
            System.out.println("Continue? (Y/N)");
            String input = sc.next();
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
