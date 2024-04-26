/*Reverse an array and return array using function*/
package Arrays1D;
import java.util.Scanner;

public class ReverseArray {
    public static int[] RevArray(int A[]) {
        int n = A.length;
        int start = 0;
        int end = n - 1;
        while (start < end) {
            int temp = A[start];
            A[start] = A[end];
            A[end] = temp;
            start++;
            end--;
        }
        return A;
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int Arr[] = new int[N];
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = scn.nextInt();
        }
        int result[] = RevArray(Arr);
        for(int K=0;K< result.length;K++){
            System.out.print(result[K]+" ");
        }
    }
}
