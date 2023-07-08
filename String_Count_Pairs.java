import java.util.Scanner;

public class String_Count_Pairs {
    public static int count_pairs(String S,char start,char end){
        int ans =0;
        int count_char = 0;
        char Str[] = S.toCharArray();
        for(int i =0;i<S.length();i++){
            if(Str[i]==start){
                count_char++;
            } else if (Str[i]==end) {
                ans = ans+count_char;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String Input_String = scn.next();
        char start = scn.next().charAt(0);
        char end = scn.next().charAt(0);
        int result = count_pairs(Input_String,start,end);
        System.out.println(result);
    }
}
