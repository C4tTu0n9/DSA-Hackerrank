package Day2;

public class SummingTheNSeries {
    private static final long MOD = (long) (Math.pow(10,9) + 7);

    public static long summingSeries(long n) {
        // Tính n^2
        long result = n % MOD;
        result = (result * result) % MOD;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(summingSeries((long) Math.pow(10,15)));
    }
}
