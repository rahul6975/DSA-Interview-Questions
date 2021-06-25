import java.util.HashMap;
import java.util.Scanner;

//input = {3,4,5,7,9,9,9,9,9}
//output = 9

//input = {5,6,7,8,5}
//output = -1

public class FindMajorityInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(usingHashMap(arr));
    }

    //time=0(n^2)
    //space = 0(1)
    private static int bruteForce(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i] && j != i) {
                    count++;
                }
            }
            if (count >= arr.length / 2 + 1) {
                return arr[i];
            }
        }
        return -1;
    }

    //time=0(n)
    //space = 0(n)
    private static int usingHashMap(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!hashMap.containsKey(arr[i])) {
                hashMap.put(arr[i], 1);
            } else {
                int count = hashMap.getOrDefault(arr[i], 1);
                int put = ++count;
                hashMap.put(arr[i], put);
                if (put >= arr.length / 2 + 1) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    //time=0(n log n)
    //space = 0(1) but if considering merge sort then 0(n)
    private static int usingSort(int[] arr) {
        int start = 0, end = arr.length - 1;
        sortArray(arr, start, end);
        for (int i = 0; i < arr.length / 2 + 1; i++) {
            if (arr[i] == arr[i + arr.length / 2]) {
                return arr[i];
            }
        }
        return -1;
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
