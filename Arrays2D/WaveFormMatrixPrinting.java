/*To print matrix elements in wave form top-bottom & bottom-top*/
package Arrays2D;
public class WaveFormMatrixPrinting {
    public static void Wave(int Array[][]) {
        int n = Array.length;
        int m = Array[0].length;
        for (int c = 0; c < m; c++) {
            if (c % 2 == 0) {
                for (int r = 0; r < n; r++) {
                    System.out.print(Array[r][c]+" ");
                }
            }else {
                    for (int r = n - 1; r >= 0; r--) {
                        System.out.print(Array[r][c]+" ");
                    }
                }
            }
        }

    public static void main(String args[]) {
        int Array_result[][] = {{1, 2, 3, 10},
                                {4, 5, 6, 11},
                                {7, 8, 9, 12}};
        Wave(Array_result);
    }
}
