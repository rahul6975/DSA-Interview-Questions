import java.util.Scanner;

//time = 0(n^3)
//space = 0(1)
public class TripletSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases != 0) {
            int length = sc.nextInt();
            int[] arr = new int[length];
            for (int i = 0; i < length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(triplet(arr, length));
            testCases--;
        }
    }

    private static int triplet(int[] arr, int length) {
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                int sum = arr[i] + arr[j];
                for (int k = 0; k < length; k++) {
                    if (arr[k] == sum) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }
}
