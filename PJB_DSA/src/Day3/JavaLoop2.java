package Day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaLoop2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

//        for(int i = 1; i <= 10; i++) {
//            System.out.println(N+" x "+i+" = "+N*i);
//        }
        System.out.println(N+" x "+1+" = "+N*1);
        System.out.println(N+" x "+2+" = "+N*2);
        System.out.println(N+" x "+3+" = "+N*3);
        System.out.println(N+" x "+4+" = "+N*4);
        System.out.println(N+" x "+5+" = "+N*5);
        System.out.println(N+" x "+6+" = "+N*6);
        System.out.println(N+" x "+7+" = "+N*7);
        System.out.println(N+" x "+8+" = "+N*8);
        System.out.println(N+" x "+9+" = "+N*9);
        System.out.println(N+" x "+10+" = "+N*10);

        bufferedReader.close();
    }
}
