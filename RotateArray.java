import java.util.Scanner;

//time = 0(n)
//space = 0(1)
public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases != 0) {
            int length = sc.nextInt();
            int times = sc.nextInt();
            int[] arr = new int[length];
            for (int i = 0; i < length; i++) {
                arr[i] = sc.nextInt();
            }
            RightRotate(arr, length, times);
            testCases--;
        }
    }

    static void RightRotate(int[] arr, int n, int k) {
        k = k % n;
        for (int i = 0; i < n; i++) {
            if (i < k) {
                System.out.print(arr[n + i - k] + " ");
            } else {
                System.out.print(arr[i - k] + " ");
            }
        }
        System.out.println();
    }
}
