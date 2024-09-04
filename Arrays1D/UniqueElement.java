package Arrays1D;
public class UniqueElement {
    public static int singleNumber(int A[]) {
        int UniqueNumber =0;
        for(int i=0;i<A.length;i++){
            UniqueNumber = UniqueNumber ^ A[i]; /*Using XOR operation, duplicate elements will be ignored & it returns single element*/
        }
        return UniqueNumber;
    }
        public static void main (String args[]){
            int array[] = {7, 1, 5, 13, 7, 5, 1};
            int res = singleNumber(array);
            System.out.println(res);
        }
    }
