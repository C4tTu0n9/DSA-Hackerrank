package Day8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SuperReducedString {
    public static String superReducedString(String s) {
        // Write your code here
        //abba
        String rs = "";
        for (int i = 0; i < s.length()-1; i++) {
            if(i < 0){
                i=0;
            }
            if(s.isEmpty()){
                break;
            }
            if (s.charAt(i) == s.charAt(i + 1)) {
                rs="";
                rs += s.charAt(i);
                rs += (s.charAt(i+1));
                i-=2;
            }
            s = s.replace(rs,"");
        }
        return s.isEmpty() ? "Empty String" : s;
    }

    public static void main(String[] args) {
        System.out.println(superReducedString("aaabccddd"));
        //tqauhujtmxnsbzpykwlvpfyqijvdhuhirdmuxiobyvxupqwydkpbxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh
        //tqauhujtmxnsbzpykwlvpfyqijvdhuhirdmuxiobyvxupqwydkpbxmfvxhgicuzdealkgxlfmjiucasokrdznmtlwh
    }
}
