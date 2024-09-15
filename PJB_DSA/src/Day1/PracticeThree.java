package Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while (true){
            if(check) {
                System.out.println("Number: ");
                int num = sc.nextInt();
                System.out.println("Times repeat:");
                int times = sc.nextInt();
                System.out.print("Result ");
                System.out.println(myNum(num, times));
            }
            System.out.println("Continue? (Y/N)");
            String input = sc.next();
            if(input.equalsIgnoreCase("y")){
                check = true;
                continue;
            }
            else if(input.equalsIgnoreCase("n")){
                check = false;
                break;
            }
            else{
                System.out.println("Wrong input");
                check = false;
            }
        }
    }
}
