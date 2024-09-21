package Day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CommonChild {

    public static int commonChild(String s1, String s2) {
        // Write your code here
        StringBuilder reS1 = new StringBuilder();
        StringBuilder reS2 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    reS1.append(s1.charAt(i));
                    break;
                }
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            for (int j = 0; j < s1.length(); j++) {
                if (s2.charAt(i) == s1.charAt(j)) {
                    reS2.append(s2.charAt(i));
                    break;
                }
            }
        }
        //S H I N C H A N
        //N O H A R A A A

        //H N H A N
        //N H A A A N
        //H N N
        StringBuilder rem = new StringBuilder();
        String rs = "";
        int i = 0, j = 0;
        int pointI = 0;
        int pointJ = 0;
        while (pointI < reS1.length()) {
            while (j < reS2.length()) {
                char a = reS1.charAt(i);
                char b = reS2.charAt(j);
                if (reS1.charAt(i) == reS2.charAt(j)) {
                    rem.append(reS1.charAt(i));
                    i++;
                    j++;
                    pointJ = j;
                } else {
                    j++;
                }
                if (j == reS2.length() || i == reS1.length()) {
                    if (i >= reS1.length() - 1 || j >= reS2.length()) {
                        rs = rem.length() > rs.length() ? rem.toString() : rs;
                        rem.setLength(0);
                        j = 0;
                        break;
                    } else {
                        i++;
                        j = pointJ;
                    }
                }
            }
            pointI++;
            i = pointI;
        }
        return rs.length();
    }

    public static int commonChild2(String s1, String s2) {
        // Write your code here
        Map<Integer, ArrayList<Integer>> map = new HashMap<>(s1.length());
        Map<Integer, int[]> res = new HashMap<>(s1.length());
        boolean ld = false;
        int[] a = new int[2];
        a[0] = 0;
        a[1] = -1;
        res.put(1, a);
        int maxNum = 1;
        for (int i = 0; i < s1.length(); i++) {
            if (!map.containsKey((int) s1.charAt(i))) {
                map.put((int) s1.charAt(i), new ArrayList<>());
            }
            map.get((int) s1.charAt(i)).add(i);
        }
        for (int i = 0; i < s2.length(); i++) {
            if (map.containsKey((int) s2.charAt(i))) {
                for (int j = maxNum; j > 0; j--) {
                    int val = res.get(j)[1];
                    int pre = res.get(j)[0];
                    for (int tmp : map.get((int) s2.charAt(i))) {
                        if (tmp > val) {
                            int[] b = new int[2];
                            b[0] = val;
                            b[1] = tmp;
                            if (ld == false) {
                                ld = true;
                                res.put(maxNum, b);
                            } else {
                                if (j == maxNum) {
                                    res.put(j + 1, b);
                                    maxNum++;
                                } else {
                                    if (res.get(j + 1)[1] > tmp) {
                                        res.put(j + 1, b);
                                    }
                                }
                            }
                            break;
                        } else {
                            if (tmp > pre && tmp < res.get(j)[1]) {
                                res.get(j)[1] = tmp;
                            }
                        }
                    }
                }
            }
        }
        if (ld == false)
            maxNum--;
        return maxNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first string: ");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        String s2 = sc.nextLine();
        System.out.println("Result: " + commonChild2(s1, s2));
    }
}
