import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

//time = 0(n^2)
//space = 0(n)
public class TwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases != 0) {
            int length = sc.nextInt();
            int[] arr1 = new int[length];
            int[] arr2 = new int[length];
            for (int i = 0; i < length; i++)
                arr1[i] = sc.nextInt();
            for (int i = 0; i < length; i++)
                arr2[i] = sc.nextInt();
            Arrays.sort(arr2);
            System.out.println(getComman(arr1, arr2, length));
            testCases--;
        }
    }

    private static int getComman(int[] arr1, int[] arr2, int length) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < length; i++) {
            if (!hashSet.contains(arr1[i]) && arr1[i] == arr2[i]) {
                hashSet.add(arr1[i]);
            }
        }
        return hashSet.size();
    }
}
