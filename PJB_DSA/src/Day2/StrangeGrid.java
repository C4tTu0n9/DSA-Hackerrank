package Day2;

public class StrangeGrid {

    public static long strangeGrid(int r, int c) {
        // Write your code here
        return 2* (5* (((long)r-1) / 2) ) + 2*((long)c-1) + ((r+1)%2);
    }

    public static void main(String[] args) {
        System.out.println(strangeGrid(6, 3));
        System.out.println(strangeGrid(1000000011, 5));
    }
}
