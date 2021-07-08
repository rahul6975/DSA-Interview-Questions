import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//time = 0(n)
//space = 0(n)
public class CanBeMadePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases != 0) {
            int length = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            System.out.println(possible(str));
            testCases--;
        }
    }

    private static String possible(String str) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (list.contains(str.charAt(i))) {
                list.remove((Character) str.charAt(i));
            } else {
                list.add(str.charAt(i));
            }
        }
        if ((str.length() % 2 == 1 && list.size() == 1) || str.length() % 2 == 0 && list.isEmpty())
            return "Yes";
        else
            return "No";
    }
}
