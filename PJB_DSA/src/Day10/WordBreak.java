package Day10;

import java.util.*;

public class WordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                String test = s.substring(j, i);
                if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        List<String> wordDict = new ArrayList<String>();
        System.out.println("Number of words: ");
        int num = sc.nextInt();
        for(int i = 0; i < num; i++){
            wordDict.add(sc.next());
        }
        System.out.println(wordBreak(s, wordDict));

    }
}
