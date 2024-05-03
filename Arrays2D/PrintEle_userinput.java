/*Print all elements by taking matrix input from user*/
package Arrays2D;
import java.util.Scanner;

public class PrintEle_userinput {
    public static void display(int Array[][]){
        for(int r=0;r< Array.length;r++){
            for(int c=0;c<Array[0].length;c++){
                System.out.print(" "+Array[r][c]+" ");
            }
            System.out.println("");
        }
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int Array[][]=new int[n][m];
        for(int r=0;r<n;r++){
            for(int c=0;c<m;c++){
                Array[r][c]= scn.nextInt();
            }
        }
        display(Array);
    }
}
