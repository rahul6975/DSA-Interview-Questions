import java.util.Arrays;
import java.util.Scanner;

public class AnagramPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while(testCase!=0) {
            int n = sc.nextInt();
            String[] ar = new String[n];
            for(int i=0; i<n; i++) {
                String str = sc.next();
                char[] temp = str.toCharArray();
                Arrays.sort(temp);
                String s = String.valueOf(temp);
                ar[i] = s;
            }

//            for(int i=0; i<ar.length; i++) {
//                System.out.println(ar[i]);
//            }
            System.out.println(noOfAnagramPairs(ar));
            testCase--;
        }
    }

    private static int noOfAnagramPairs(String[] ar) {
        int pairs = 0;
        for(int i=0; i<ar.length; i++) {
            for(int j=i+1; j<ar.length; j++) {
                if(ar[i].equals(ar[j])) pairs++;
            }
        }
        return pairs;
    }
}
