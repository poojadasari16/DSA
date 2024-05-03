package Arrays2D;
import java.util.Scanner;

public class ElementsDiv_return_Array {
    public static int[] solve(int[] arr) {
        int count=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]%5==0 && arr[i]%7==0){
                count++;
            }
        }
        int result[] = new int[count];
        int index=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]%5==0 && arr[i]%7==0){
                result[index++]=arr[i];
            }
        }
        return result;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int A[]= new int[n];
        for(int i=0;i< A.length;i++) {
            A[i] = scn.nextInt();
        }
        System.out.print("[ ");
        int Result[] = solve(A);
        for(int k=0;k< Result.length;k++){
            System.out.print(Result[k]+" ");
        }
        System.out.print(" ]");
    }
}
