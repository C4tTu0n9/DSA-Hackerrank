package Day9;

import java.util.*;

public class JavaHashset {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        //Write your code here
//        List<Integer> count = new ArrayList<Integer>();
//        int c = 0;
//        boolean check = true;
//        for (int i = 0; i < t; i++) {
//            if(i == 0) {
//                count.add(++c);
//                continue;
//            }
//            String temp = pair_left[i]+" "+pair_right[i];
//            for(int j = 0; j < i; j++) {
//                String ss = pair_left[j]+" "+pair_right[j];
//                if(ss.equals(temp)){
//                    check = true;
//                    break;
//                }
//                else {
//                    check = false;
//                    continue;
//                }
//            }
//            if(check){
//                count.add(c);
//            }
//            else{
//                count.add(++c);
//            }
//        }
//        for(int i = 0; i < count.size(); i++) {
//            System.out.println(count.get(i));
//        }

        System.out.println();
        //hashset
        int c = 0;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < t; i++) {
            if(!set.contains(pair_left[i]+" "+pair_right[i])) {
                set.add(pair_left[i] + " " + pair_right[i]);
                System.out.println(++c);
            }
            else{
                System.out.println(c);
            }
        }

    }
}
