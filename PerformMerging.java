import java.util.Scanner;

//time =0(n^2)
//space = 0(n)
public class PerformMerging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr1 = new int[length];
        int[] arr2 = new int[length];
        for (int i = 0; i < length; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < length; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] finalArray = new int[length + length];
        for (int i = 0; i < length; i++) {
            finalArray[i] = arr1[i];
        }
        for (int i = 0; i < length; i++) {
            finalArray[i + length] = arr2[i];
        }
        for (int i = 0; i < finalArray.length - 1; i++) {
            for (int j = i + 1; j < finalArray.length; j++) {
                if (finalArray[i] > finalArray[j]) {
                    int temp = finalArray[i];
                    finalArray[i] = finalArray[j];
                    finalArray[j] = temp;
                }
            }
        }
        for (int i = 0; i < finalArray.length; i++) {
            System.out.print(finalArray[i] + " ");
        }
    }
}
