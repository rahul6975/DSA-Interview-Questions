import java.util.Scanner;

public class BirthdayChocolateShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int students = sc.nextInt();
        System.out.println(isPossible(money, students));
    }

    private static String isPossible(int money, int students) {
        if (students > money)
            return "No Chocolates";
        if (money / 5 >= students) {
            return "Dairy Milk";
        }
        if (money / 2 >= students) {
            return "Shots";
        } else {
            return "Eclairs";
        }
    }
}
