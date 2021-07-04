import java.util.Scanner;

//time=0(n^2)
//space= 0(1)
public class ContigousSubArraywith0s1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases != 0) {
            int length = sc.nextInt();
            int[] arr = new int[length];
            for (int i = 0; i < length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(maxSubArray(arr, length));
            testCases--;
        }
    }

    private static int maxSubArray(int[] arr, int length) {
        int left = 0;
        int right = 0;
        int totalSize = 0;
        int total = 0;
        for (int i = 0; i < length - 1; i++) {
            if (arr[i] == 0) {
                total = -1;
            } else {
                total = 1;
            }
            for (int j = i + 1; j < length; j++) {
                if (arr[j] == 0) {
                    total += -1;
                } else {
                    total += 1;
                }
                if (total == 0 && totalSize < j - i + 1) {
                    totalSize = j - i + 1;
                    left = i;
                }
            }
        }
        right = left + totalSize;
        return right;
    }
}
