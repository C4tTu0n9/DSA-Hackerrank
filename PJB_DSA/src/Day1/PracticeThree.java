package Day1;

import java.util.ArrayList;
import java.util.List;

public class PracticeThree {
    public static int myNum(int num, int times){
        String a = String.valueOf(num);
        for(int i = 0; i < times - 1; i++){
            a += String.valueOf(num);
        }
        int myNum = Integer.parseInt(a);
        return result(myNum);
    }
    public static int result(int num){
        if(num / 10 == 0){
            return num;
        }
        List<Integer> list = new ArrayList<Integer>();
        while(num > 0){
            list.add(num % 10);
            num /= 10;
        }
        if(list.size() == 1){
            return list.get(0);
        }
        else{
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
            return result(sum);
        }
    }

    public static void main(String[] args) {
        System.out.println(myNum(148, 3));
    }
}
