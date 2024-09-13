package Day3;

import java.util.Scanner;

public class JavaIfElse {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//        if(N % 2 != 0 || (N % 2 == 0 && N >= 6 && N <= 20)) {
//            System.out.println("Weird");
//        }
//        else{
//            System.out.println("Not Weird");
//        }
        switch (N % 2) {
            case 0:
                switch (N / 21) {
                    case 0:
                        switch (N / 6) {
                            case 0:
                                System.out.println("Not Weird");
                                break;
                            default:
                                System.out.println("Weird");
                        }
                        break;
                    default:
                        System.out.println("Not Weird");
                }
                break;
            default:
                System.out.println("Weird");
        }

        scanner.close();
    }
}
