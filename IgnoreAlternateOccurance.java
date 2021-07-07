import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;

//time = 0(n)
//space = 0(n)
public class IgnoreAlternateOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printUnique(str);
    }

    private static void printUnique(String strr) {
        StringBuilder stringBuilder = new StringBuilder();
        String str = strr.toLowerCase();
        HashSet<Object> hashSet = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (hashSet.contains(ch)) {
                hashSet.remove(ch);
            } else {
                stringBuilder.append(ch);
                hashSet.add(ch);
            }
        }
        System.out.println(stringBuilder);
    }
}
