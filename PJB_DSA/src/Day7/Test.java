package Day7;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

import static java.lang.Integer.MIN_VALUE;

class Test {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while (in.hasNext()) {
//            String IP = in.next();
//            System.out.println(IP.matches(new MyRegex().pattern));
//        }
//
        List<List<Integer>> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr.add(new ArrayList<>());
            for (int j = 0; j < n; j++) {
                arr.get(i).add(sc.nextInt());
            }
        }
        System.out.println(hourglassSum(arr));

    }

    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        int i = 0;
        while (i != a.size() / 2) {
            Integer temp = a.get(i);
            a.set(i, a.get(a.size() - 1 - i));
            a.set(a.size() - 1 - i, temp);
        }
        return a;
    }

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        int i = 0, j = 0;
        int sum = 0;
        int cur = -2147483648;
        List<List<Integer>> ls = new ArrayList<>();
        while (i < arr.size()-2) {
            sum = 0;
            sum += arr.get(i).get(j);
            sum += arr.get(i).get(j + 1);
            sum += arr.get(i).get(j + 2);
            sum += arr.get(i + 1).get(j + 1);
            sum += arr.get(i + 2).get(j);
            sum += arr.get(i + 2).get(j + 1);
            sum += arr.get(i + 2).get(j + 2);
            cur = Math.max(cur, sum);
            if (j == arr.get(0).size() - 3) {
                i++;
                j = 0;
            }
            else {
                j++;
            }
        }
        return cur;
    }
}

//Write your code here
class MyRegex {
    String pattern = "^(([0-9]|[0-9][0-9]|0[0-9]{2}|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[0-9][0-9]|0[0-9]{2}|1[0-9]{2}|2[0-4][0-9]|25[0-5])$";
}