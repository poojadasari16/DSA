/*Print all elements from a static 2D array*/
package Arrays2D;
public class PrintAllElements2D {
    public static void main(String args[]){
        int Array[][] = {{1,2,3,10},
                         {4,5,6,11},
                         {7,8,9,12}};
        for(int r=0;r<3;r++){                           //iterating through each row
            for(int c=0;c<4;c++){                       //iterating through each coloumn
                System.out.print(" "+Array[r][c]+" ");
            }
            System.out.println("");                     //jumping to next line
        }
    }
}
