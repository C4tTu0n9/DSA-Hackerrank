package Day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SherlockAndTheValidString {

    public static String isValid(String s) {
        // Write your code here
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        List<Integer> myCount = new ArrayList<>();
        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) myCount.add(count[i]);
        }
        if (myCount.size() == 1) return "YES";
        if (myCount.size() == 2) {
            if (myCount.get(0) == myCount.get(1)) return "YES";
            else if (myCount.get(0) == 1 || myCount.get(1) == 1) return "YES";
            else if (myCount.get(0) == myCount.get(1) + 1 || myCount.get(1) == myCount.get(0) + 1) return "YES";
            else return "NO";
        }
        int c = 0; //count change time
        int rem = myCount.get(0) == myCount.get(1) ? myCount.get(0) : (myCount.get(0) == myCount.get(2) ? myCount.get(0) : myCount.get(1));
        for (int i = 0; i < myCount.size(); i++) {
            if (myCount.get(i) == rem) {
                continue;
            } else {
                if (c == 0 && (myCount.get(i) == 1 || myCount.get(i) == rem + 1)) {
                    c++;
                    continue;
                } else {
                    return "NO";
                }
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            System.out.println(isValid(s));
        }
    }
}
