public class LeftMaxArray {
    public static int[] FindLM(int[] arr) {
        int n = arr.length;
        int LeftMax[] = new int[n];
        LeftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            LeftMax[i] = Math.max(LeftMax[i - 1], arr[i]);
        }
        return LeftMax;
    }
    public static void main(String[] args) {
        int A[] = {-3, 6, 2, 4, 5, 2, 8, -9};
        int result[] = FindLM(A);
        for (int k = 0; k < result.length; k++) {
            System.out.println(result[k]);
        }
    }
}

