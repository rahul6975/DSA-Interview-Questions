import java.util.Scanner;

//time =0(n)
//space = 0(1)
public class SingleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases != 0) {
            int length = sc.nextInt();
            long[] arr = new long[length];
            for (int i = 0; i < length; i++) {
                arr[i] = sc.nextLong();
            }
            System.out.println(returnSingle(arr, length));
            testCases--;
        }
    }

    private static long returnSingle(long[] arr, int length) {
        int res = 0;
        for (int i = 0; i < length; i++) {
            res ^= arr[i];
        }
        return res;
    }
}
