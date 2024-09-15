package Day3;

import java.util.Scanner;

public class JavaSubstring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean check = true;
        while (true){
            if(check) {
                System.out.println("Your String: ");
                String S = in.next();
                System.out.println("Start index:");
                int start = in.nextInt();
                System.out.println("End index:");
                int end = in.nextInt();

                //System.out.println(S.substring(start, end));
                StringBuilder rs = new StringBuilder();
                for (int i = start; i < end; i++) {
                    rs.append(S.charAt(i));
                }
                System.out.println(rs);
            }
            System.out.println("Continue? (Y/N)");
            String input = in.next();
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
