import java.util.Scanner;

//time = 0(n)
//space= 0(1)
public class LargestSumContiguousSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases != 0) {
            int length = sc.nextInt();
            int[] arr = new int[length];
            for (int i = 0; i < length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(total(arr, length));
            testCases--;
        }
    }

    private static int total(int[] arr, int length) {
        int max = Integer.MIN_VALUE, initial = 0;
        for (int i = 0; i < length; i++) {
            initial = initial + arr[i];
            if (max < initial)
                max = initial;
            if (initial < 0)
                initial = 0;
        }
        return max;
    }
}
