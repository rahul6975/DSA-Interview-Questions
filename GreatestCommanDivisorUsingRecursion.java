import java.util.Scanner;

//time = 0(log n)
//space=0(n)
public class GreatestCommanDivisorUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases != 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            System.out.println(gcd(a, b));
            testCases--;
        }
    }

    private static long gcd(long a, long b) {

        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        if (a == b) {
            return a;
        }
        if (a > b) {
            return gcd(a - b, b);
        }
        return gcd(a, b - a);
    }
}
