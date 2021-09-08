/*K even subset Ended
Description
Given an array A having N positive integers. Count the number of non-empty subsets of array A such that each subset has at least K even numbers.
Input
First line: Single integer denoting the value of T - the number of test cases.
For each test case:
First line: Two single space-separated integers denoting the values of N and K.
Next line: N single space-separated integers denoting the elements of array A.
Constraints:
1 <= T <= 100
1 <= N, K <= 15
1 <= A[ i ] <= 100
Output
For each test case, print in a new line, a single integer denoting the required count of subsets.
Sample Input 1
2
4 2
4 3 2 1
2 1
2 3
Sample Output 1
4
2
Hint
Given test cases:
Test case 1:
N = 4, K = 2, A: [ 4, 3, 2, 1 ].
Subsets which has at least two even numbers are:
{ 4,3,2,1 }, { 4, 3, 2 }, { 4, 2 },{4, 2, 1}.
Test case 2:
N = 2, A: [ 2, 3 ].
Subsetswhich has at least one even number are:
{2}, {2, 3}.
*/


import java.util.*;

class KEvenSubset {

    public static int countS = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();

        for (int t = 0; t < testcase; t++) {
            int len = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[len];
            countS = 0;

            for (int i = 0; i < len; i++) arr[i] = sc.nextInt();

            countEven(arr, 0, 0, k);
            System.out.println(countS);
        }
    }

    public static void countEven(int[] arr, int ind, int count, int k) {
        if (count >= k) countS++;
        for (int i = ind; i < arr.length; i++) {
            if (arr[i] % 2 == 0) count++;
            countEven(arr, i + 1, count, k);
            if (arr[i] % 2 == 0) count--;
        }
    }
}