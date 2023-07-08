public class LeftMaxArray_count {
    public static int FindLM(int[] arr) {
        int n = arr.length;
        int LeftMax[] = new int[n];
        LeftMax[0] = arr[0];
        int count = 1;
        for (int i = 1; i < n; i++) {
            LeftMax[i] = Math.max(LeftMax[i - 1], arr[i]);
            if (arr[i] > LeftMax[i - 1]) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int A[] = {-3, 6, 2, 4, 5, 2, 8, -9};
        int result = FindLM(A);
        int count = FindLM(A);
        System.out.println(count);
    }
}
