public class RangeSumQuery {
    public static void RangeSum(int[] A, int[][] Q) {
        int n = Q.length;
        int ps[] = prefixsum(A);
        for (int i = 0; i < n; i++) {
            int L = Q[i][0];
            int R = Q[i][1];

            if (L == 0) {
                System.out.println(ps[R]);
            } else {
                System.out.println(ps[R] - ps[L - 1]);
            }
        }
    }

    public static int[] prefixsum(int A[]) {
        int n = A.length;
        int ps[] = new int[n];
        ps[0] = A[0];          //As the ps of first element is always the first element of an array
        for (int i = 1; i < n; i++) {
            ps[i] = ps[i - 1] + A[i];
        }
        return ps;
    }

    public static void main(String[] args) {
        int Array[] = {3, 9, 4, -5, 2, 6, 8};
        int Q[][] = {{2, 4}, {3, 6}, {0, 2}};
        RangeSum(Array, Q);                          // TC = O(Q+N) // SC = O(N)
    }
}

