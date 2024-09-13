package Day2;

public class Handshake {

    public static int handshake(int n) {
        // Write your code here
        //return factorial(n) / (factorial(2) * factorial(n-2));
        return n*(n-1)/2;
    }

    public static int factorial(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(handshake(4));
        System.out.println(handshake(5277));
        System.out.println(factorial((int) Math.pow(10,5)));
    }
}
