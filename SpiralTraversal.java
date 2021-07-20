import java.util.ArrayList;
import java.util.Scanner;

//time = 0(n*m)
//space =0(n)
public class SpiralTraversal {
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
            ArrayList<Integer> arrayList = spinKarDo(row, column, arr);
            for (int i = 0; i < arrayList.size(); i++) {
                System.out.print(arrayList.get(i) + " ");
            }
            System.out.println();
            testCases--;
        }
    }

    private static ArrayList<Integer> spinKarDo(int row, int column, int[][] arr) {
        int start = 0;
        int down = row - 1;
        int end = row - 1;
        int temp = 0;
        int up = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (temp != row * row) {
            for (int i = up; i <= down && temp != row * row; i++) {
                arrayList.add(arr[i][start]);
                temp++;
            }
            start++;
            for (int i = start; i <= end && temp != row * row; i++) {
                arrayList.add(arr[down][i]);
                temp++;
            }
            down--;
            for (int i = down; i >= up && temp != row * row; i--) {
                arrayList.add(arr[i][end]);
                temp++;
            }
            end--;
            for (int i = end; i >= start && temp != row * row; i--) {
                arrayList.add(arr[up][i]);
                temp++;
            }
            up++;
        }
        return arrayList;
    }
}
