package Day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class PrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Number: ");
            String n = bufferedReader.readLine();
            System.out.println("Result: ");
            BigInteger nPrim = new BigInteger(n);
            //certainly cang cao thi do chinh xac cang lon, runtime cang lau
            boolean check = nPrim.isProbablePrime(10);
            System.out.println(check);

            while (true) {
                System.out.println("Continue? (Y/N)");
                String input = sc.nextLine().trim().toLowerCase();
                if (input.equals("y")) {
                    break;
                } else if (input.equals("n")) {
                    return;
                } else {
                    System.out.println("Please enter Y or N");
                }
            }
        }

    }
}
