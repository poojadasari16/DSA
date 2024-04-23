/*You are given a positive integer A denoting the radius of a circle. You have to calculate the area of the circle.*/
package Functions;
import java.util.Scanner;

public class CircleArea {
    public static String solve(int A) {
    double area = 3.1416*Math.pow(A,2);
    String result = String.format("%.2f", area);    //change the value to round off to 2 d digits and return string value
    return result;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        System.out.println(solve(A));
    }
}
