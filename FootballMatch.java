import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//time = 0(n)
//space = 0(1)
public class FootballMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        int j = 0;
        String[] str = new String[testCases];
        while (testCases != 0) {
            str[j] = sc.nextLine();
            j++;
            testCases--;
        }
        String team1 = str[0];
        String team2 = "";
        int teamA = 1;
        int teamB = 0;
        for (int i = 1; i < str.length; i++) {
            if (str[i].equals(team1)) {
                teamA++;
            } else {
                team2 = str[i];
                teamB++;
            }
        }
        if (teamA > teamB) {
            System.out.println(team1);
        } else {
            System.out.println(team2);
        }
    }
}
