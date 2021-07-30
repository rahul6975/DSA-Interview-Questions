import java.util.Scanner;
import java.util.ArrayList;
public class RemoveInLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0; i<n; i++) {
            ar.add(sc.nextInt());
        }
        print(ar);
    }
    public static void print(ArrayList<Integer> ar) {
        int n = ar.size();
        for(int i=0; i<n; i++) {
            for(int j=0; j<ar.size(); j++) {
                System.out.print(ar.get(i)+" ");
            }
            ar.remove(0);
            System.out.println();
        }
        System.out.println(-1);
    }
}