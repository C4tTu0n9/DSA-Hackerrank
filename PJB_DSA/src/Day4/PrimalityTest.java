package Day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class PrimalityTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        BigInteger nPrim = new BigInteger(n);
        //certainly cang cao thi do chinh xac cang lon, runtime cang lau
        boolean check = nPrim.isProbablePrime(10);
        System.out.println(check);


        bufferedReader.close();
    }
}
