import java.util.Scanner;

//time =0(n)
//space = 0(1)
public class HammeringDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases != 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(distance(a, b));
            testCases--;
        }
    }

    private static int distance(int a, int b) {
        int bits = 0;
        int total = a ^ b;
        while (total > 0) {
            bits += total & 1;
            total >>= 1;
        }
        return bits;
    }
}