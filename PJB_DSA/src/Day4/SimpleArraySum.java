package Day4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleArraySum {

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < ar.size(); i++) {
            sum += ar.get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.println("Number of Elements: ");
                int n = sc.nextInt();
                List<Integer> ar = new ArrayList<Integer>();
                for (int i = 0; i < n; i++) {
                    System.out.print("Number "+(i+1)+": ");
                    ar.add(sc.nextInt());
                }
                System.out.print("Result: ");
                System.out.println(simpleArraySum(ar));
                while (true) {
                    System.out.println("Do you want to continue? (Y/N)");
                    String input = sc.nextLine().trim().toLowerCase();
                    if (input.equals("y")) {
                        break;
                    } else if (input.equals("n")) {
                        return;
                    } else {
                        System.out.println("Please enter Y or N.");
                    }
                }
            }
        }
    }
