package Functions;
import java.util.Scanner;

public class SphereVolume {
    static int SphereVol(final int A){
        double vol = ((4*Math.PI*Math.pow(A,3))/3);
        vol = Math.ceil(vol);
        return (int) vol;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        System.out.println(SphereVol(N));
    }
}
