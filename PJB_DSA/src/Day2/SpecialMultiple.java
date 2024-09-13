package Day2;

public class SpecialMultiple {

    public static String solve(int n) {
        // Write your code here
        try {
            int c = 1;
            while (true) {
                String str = Integer.toBinaryString(c);
                StringBuilder b = new StringBuilder();
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == '1') {
                        b.append("9");
                    } else
                        b.append("0");
                }
                long res = Long.parseLong(b.toString());
                if (res % n == 0) {
                    return b.toString();
                } else c++;
            }
        }catch (RuntimeException e){
            System.out.println("Can not solve!");
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(5);
        System.out.println(7);
        System.out.println(solve(496));
        System.out.println(solve(1230120310));
    }
}
