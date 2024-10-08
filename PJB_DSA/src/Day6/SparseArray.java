package Day6;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        // Write your code here
        Map<String,Integer> map = new HashMap<>();
        for (int i = 0; i < stringList.size(); i++) {
            map.put(stringList.get(i), map.getOrDefault(stringList.get(i), 0) + 1);
        }
        List<Integer> matchingStrings = new ArrayList<>();
        for (int i = 0; i < queries.size(); i++) {
            matchingStrings.add(map.getOrDefault(queries.get(i) , 0));
        }
        return matchingStrings;
    }

}

public class SparseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> stringList = new ArrayList<>();
        List<String> queries = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            stringList.add(sc.next());
        }
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            queries.add(sc.next());
        }
        List<Integer> matchingStrings = Result.matchingStrings(stringList, queries);
        System.out.println(matchingStrings);
    }

}
