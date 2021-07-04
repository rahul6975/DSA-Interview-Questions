import java.util.Scanner;

public class Swap012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases != 0) {
            int length = sc.nextInt();
            int[] arr = new int[length];
            for (int i = 0; i < length; i++) {
                arr[i] = sc.nextInt();
            }
            sort(arr, length);
            for (int i = 0; i < length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            testCases--;
        }
    }

    private static void sort(int[] arr, int length) {
        int low = 0, high = length - 1, mid = 0;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    int temp = arr[mid];
                    arr[mid] = arr[low];
                    arr[low] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    int temp2 = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp2;
                    high--;
                    break;
            }
        }
    }

    private static void swap(int[] arr, int mid, int high) {
        int temp = arr[mid];
        arr[high] = arr[mid];
        arr[high] = temp;
    }
}
