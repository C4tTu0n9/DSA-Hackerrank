package Day7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _2DArray_DS {
    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        // int sum = 0;
        // int max = 0;
        // int myRow = 0, myCol = 0;
        // int pointRow = 0, pointCol = 0;
        // while (myRow < arr.size() || myCol < arr.get(myRow).size()) {
        //     if (myCol == pointCol + 3) {
        //         myRow++;
        //         myCol = pointCol;
        //         continue;
        //     }
        //     if(myRow == pointRow + 3) {
        //         myCol = pointCol + 1;
        //         if(myRow == arr.get(myCol).size()){
        //             myRow++;
        //             myCol = 0;
        //         }
        //         else{
        //             myRow = pointRow;
        //         }
        //         continue;
        //     }
        //     if(myRow == pointRow + 1 && (myCol == pointCol || myCol == pointCol + 2)) {
        //         myCol++;
        //         continue;
        //     }
        //     sum += arr.get(myRow).get(myCol);
        //     if (sum >= max) {
        //         max = sum;
        //         myCol++;
        //     }
        // }
        // return sum;
        // 1 2 3 4 5
        // 2 3 4 5 6
        // 4 5 6 7 8
        int i = 0, j = 0;
        int sum = 0;
        int cur = -2147483648;
        List<List<Integer>> ls = new ArrayList<>();
        while (i < arr.size()-2) {
            sum = 0;
            sum += arr.get(i).get(j);
            sum += arr.get(i).get(j + 1);
            sum += arr.get(i).get(j + 2);
            sum += arr.get(i + 1).get(j + 1);
            sum += arr.get(i + 2).get(j);
            sum += arr.get(i + 2).get(j + 1);
            sum += arr.get(i + 2).get(j + 2);
            cur = Math.max(cur, sum);
            if (j == arr.get(0).size() - 3) {
                i++;
                j = 0;
            }
            else {
                j++;
            }
        }
        return cur;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> arr = new ArrayList<>();
        for(int i = 0; i < 6 ; i++){
            List<Integer> l = new ArrayList<>();
            for(int j = 0; j < 6 ; j++){
                System.out.println("arr["+i+"]["+j+"] = ");
                l.add(sc.nextInt());
            }
            arr.add(l);
        }
        System.out.println("result: "+hourglassSum(arr));
    }
}
