package Problems.Chapter11_Collections.e_Stack;

/**
 * Created by SashaKhyzhun on 2/25/17.
 */
public class StackTask {

    public static void main(String[] args) {
        String expression = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";


        java.util.Stack<String> stack = new java.util.Stack<String>();

        for (String s : expression.split(" ")) {

            for (String i : s.split("")) {
                if (i.equals("+")) {
                    stack.push(s);
                } else if (i.equals("-")) {
                    stack.pop();
                }
                else { System.out.print(i); }
            }

        }

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }

    }


}
