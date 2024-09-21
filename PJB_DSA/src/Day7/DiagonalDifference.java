package Day7;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class DiagonalDifference {
    /*
    11 2 4
    4 5 6
    10 8 -12

    11+5+ (-12) - (4+5+10)
    = 11 + 5 + (-12) - 4 - 5 - 10
    = (11-4) + (5-5) +[(-12) - 10]
    = 7 + 0 + (-22)
    = - 15
     */
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int sum1 = 0;
        int j = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum1 += arr.get(i).get(i) - arr.get(i).get(arr.get(i).size() - i - 1);
        }
        return Math.abs(sum1);
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                list.add(sc.nextInt());
            }
            arr.add(list);
        }
        System.out.println(diagonalDifference(arr));
    }
}

