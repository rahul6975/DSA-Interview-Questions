import java.util.Scanner;

//time = 0(n)
//space = 0(n)
public class BeyondFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.format("%.4f", print(a));
    }

    private static double print(int a) {
        if (a == 1)
            return 0;
        return print(a - 1) + Math.log(a);
    }
}
