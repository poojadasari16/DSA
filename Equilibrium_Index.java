public class Equilibrium_Index {

    public static int[] prefixsum(int A[]){
        int n = A.length;
        int ps[] = new int[n];
        ps[0] = A[0];
        for(int i=1;i<n;i++){
            ps[i] = ps[i-1]+A[i];
        }
        return ps;
    }

    public static int equilibriumIndex(int A[]) {
        int ps[] = prefixsum(A);
        int n = A.length;
        for (int i = 0; i < n; i++) {
            int ls = 0;
            if (i > 0) {
                ls = ps[i - 1];
            }
            int rs = ps[n - 1] - ps[i];
            if (ls == rs) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int Array[] = {5,1,3,2,9};
        int result = equilibriumIndex(Array);    // TC = (N+N) = 2N = O(N)
        System.out.print(result);                   // SC = O(N) for creating PS array
    }
}
