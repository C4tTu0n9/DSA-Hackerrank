package Day9;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class RomanToInteger {
    public static int romanToInt(String s) {
        Hashtable table = new Hashtable();
        table.put("I", 1);
        table.put("V", 5);
        table.put("X", 10);
        table.put("L", 50);
        table.put("C", 100);
        table.put("D", 500);
        table.put("M", 1000);

        int sum = 0;
        if (s.length() == 1) {
            return (int) table.get(s);
        }
        for (int i = 0; i < s.length()-1; i++) {
            if ((int) table.get(s.charAt(i)+"") < (int) table.get(s.charAt(i + 1) +"")) {
                sum -= (int) table.get(s.charAt(i)+"");
            } else {
                sum += (int) table.get(s.charAt(i)+"");
            }
        }
        return sum+(int) table.get(s.charAt(s.length()-1)+"");
    }

    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            System.out.println(romanToInt(s));
        }
    }
}
