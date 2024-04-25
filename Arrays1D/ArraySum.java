package Arrays1D;
import java.util.Scanner;

public class ArraySum {
    public static int Sum(int A[]) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum = sum + A[i];
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int A[] = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = scn.nextInt();
        }
        System.out.println(Sum(A));
    }
}

