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

class Result {

    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
//        for(int i = 0; i < arr.size()-1; i++){
//            int temp = arr.get(i);
//            arr.set(i, arr.get(i+1));
//            arr.set(i+1, temp);
//        }
//        return arr;

        Integer[] temp = new Integer[arr.size()];
        for(int i = 0; i < arr.size(); i++){
            temp[ (arr.size() + i - d) % arr.size() ] = arr.get(i);
        }
        arr = new ArrayList<>(Arrays.asList(temp));
        return arr;
    }

}

public class LeftRotation {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++){
            arr.add(sc.nextInt());
        }
        Result.rotateLeft(d,arr);
        System.out.println(arr);
    }
}

