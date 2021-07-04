import java.util.Scanner;

//time=0(n^2)
//space = 0(1)
public class Rotate2DArray90Degree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases != 0) {
            int row = sc.nextInt();
            int column = row;
            int[][] arr = new int[row][column];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            rotateArray(arr, row);
            testCases--;
        }
    }

    private static void rotateArray(int[][] arr, int row) {
        for (int j = 0; j < row; j++) {
            for (int i = row - 1; i >= 0; i--)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
