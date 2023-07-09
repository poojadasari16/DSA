public class Bulb_Flip {
    public static int flip_count(int A[]){
        int n = A.length;
        int count =0;
        for(int i =0;i<n;i++) {              // [0 0 1 0 1]
            if (count % 2 == 1) {            //find actual state of bulb by checking the flip count
                A[i] = 1 - A[i];             // if flip count - odd, then opposite to original state, if flip count on then same as original state
            }
            if (A[i] == 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int Array[] = {0,0,1,0,1};
        int result = flip_count(Array);
        System.out.println(result);
    }
}

