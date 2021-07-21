import java.util.Scanner;
import java.util.Stack;
public class Stackmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int query = sc.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
        while(query--!=0) {
            String str = sc.next();
            if(str.equals("PUSH")) {
                stack.push(sc.nextInt());
            }
            else if(str.equals("MIN")) {
                System.out.println(getMin(stack));
            }
            else {
                if(!stack.empty()) stack.pop();
            }
        }
    }
    public static int getMin(Stack<Integer> stack) {
        int min = Integer.MAX_VALUE;
        for(int i:stack){
            if(i<min) min = i;
        }
        return min;
    }
}