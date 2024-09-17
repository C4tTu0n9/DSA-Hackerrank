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
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int stringListCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<String> stringList = IntStream.range(0, stringListCount).mapToObj(i -> {
//                    try {
//                        return bufferedReader.readLine();
//                    } catch (IOException ex) {
//                        throw new RuntimeException(ex);
//                    }
//                })
//                .collect(toList());
//
//        int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<String> queries = IntStream.range(0, queriesCount).mapToObj(i -> {
//                    try {
//                        return bufferedReader.readLine();
//                    } catch (IOException ex) {
//                        throw new RuntimeException(ex);
//                    }
//                })
//                .collect(toList());
//
//        List<Integer> res = Result.matchingStrings(stringList, queries);
//
//        bufferedWriter.write(
//                res.stream()
//                        .map(Object::toString)
//                        .collect(joining("\n"))
//                        + "\n"
//        );
        List<String> a = new ArrayList<>(Arrays.asList("aba","baba","aba","xzxb"));
        List<String> b = new ArrayList<>(Arrays.asList("aba","xzxb","ab"));
        List<Integer> rs = Result.matchingStrings(a, b);
        System.out.println(rs.toString());
    }

}
