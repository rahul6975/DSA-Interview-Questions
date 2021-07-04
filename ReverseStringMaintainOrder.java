import java.util.Scanner;

//time = 0(n)
//space = 0(n)
public class ReverseStringMaintainOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        while (testCases != 0) {
            String str = sc.nextLine();
            String[] arr = str.split(" ");
            for (int i = 0; i < arr.length; i++) {
                StringBuilder stringBuilder = new StringBuilder();
                for (int j = 0; j < arr[i].length(); j++) {
                    stringBuilder.append(arr[i].charAt(j));
                }
                stringBuilder.reverse();
                arr[i] = stringBuilder.toString();
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            testCases--;
        }
    }
}
