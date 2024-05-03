package Arrays2D;
import java.util.ArrayList;
import java.util.Scanner;

public class ElementsDiv_return_ArrayList {
    public static ArrayList<Integer> ArrEle(int Arr[]){
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i< Arr.length;i++){
            if(Arr[i]%5==0 && Arr[i]%7==0){
                result.add(Arr[i]);
            }
        }
      return result;
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int A[]= new int[n];
        for(int i=0;i< A.length;i++){
            A[i]=scn.nextInt();
        }
        ArrayList<Integer>Result=ArrEle(A);
        System.out.println("[ ");
        for(int k=0;k< Result.size();k++){
            System.out.print(Result.get(k));
        }
        System.out.println(" ]");
    }
}
