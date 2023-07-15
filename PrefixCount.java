public class PrefixCount {
    public static void FindEvenRange(int A[], int [][]Q) {
        int[]pc = prefixcount(A);
        for (int i = 0; i < Q.length; i++) {
            int l = Q[i][0];
            int r = Q[i][1];
            if (l == 0) {
                System.out.print(pc[r] + " ");
            } else {
                System.out.print(pc[r] - pc[l - 1] + " ");
            }
        }

    }
    public static int[] prefixcount(int A[]) {
        int n = A.length;
        int[] pc = new int[n];
        if (A[0] % 2 == 0) {
            pc[0] = 1;
        } else {
            pc[0] = 0;
        }
        for (int i = 1; i < n; i++) {
            int temp = 0;
            if (A[i] % 2 == 0) {
                temp = 1;
            }
            pc[i] = pc[i - 1] + temp;
        }
        return pc;
    }

    public static void main(String[] args){
        int Array[] = {3,5,8,9,16,14,13,12};
        int Q[][] = {{1, 5}, {2,6},{4,5},{4,4},{3,6}};
        FindEvenRange(Array,Q);                             // TC - O(N+Q), SC - O(N)
    }

}
