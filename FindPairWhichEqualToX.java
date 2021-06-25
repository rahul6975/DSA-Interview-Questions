import java.util.HashSet;
import java.util.Scanner;

//input = 0 -1 2 -3 1 , k = -2
//output = -3 1
public class FindPairWhichEqualToX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arrr = usingHashSet(arr, length, k);
        if (arrr[0] == -1) {
            System.out.println("No such pairs present");
        } else {
            System.out.println(arrr[0] + " " + arrr[1]);
        }
    }

    //time = 0(n)
    //space = 0(n)
    private static int[] usingHashSet(int[] arr, int length, int k) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < length; i++) {
            int temp = k - arr[i];
            if (hashSet.contains(temp)) {
                int a = arr[i];
                int b = temp;
                int[] arrr = {a, b};
                return arrr;
            }
            hashSet.add(arr[i]);
        }
        int not = -1;
        int[] arrr = {not};
        return arrr;
    }

    //time 0(n log n)
    //space = 0(1) but if considering merge sort then 0(n)
    private static int[] usingSortingAndTwoPointer(int[] arr, int length, int k) {
        int start = 0, end = length - 1;
        sortArray(arr, start, end);
        while (start < end) {
            if (arr[start] + arr[end] == k) {
                int a = arr[start];
                int b = arr[end];
                int[] arrr = {a, b};
                return arrr;
            } else if (arr[start] + arr[end] < k) {
                start++;
            } else {
                end--;
            }
        }
        int not = -1;
        int[] arrr = {not};
        return arrr;
    }

    private static void sortArray(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            sortArray(arr, start, mid);
            sortArray(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for (int i = 0; i < n1; i++)
            arr1[i] = arr[start + i];
        for (int i = 0; i < n2; i++)
            arr2[i] = arr[mid + 1 + i];

        int i = 0, j = 0, k = start;
        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                arr[k++] = arr1[i++];
            } else {
                arr[k++] = arr2[j++];
            }
        }
        while (i < n1) {
            arr[k++] = arr1[i++];
        }
        while (j < n2) {
            arr[k++] = arr2[j++];
        }
    }
}
