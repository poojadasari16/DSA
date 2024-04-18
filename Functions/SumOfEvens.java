package Functions;
import java.util.Scanner;
public class SumOfEvens {
    static int EvenSum(int A){
        int sum =0;
        for (int i=2;i<=A;i++){
            if(i%2==0){
                sum = sum+i;
            }
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        System.out.println(EvenSum(A));
    }
}
