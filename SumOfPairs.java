import java.util.Scanner;

//time = 0(n^2)
//space = 0(1)
public class SumOfPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(sumOfPairs(arr, length));
    }

    private static int sumOfPairs(int[] arr, int length) {
        int total = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i < j && isPrime(j - i)) {
                    int sum = Math.abs(arr[i] - arr[j]);
                    total += sum;
                }
            }
        }
        return total;
    }

    private static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        if (n <= 1) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
