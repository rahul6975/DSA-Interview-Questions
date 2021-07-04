import java.util.Scanner;

//time = 0(n)
//space = 0(1)
public class StringRotationAndCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(possible(str1, str2));
    }

    private static String possible(String str1, String str2) {
        if ((str1.length() == str2.length()) && ((str1 + str1).contains(str2))) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
