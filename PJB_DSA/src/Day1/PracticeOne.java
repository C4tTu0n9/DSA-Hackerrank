package Day1;

public class PracticeOne {
    public static double result(int[][] arr, int limit){
        double sum = 0;
        for(int i = 0; i < arr[0].length; i++){
            sum += arr[0][i] * Math.pow(limit, arr[1][i] + 1) / (arr[1][i] + 1);
        }
        return sum;
    }

    public static double volume(int[][] arr, int limit){
        double sum = 0;
        for(int i = 0; i < arr[0].length; i++){
            sum += arr[0][i] * arr[0][i] * Math.pow(limit, 2 * arr[1][i] + 1) / (2 * arr[1][i] + 1);
        }
        return Math.PI * sum;
    }

    public static double V(int[][] arr){
        return volume(arr, arr[2][0]) - volume(arr, arr[2][1]);
    }


    public static double A(int[][] arr){
        return result(arr, arr[2][0]) - result(arr, arr[2][1]);
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{4,1}};
        System.out.println(A(arr));
        System.out.println(V(arr));
    }

}
