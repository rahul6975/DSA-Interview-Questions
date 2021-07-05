import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagramPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases != 0) {
            int totalCount = 0;
            int total = sc.nextInt();
            sc.nextLine();
            String[] strArray = new String[total];
            for (int i = 0; i < total; i++) {
                strArray[i] = sc.nextLine();
            }
            for (int i = 0; i < total; i++) {
                for (int j = 0; j < total; j++) {
                    if (i < j) {
                        if (anagram(strArray[i], strArray[j])) {
                            totalCount++;
                        }
                    }
                }
            }
            System.out.println(totalCount);
            testCases--;
        }
    }

    private static boolean anagram(String str1, String str2) {
        char[] str1Char = str1.toCharArray();
        char[] str2Char = str2.toCharArray();
        if (str1Char.length != str2Char.length) {
            return false;
        }
        Arrays.sort(str1Char);
        Arrays.sort(str2Char);
        for (int i = 0; i < str1Char.length; i++) {
            if (str1Char != str2Char) {
                return false;
            }
        }
        return true;
    }
}
