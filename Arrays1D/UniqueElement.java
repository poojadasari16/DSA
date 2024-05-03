package Arrays1D;
public class UniqueElement {
    public static int UniEle(int A[]){
        int result = 0;
        // XOR all elements in the array
        for (int i=0;i<A.length;i++){
            result ^= i;                    //XOR operation cancels both duplicate values and return 0 and if there are no same numbers then it returns num
        }
        return result;
    }
    public static void main(String args[]){
        int array[]= {7,1,5,13,1,14,19,16,15,8,10,15,17,35,12,17,14,19,11,9,5,10,12,18,16,4,4,6,3,3,2,11,8,18,6,20,13,2,7,9,20};
        int UniqueElement=UniEle(array);
        System.out.println(UniqueElement);
    }
}
