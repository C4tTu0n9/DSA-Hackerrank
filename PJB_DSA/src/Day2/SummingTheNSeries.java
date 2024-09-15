package Day2;

import java.util.Scanner;

public class SummingTheNSeries {
    private static final long MOD = (long) (Math.pow(10,9) + 7);

    public static long summingSeries(long n) {
        long result = n % MOD;
        result = (result * result) % MOD;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while (true){
            if(check) {
                System.out.println("Number: ");
                long n = sc.nextLong();
                System.out.println("Result: ");
                System.out.println(summingSeries(n));
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
