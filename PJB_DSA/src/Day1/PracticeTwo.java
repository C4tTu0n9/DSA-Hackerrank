package Day1;

public class PracticeTwo {
    public static String a(String str) {
        String result = "";
        boolean check = true;
        for (int i = 0; i < str.length(); i++) {
            if(i == 0){
                result += str.charAt(i);
                continue;
            }
            if(!result.contains(str.charAt(i) + "")){
                result += str.charAt(i);
            }

        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(a("pprrqq"));
    }
}
