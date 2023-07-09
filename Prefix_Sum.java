public class Prefix_Sum {
    public static int[] prefixsum(int A[]){
        int n = A.length;
        int ps[] = new int[n];
        ps[0] = A[0];          //As the ps of first element is always the first element of an array
        for(int i=1;i<n;i++){
            ps[i] = ps[i-1]+A[i];
        }
        return ps;
    }
    public static void main(String[] args){
        int Array[] = {3,9,4,-5,2};
        int result[] = prefixsum(Array);
        for(int k=0;k<Array.length;k++){
            System.out.println(result[k]);
        }
    }
}
