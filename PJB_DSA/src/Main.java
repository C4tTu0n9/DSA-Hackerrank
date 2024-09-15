import Day1.*;
import Day2.*;
import Day3.*;
import Day4.*;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        while (true) {
            showMenu();
            System.out.print("Nhập lựa chọn của bạn: ");
            int n = s.nextInt();
            s.nextLine();
            switch (n) {
                case 1:
                    dayOne();
                    break;
                case 2:
                    dayTwo();
                    break;
                case 3:
                    dayThree();
                    break;
                case 4:
                    dayFour();
                    break;
                case 6:
                    System.out.println("Đang thoát chương trình...");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
    }

    private static void dayFour() throws IOException {
        while (true) {
            System.out.println("\n===== DAY FOUR =====");
            System.out.println("1. CamelCase");
            System.out.println("2. Simple Array Sum");
            System.out.println("3. Java Anagrams");
            System.out.println("4. Staircase");
            System.out.println("5. Java Primality Test");
            System.out.println("6. Back");
            System.out.print("Your Option: ");
            int n = s.nextInt();
            s.nextLine();
            String[] m = new String[0];
            switch (n) {
                case 1:
                    Camelcase.main(m);
                    break;
                case 2:
                    SimpleArraySum.main(m);
                    break;
                case 3:
                    Anagrams.main(m);
                    break;
                case 4:
                    StairCase.main(m);
                    break;
                case 5:
                    PrimalityTest.main(m);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Wrong Input");
            }
        }
    }

    private static void dayThree() throws IOException {
        while (true) {
            System.out.println("\n===== DAY THREE =====");
            System.out.println("1. Java If-Else");
            System.out.println("2. Java Loops II");
            System.out.println("3. Java Loops I");
            System.out.println("4. Java Substring");
            System.out.println("5. Java String Reverse");
            System.out.println("6. Back");
            System.out.print("Your Option: ");
            int n = s.nextInt();
            s.nextLine();
            String[] m = new String[0];
            switch (n) {
                case 1:
                    JavaIfElse.main(m);
                    break;
                case 2:
                    JavaLoop.main(m);
                    break;
                case 3:
                    JavaLoop2.main(m);
                    break;
                case 4:
                    JavaSubstring.main(m);
                    break;
                case 5:
                    JavaStringReverse.main(m);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Wrong Input");
            }
        }
    }

    private static void dayTwo() {
        while (true) {
            System.out.println("\n===== DAY TWO =====");
            System.out.println("1. Strange Grid Again");
            System.out.println("2. Handshake");
            System.out.println("3. Special Multiple");
            System.out.println("4. Summing the N series");
            System.out.println("5. Bus Station");
            System.out.println("6. Back");
            System.out.print("Your Option: ");
            int n = s.nextInt();
            s.nextLine();
            String[] m = new String[0];
            switch (n) {
                case 1:
                    StrangeGrid.main(m);
                    break;
                case 2:
                    Handshake.main(m);
                    break;
                case 3:
                    SpecialMultiple.main(m);
                    break;
                case 4:
                    SummingTheNSeries.main(m);
                    break;
                case 5:
                    BusStation.main(m);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Wrong Input");
            }
        }
    }


    public static void clearConsole() {
    }

    private static void showMenu() throws IOException {
        System.out.println("\n===== MENU =====");
        for (int i = 1; i < 6; i++) {
            System.out.println(i + ". Day " + i);
        }
        System.out.println("6. Exit Program");
    }

    private static void dayOne() {
        while (true) {
            System.out.println("\n===== DAY ONE =====");
            System.out.println("1. Area Under Curves and Volume of Revolving a Curve");
            System.out.println("2. String Reductions");
            System.out.println("3. Super Digit");
            System.out.println("4. Pascal's Triangle");
            System.out.println("5. Sequence full of colors");
            System.out.println("6. Back");
            System.out.print("Your Option: ");
            int n = s.nextInt();
            s.nextLine();
            String[] m = new String[0];
            switch (n) {
                case 1:
                    PracticeOne.main(m);
                    break;
                case 2:
                    PracticeTwo.main(m);
                    break;
                case 3:
                    PracticeThree.main(m);
                    break;
                case 4:
                    PracticeFour.main(m);
                    break;
                case 5:
                    PracticeFive.main(m);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Wrong Input");
            }
        }
    }
    
    
}