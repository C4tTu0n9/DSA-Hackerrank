package Day1;

public class PracticeFour {

    public static void myPascalTriangle(int n) {
        int[][] arr = new int[n][n];
        arr[0][0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                arr[i][j] = factorial(i) / (factorial(j) * factorial(i-j));
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int factorial(int n){
        int res = 1;
        for(int i = 1; i <= n; i++){
            res *= i;
        }
        return res;
    }

    public static void main(String[] args) {
        myPascalTriangle(6);
    }
}
