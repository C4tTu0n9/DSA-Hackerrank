package Day4;

import java.util.List;

public class SimpleArraySum {

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < ar.size(); i++) {
            sum += ar.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
