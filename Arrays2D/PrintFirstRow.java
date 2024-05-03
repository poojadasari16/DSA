/*Print only first row in a 2D array*/
package Arrays2D;

public class PrintFirstRow {
    public static void main(String args[]) {
         int Arr[][] = {{1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}};
        System.out.print("[ ");
        for (int c = 0; c < Arr.length; c++) {          //in first row, row is fixed and need to iterate through each colomn
                System.out.print(" " +Arr[0][c]+" ");
            }
        System.out.print(" ]");
        }
    }

