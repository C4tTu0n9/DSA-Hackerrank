package Day9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArraylist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("num of arrays:");
        int n = sc.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Num of elemets in array "+(i+1)+": ");
            int a = sc.nextInt();
            List<Integer> listSub = new ArrayList<>();
            listSub.add(a);
            for (int j = 0; j < a; j++) {
                System.out.print("Element "+(j+1)+": ");
                listSub.add(sc.nextInt());
                System.out.println();
            }
            list.add(listSub);
            System.out.println();
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                System.out.print(list.get(i).get(j) + " ");
            }
            System.out.println();
        }

        System.out.println("Num of queries: ");
        int q = sc.nextInt();
        List<String> qlist = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            try {
                System.out.print("Numth of array that you want to query: ");
                int a = sc.nextInt();
                System.out.println();
                List<Integer> listQuery = list.get(a - 1);
                System.out.print("Numth of elements that you want to query: ");
                int b = sc.nextInt();
                qlist.add(listQuery.get(b).toString());
                System.out.println();
            }
            catch (Exception e) {
                qlist.add("ERROR!");
            }
        }
        for(int i = 0; i < qlist.size(); i++) {
            System.out.println(qlist.get(i));
        }

    }
}
