/*Alex is fond of chocolates. He has initially A rupees and a single chocolate costs B rupees.
But too many chocolates are not good for health, so Alex will not buy more than C chocolates.
Find the number of chocolates Alex will buy with the money he has.*/
package Functions;

import java.util.Scanner;

public class Chocolates {
    public static int solve(int A, int B, int C) {
        int choco_num = (A/B);  // to find num of chocs can be purchased
        if (choco_num>C){       //to check if num of chocs are more than that alex can have, if yes then return possible value
            return C;
        }
        return choco_num;       //else return number of chocos can be purchased
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        int B = scn.nextInt();
        int C = scn.nextInt();
        System.out.println(solve(A,B,C));
    }
}
