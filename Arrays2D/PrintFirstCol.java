/*Print only first col in a 2D array*/
package Arrays2D;
public class PrintFirstCol {
    public static void main(String args[]){
        int Arr[][] = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        System.out.print("[ ");
        for(int r=0;r< Arr.length;r++){
            System.out.print(" "+Arr[r][0]+" ");
        }
        System.out.print(" ]");
    }
}
