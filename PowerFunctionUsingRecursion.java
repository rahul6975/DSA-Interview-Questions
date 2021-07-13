import java.util.Scanner;

//time = 0(log b)
//space = 0(1)
public class PowerFunctionUsingRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(power(a, b));
    }

    private static int power(int a, int b) {
        if (b == 0)
            return 1;
        if (b == 1)
            return a;
        return a * power(a, b - 1);
    }
}
