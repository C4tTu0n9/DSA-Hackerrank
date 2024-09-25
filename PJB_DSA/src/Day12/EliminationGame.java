package Day12;

import java.util.Scanner;

public class EliminationGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rs = Result.lastRemaining(n);
        System.out.println(rs);
    }
}
