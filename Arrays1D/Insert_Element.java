package Arrays1D;
import java.util.Arrays;
import java.util.Scanner;

public class Insert_Element {
    public static int[] Insele(int A[],int X,int Y) {
        int N = A.length;
        int Arr[] = new int[N + 1];
        for (int i = 0; i < N + 1; i++) {
            if (i < X - 1) {
                Arr[i] = A[i];
            } else if (i == X - 1) {
                Arr[i] = Y;
            } else
                Arr[i] = A[i - 1];
        }
        return Arr;
    }
        public static void main (String args[]){
            Scanner scn = new Scanner(System.in);
            int N = scn.nextInt();
            int A[] = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = scn.nextInt();
            }
            int X = scn.nextInt();
            int Y = scn.nextInt();
            int Result[] = Insele(A, X, Y);
            for(int K=0;K< Result.length;K++){
                System.out.print(Result[K]+" ");
            }
        }
    }


