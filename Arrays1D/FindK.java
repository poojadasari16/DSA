/*Find if given element is present in array and return true/false*/
package Arrays1D;

import java.util.Scanner;
public class FindK {
    public static Boolean FK(int A[],int K){
        for(int i=0;i<A.length;i++){
            if(A[i]==K){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int Array[] = {1,2,3,4,5};
        int K = scn.nextInt();
        System.out.println(FK(Array,K));
    }
}
