package Day2;

import java.util.Scanner;

public class StrangeGrid {

    public static long strangeGrid(int r, int c) {
        // Write your code here
        return 2* (5* (((long)r-1) / 2) ) + 2*((long)c-1) + ((r+1)%2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while (true){
            if(check) {
                System.out.println("Number of Rows:");
                int r = sc.nextInt();
                System.out.println("Number of Columns:");
                int c = sc.nextInt();
                System.out.println("Result: ");
                System.out.println(strangeGrid(r, c));
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
                System.out.println("Please enter Y or N");
                check = false;
            }
        }

    }
}
