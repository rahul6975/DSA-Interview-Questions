import java.util.ArrayList;
import java.util.Scanner;

//input = {56,34,65,23,75}
//output = 56 34 75 65


public class SeparateEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++)
            arr[i] = sc.nextInt();
        int[] finalArray = usingBruteForce(arr, length);
        for (int i = 0; i < length; i++)
            System.out.print(finalArray[i] + " ");
    }

    //time=0(n)
    //space=0(1)
    private static int[] usingBruteForce(int[] arr, int length) {
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if (arr[i] % 2 == 0) {
                evenList.add(arr[i]);
            } else {
                oddList.add(arr[i]);
            }
        }
        int[] finalArray = new int[evenList.size() + oddList.size()];
        for (int i = 0; i < evenList.size(); i++) {
            finalArray[i] = evenList.get(i);
        }
        for (int i = 0; i < oddList.size(); i++) {
            finalArray[i + evenList.size()] = oddList.get(i);
        }
        return finalArray;
    }

    //time=0(n)
    //space=0(1)
    private static int[] usingTwoPointer(int[] arr, int length) {
        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j >= 0; j--) {
                if (arr[i] % 2 != 0 && arr[j] % 2 == 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
