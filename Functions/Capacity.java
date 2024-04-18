package Functions;
import java.util.Scanner;
public class Capacity {
    public static int solve(int MangoCount, int MangoSlices){
        int MangoShake = ((MangoCount*3)+(MangoSlices))/2;
        return MangoShake;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int B = scn.nextInt();
        System.out.println(solve(A,B));
    }

}
