/*Find sum of given 2 matrix*/
package Arrays2D;
public class PrintMatrixSum {
    public static int[][] Sum(int A[][], int B[][]) {
        int n = A.length;                               //here n and m can be for any matrixA or B as sum is only possible when the 2 matrices length is same
        int m = A[0].length;
        int SumMat[][] = new int[n][m];
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                SumMat[r][c] = A[r][c] + B[r][c];
            }
        }
        return SumMat;
    }

    public static void main(String args[]) {
        int A[][] = {{1, 2, 3, 10},
                     {4, 5, 6, 11},
                     {7, 8, 9, 12}};
        int B[][] = {{1, 2, 3, 10},
                     {4, 5, 6, 11},
                     {7, 8, 9, 12}};
        int result[][] = Sum(A, B);
        for (int r = 0; r < result.length; r++) {
            for (int c = 0; c < result[0].length; c++) {
                System.out.print(result[r][c] + " ");
            }
            System.out.println();
        }
    }
}
