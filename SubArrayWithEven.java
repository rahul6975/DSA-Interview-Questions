import java.util.Scanner;

//time = 0(n)
//space = 0(1)
public class SubArrayWithEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++)
            arr[i] = sc.nextInt();
        System.out.println(evenArrays(arr, length));
    }

    private static int evenArrays(int[] arr, int length) {
        int sub = 0, count = 0;
        for (int i = length - 1; i >= 0; i--) {
            if (arr[i] % 2 == 1) {
                sub = length - i - 1 - sub;
            } else {
                sub = sub + 1;
            }
            count = count + sub;
        }
        return count;
    }
}
