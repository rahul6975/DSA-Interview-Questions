import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//input = 4 4 5 5 6 6 7
//output = 7
public class FindElementWhichAppearsOnceRestTwice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        int a = usingXORoperation(arr, length);
        System.out.println(a);
    }

    //time = 0(n)
    //space = 0(n)
    private static int usingHashMap(int[] arr, int length) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < length; i++) {
            if (!hashMap.containsKey(arr[i])) {
                hashMap.put(arr[i], 1);
            } else {
                int count = hashMap.getOrDefault(arr[i], 1);
                count++;
                hashMap.put(arr[i], count);
            }
        }
        for (Map.Entry<Integer, Integer> hm : hashMap.entrySet()) {
            int count = hm.getValue();
            if (count == 1) {
                return hm.getKey();
            }
        }
        return -1;
    }

    //time = 0(n)
    //space = 0(1)
    private static int usingXORoperation(int[] arr, int length) {
        int res = arr[0];
        for (int i = 1; i < length; i++) {
            res ^= arr[i];
        }
        return res;
    }
}
