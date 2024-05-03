package Arrays1D;
public class Non_DescendingArray {
        public static int solve(int[] A) {
            for(int i=1;i<A.length;i++){
                if(A[i-1]>A[i]){
                    return 0;
                }
            }
            return 1;                       //return 1 if sorted
        }
        public static void main(String args[]){
            int A[]= {10,23,34,56,65};
            System.out.println(solve(A));
        }
}
