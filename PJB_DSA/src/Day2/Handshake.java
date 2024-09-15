package Day2;

import java.util.Scanner;

public class Handshake {

    public static int handshake(int n) {
        // Write your code here
        //return factorial(n) / (factorial(2) * factorial(n-2));
        return n*(n-1)/2;
    }

//    public static int factorial(int n) {
//        int res = 1;
//        for (int i = 2; i <= n; i++) {
//            res *= i;
//        }
//        return res;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while (true){
            if(check) {
                System.out.println("Number of people:");
                int n = sc.nextInt();
                System.out.println("Result: ");
                System.out.println(handshake(n));
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
