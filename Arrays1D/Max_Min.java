/*Take input an array A of size N and write a program to print maximum and minimum elements of the input. The only line of the input would contain a single integer N that represents the length of the array followed by the N elements of the input array A.*/
package Arrays1D;
import java.util.Scanner;

public class Max_Min {
    public static void Max_MinSolve(int A[]) {
        int Max = A[0];
        int Min = A[0];
        for (int i = 0; i<A.length; i++) {
            if (Max > A[i]) {
                Max = A[i];
            }
            if (Min < A[i]) {
                Min = A[i];
            }
        }
        System.out.println(Min+" "+Max);
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int Arr[] = new int[N];
        for(int i=0;i<Arr.length;i++){
            Arr[i]= scn.nextInt();
        }
        Max_MinSolve(Arr);
    }
}
