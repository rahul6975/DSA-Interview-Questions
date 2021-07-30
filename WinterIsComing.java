import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WinterIsComing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numPairs = 8;
        int[] moneyDistributed = new int[numPairs];
        for (int i = 0; i < numPairs; i++)
            moneyDistributed[i] = s.nextInt();
        int p = s.nextInt();
        int[][] coldWarMembers = new int[p][2];
        for (int i = 0; i < p; i++) {
            coldWarMembers[i][0] = s.nextInt();
            coldWarMembers[i][1] = s.nextInt();
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < p; i++) {
            int a = coldWarMembers[i][0];
            int b = coldWarMembers[i][1];
            if (moneyDistributed[a - 1] > moneyDistributed[b - 1]) {
                hashMap.put(a - 1, moneyDistributed[a - 1]);
                hashMap.put(b - 1, 0);
            } else {
                hashMap.put(b - 1, moneyDistributed[b - 1]);
                hashMap.put(a - 1, 0);
            }
        }
        int maxSum = 0;
        for (Map.Entry<Integer, Integer> e : hashMap.entrySet()) {
            maxSum += e.getValue();
        }
        for (int i = 0; i < numPairs; i++) {
            if (!hashMap.containsKey(i)) {
                maxSum += moneyDistributed[i];
            }
        }
        System.out.println(maxSum);
    }
}