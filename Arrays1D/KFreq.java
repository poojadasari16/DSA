/*To check frequency of K in given array*/
package Arrays1D;
import java.util.Scanner;

public class KFreq {
    public static int FrequencyK(int A[],int K){
        int freq =0;
        for(int i=0;i<A.length;i++){
            if(A[i]==K){
                freq = freq+1;
            }
        }
        return freq;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int Array[] = {1,3,4,3,5,6,5,8,8,5,5,5};
        int K = scn.nextInt();
        System.out.println(FrequencyK(Array,K));
    }
}
