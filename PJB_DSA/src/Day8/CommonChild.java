package Day8;

import java.util.Scanner;

public class CommonChild {
    public static int commonChild(String s1, String s2) {
        // Write your code here
        StringBuilder rs1 = new StringBuilder();
        StringBuilder rs2 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    rs1.append(s1.charAt(i));
                    break;
                }
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            char a = s2.charAt(i);
            for (int j = 0; j < s1.length(); j++) {
                char b = s1.charAt(j);
                if (s2.charAt(i) == s1.charAt(j)) {
                    rs2.append(s2.charAt(i));
                    break;
                }
            }
        }
        String rs3 = "";
        String rs4 = "";
        int i = 0;
        int j = 0;
        int head = 0;
        while(head < rs1.length()) {
            while (j < rs2.length()) {
                char a = rs1.charAt(i);
                char b = rs2.charAt(j);
                if (rs1.charAt(i) == rs2.charAt(j)) {
                    rs3 += rs1.charAt(i);
                    j++;
                    if (j == rs2.length()) {
                        j = 0;
                        rs4 = rs3.length() - rs4.length() > 0 ? rs3 : rs4;
                        rs3 = "";
                        break;
                    }
                    break;
                }
                j++;
            }
            i++;
            if(j == 0){
                head++;
                i = head;
            }
            if(i == rs1.length()){
                break;
            }
        }
        return rs4.length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println(commonChild(s1, s2));
    }
}
