import java.util.Scanner;

//time =0(n^2)
//space = 0(1)
public class SimpleChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases != 0) {
            int length = sc.nextInt();
            int[] arr = new int[length];
            for (int i = 0; i < length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(getMax(arr, length));

            testCases--;
        }
    }

    private static int getMax(int[] arr, int length) {
        int count = 0;
        int finalCount = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i != j) {
                    count = ((arr[i] - arr[j]) + (i - j));
                    finalCount = Math.max(count, finalCount);
                }
            }
        }
        return finalCount;
    }
}
