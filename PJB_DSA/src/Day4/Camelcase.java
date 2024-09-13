package Day4;

public class Camelcase {
    public static int camelcase(String s) {
        // Write your code here
        if(s.isEmpty()) return 0;
        int begin = 1;
        int end = s.length() - 1;
        int count = 1;
        while (begin <= end) {
            if(begin == end){
                if(isUpperCase(s.charAt(begin))){
                    count++;
                    break;
                }
            }
            if(isUpperCase(s.charAt(begin++))){
                count++;
            }
            if(isUpperCase(s.charAt(end--))){
                count++;
            }
        }
        return count;
    }

    public static boolean isUpperCase(char s) {
        return (s >= 'A' && s <= 'Z');
    }

    public static void main(String[] args) {
        System.out.println(camelcase("ab"));

    }
}
