import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

//time = 0(n^2)
//space = 0(n)
public class TripletWithSum0 {
    static int finalCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++)
            arr[i] = sc.nextInt();
        hashSet(arr, length);
        System.out.println(finalCount);
    }

    private static void bruteForce(int[] arr, int length) {
        for (int i = 0; i < length - 2; i++) {
            for (int j = i + 1; j < length - 1; j++) {
                for (int k = j + 1; k < length; k++) {
                    int count = arr[i] + arr[j] + arr[k];
                    if (count == 0) {
                        finalCount++;
                    }
                }
            }
        }
    }

    private static void hashSet(int[] arr, int length) {

        for (int i = 0; i < length - 1; i++) {
            HashSet<Integer> hashset = new HashSet<>();
            for (int j = i + 1; j < length; j++) {
                int k = -(arr[i] + arr[j]);
                if (hashset.contains(k)) {
                    finalCount++;
                } else {
                    hashset.add(arr[j]);
                }
            }
        }
    }
}
