package Day5;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class ClimbingTheLeaderboard {

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here
        List<Integer> climbed = new ArrayList<>();

        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(ranked);
        List<Integer> new_ranked = new ArrayList<>(set);
        for (int i = 0; i < player.size(); i++) {
            if (player.get(i) < new_ranked.get(new_ranked.size() - 1)) {
                climbed.add(new_ranked.size() + 1);
                continue;
            }
            if (player.get(i) >= new_ranked.get(0)) {
                climbed.add(1);
                continue;
            }

            for (int j = new_ranked.size() - 1; j >= 0; j--) {
                    if(player.get(i) < new_ranked.get(j)) {
                        climbed.add(j+1+1);
                        break;
                    }
            }
        }
        return climbed;
    }


    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        int playerCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> player = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        List<Integer> result = climbingLeaderboard(ranked, player);
//
//        bufferedWriter.write(
//                result.stream()
//                        .map(Object::toString)
//                        .collect(joining("\n"))
//                        + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();
        List<Integer> ranked = new ArrayList<>(Arrays.asList(100, 90, 90, 80, 75, 60));
        List<Integer> player = new ArrayList<>(Arrays.asList(50,65,77,90,102));
        List<Integer> res = climbingLeaderboard(ranked, player);
        for (Integer i : res) {
            System.out.println(i);
        }
    }
}
