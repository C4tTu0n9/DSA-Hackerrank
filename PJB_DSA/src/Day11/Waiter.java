package Day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Waiter {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }
        System.out.println(Result.waiter(list,q));
    }
}
