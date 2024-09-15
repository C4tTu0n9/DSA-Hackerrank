package Day5;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class DuplicateWord {

    public static void main(String[] args) {

    /*
    *    \\b: Đánh dấu ranh giới của từ.
    *    (\\w+): Nhóm bắt đầu, khớp với một hoặc nhiều ký tự từ (chữ cái, số, gạch dưới).
    *    (?:\\W+\\1\\b)+: Khớp với một hoặc nhiều lần xuất hiện của các ký tự không phải từ,
    *    theo sau là cùng từ đã bắt được trước đó (\1 tham chiếu đến nhóm đầu tiên), và kết thúc bằng ranh giới từ.
    **/
        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";

        //Pattern.CASE_INSENSITIVE cho phép khớp mẫu mà không phân biệt chữ hoa/thường.
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        /*
        * Đọc từng câu đầu vào.
        Tạo một Matcher để tìm kiếm các từ trùng lặp.
        Với mỗi kết quả khớp, thay thế toàn bộ chuỗi khớp (m.group()) bằng từ đầu tiên tìm thấy (m.group(1)).
        In ra câu đã được sửa đổi.
        * */
        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                //m.group(): Đại diện cho toàn bộ chuỗi khớp (từ lặp lại và các lần lặp của nó).
                //m.group(1): Đại diện cho nhóm bắt đầu đầu tiên, là lần xuất hiện đầu tiên của từ.
                input = input.replaceAll(m.group(), m.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        }
    }

}
