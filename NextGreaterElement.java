import java.util.*;

//time =0(n^2)
//space =0(1)
public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases != 0) {
            int length = sc.nextInt();
            int[] arr = new int[length];
            for (int i = 0; i < length; i++) {
                arr[i] = sc.nextInt();
            }
            int[] result = getGreater(arr, length);
            for (int i : result) {
                System.out.print(i + " ");
            }
            System.out.println();
            testCases--;
        }
    }

    private static int[] getGreater(int[] arr, int length) {
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            if (i == length - 1) {
                result[i] = -1;
                break;
            }
            boolean milGya = false;
            for (int j = i; j < length; j++) {
                if (arr[j] > arr[i] && i != j) {
                    result[i] = arr[j];
                    milGya = true;
                    break;
                }
            }
            if (!milGya) {
                result[i] = -1;
            }
        }
        return result;
    }
}