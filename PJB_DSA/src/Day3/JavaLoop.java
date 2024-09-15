package Day3;

import java.util.Scanner;

public class JavaLoop {

    public static void printArray(int a, int b, int n) {
        int s = (int) (a + Math.pow(2, 0) * b);
        for (int i = 1; i <= n; i++) {
            System.out.print(s + " ");
            s += (int) (Math.pow(2, i) * b);
        }
        System.out.println();
    }

    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        boolean check = true;
        while (true){
            if(check) {
                System.out.println("Form: a + 2^0 * b, a +...+ 2^0 * b + 2^(n-1) * b");
                System.out.println("Number of Test Case: ");
                int t = in.nextInt();
                int a = 0;
                int b = 0;
                int n = 0;
                int[][] arr = new int[t][3];
                for (int i = 0; i < t; i++) {
                    System.out.println("Test case "+ (i+1)+": ");
                    System.out.println("a: ");
                    a = in.nextInt();
                    System.out.println("b: ");
                    b = in.nextInt();
                    System.out.println("n: ");
                    n = in.nextInt();
                    arr[i][0] = a;
                    arr[i][1] = b;
                    arr[i][2] = n;
                }
                for(int i = 0; i < t; i++){
                    printArray(arr[i][0], arr[i][1], arr[i][2]);
                }
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
