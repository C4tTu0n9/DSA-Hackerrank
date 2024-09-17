package Day6;

import java.util.Scanner;
import java.util.Stack;

public class SimpleTextEditor {

    private final static Scanner sc = new Scanner(System.in);

    static Stack<String> myStack = new Stack<>();

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
        Your class should be named Solution. */
        System.out.println("Number of test case: ");
        int step = sc.nextInt();
        while (step > 0) {
            System.out.println("My String: " + (myStack.isEmpty() ? "" : myStack.peek()));
            System.out.println("1. Append string to the end of My String");
            System.out.println("2. Delete the last k characters of My String");
            System.out.println("3. Print the Kth character of My String");
            System.out.println("4. Undo the last (not previously undone) operation of type 1 or 2, reverting My String to the state it was in prior to that operation.");
            System.out.println("5. Exit");
            switch (sc.nextInt()) {
                case 1:
                    myAppend();
                    break;
                case 2:
                    myDelete();
                    break;
                case 3:
                    myPrint();
                    break;
                case 4:
                    myUndo();
                    break;
                case 5:
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Invalid operation");

            }
            step--;
        }


    }

    private static void myUndo() {
        if (myStack.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }
        myStack.pop();
    }

    private static void myPrint() {
        System.out.println("K= ");
        int i = sc.nextInt();
        String str = myStack.peek();
        if (i < 0 || i >= str.length() + 1) {
            System.out.println("Nothing to print");
            return;
        }
        System.out.println("Result: " + str.charAt(i - 1));
    }

    private static void myDelete() {
        System.out.println("k= ");
        int i = sc.nextInt();
        String str = myStack.peek();
        char[] c = str.toCharArray();
        StringBuilder rs = new StringBuilder();
        for (int j = 0; j < c.length - i; j++) {
            rs.append(c[j]);
        }
        myStack.push(rs.toString());
    }

    private static void myAppend() {
        System.out.println("String append: ");
        sc.nextLine();
        String in = sc.nextLine();
        String ppush = myStack.isEmpty() ? in : (myStack.peek() + in);
        myStack.push(ppush);
    }
}
