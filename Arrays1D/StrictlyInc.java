/*To find if array is strictly increasing*/
package Arrays1D;
import java.util.Scanner;

public class StrictlyInc {
    public static Boolean StrictInc(int A[]){
        for(int i=1;i<A.length;i++){                      //here traversing starts from 1 as the first index is 0 and condition fails
            if(A[i-1]>=A[i]){
                return false;                            //check the false condition and return false
            }
        }
        return true;                                    //else return true
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int Array[] = {10,23,34,56,65};
        System.out.println(StrictInc(Array));
    }
}
