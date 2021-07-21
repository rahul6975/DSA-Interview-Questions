import java.util.Scanner;
import java.util.Stack;

public class BinaryCricket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int testCases = sc.nextInt();
        while (testCases != 0) {
            int length = sc.nextInt();
            long k = sc.nextLong();
            int[] arr = new int[length];
            for (int i = 0; i < length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(milGya(arr, k));
            testCases--;
        }
    }

    private static String milGya(int[] arr, long k) {
        int low = arr[0];
        int high = arr[arr.length - 1];
        while (low < high) {
            if (arr[low] + arr[high] == k) {
                return "Yes";
            } else if (arr[low] + arr[high] < k) {
                low++;
            } else {
                high--;
            }
        }
        return "No";
    }
}
