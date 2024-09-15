package Day2;

import java.util.Scanner;

public class SpecialMultiple {

    public static String solve(int n) {
        // Write your code here
        try {
            int c = 1;
            while (true) {
                String str = Integer.toBinaryString(c);
                StringBuilder b = new StringBuilder();
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == '1') {
                        b.append("9");
                    } else
                        b.append("0");
                }
                long res = Long.parseLong(b.toString());
                if (res % n == 0) {
                    return b.toString();
                } else c++;
            }
        }catch (RuntimeException e){
            System.out.println("Can not solve!");
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while (true){
            if(check) {
                System.out.println("Number: ");
                int n = sc.nextInt();
                System.out.println("Result: ");
                System.out.println(solve(n));
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
