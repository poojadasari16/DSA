package Arrays1D;
import java.util.Arrays;
import java.util.Scanner;
public class CopyArray {
    public static int[] solve(final int[] A, int B){
        int OutArr[] = new int[A.length];
        for(int i =0;i< A.length;i++){
            OutArr[i] = A[i]+B;
        }
        return OutArr;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int A[] = {1,2,3,2,1};
        int B = scn.nextInt();
        System.out.println(Arrays.toString(solve(A,B)));
    }
}
