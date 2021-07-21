import java.util.Scanner;
import java.util.Stack;

//time=0(n)
//space =0(n)
public class Bracket {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases > 0) {
            String str = sc.next();
            Stack<Object> stack = new Stack<>();
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(' ||
                        str.charAt(i) == '{' || str.charAt(i) == '[') {
                    stack.push(str.charAt(i));
                    count++;
                } else {
                    if (!stack.isEmpty()) {
                        if (str.charAt(i) == ')') {
                            if (stack.peek().equals('(')) {
                                stack.pop();
                            } else {
//                                System.out.println("not balanced");
                                break;
                            }
                        } else if (str.charAt(i) == '}') {
                            if (stack.peek().equals('{')) {
                                stack.pop();
                            } else {
//                                System.out.println("not balanced");
                                break;
                            }
                        } else if (str.charAt(i) == ']') {
                            if (stack.peek().equals('[')) {
                                stack.pop();
                            } else {
//                                System.out.println("not balanced");
                                break;
                            }
                        }
                    } else {
//                        System.out.println("not balanced");
                        break;
                    }
                }
            }
            if (stack.isEmpty() && count != 0) {
                System.out.println("balanced");
            } else if (!stack.isEmpty() && count != 0) {
                System.out.println("not balanced");
            } else {
                System.out.println("not balanced");

            }
            testCases--;
        }
    }

}