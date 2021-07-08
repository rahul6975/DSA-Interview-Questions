import java.util.Scanner;

//time = 0(n)
//space = 0(1)

public class EquilibriumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++)
            arr[i] = sc.nextInt();
        System.out.println(getEquilibrium(arr, length));
    }

    private static int getEquilibrium(int[] arr, int length) {
        int totalSum = 0;
        int startSum = 0;
        for (int i = 0; i < length; i++) {
            totalSum += arr[i];
        }
        for (int i = 0; i < length; i++) {
            totalSum = totalSum - arr[i];
            if (startSum == totalSum)
                return i + 1;
            startSum += arr[i];
        }
        return -1;
    }
}
