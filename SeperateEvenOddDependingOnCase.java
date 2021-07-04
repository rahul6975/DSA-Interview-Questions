import java.util.Scanner;

public class SeperateEvenOddDependingOnCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases != 0) {
            int length = sc.nextInt();
            int[] arr = new int[length];
            for (int i = 0; i < length; i++) {
                arr[i] = sc.nextInt();
            }
            int condition = sc.nextInt();
            if (condition == 1) {
                usingTwoPointerEvenFirst(arr, length);
                for (int i = 0; i < length; i++) {
                    System.out.print(arr[i] + " ");
                }
            } else {
                usingTwoPointerOddFirst(arr, length);
                for (int i = 0; i < length; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
            testCases--;
        }
    }

    //time=0(n)
    //space=0(1)
    private static void usingTwoPointerEvenFirst(int[] arr, int length) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            while (arr[left] % 2 == 0 && left < right)
                left++;
            while (arr[right] % 2 == 1 && left < right)
                right--;
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }

    }

    //time=0(n)
    //space=0(1)
    private static void usingTwoPointerOddFirst(int[] arr, int length) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            while (arr[left] % 2 != 0 && left < right)
                left++;

            while (arr[right] % 2 == 1 && left < right)
                right--;

            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
    }
}
