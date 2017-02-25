package Problems.Chapter11_Collections.e_Stack;

import java.util.*;

/**
 * Created by SashaKhyzhun on 2/25/17. Page 342.
 *
 */
public class StackTest {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        for (String s : "My dog has fleas".split(" ")) {
            stack.push(s);
        }

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }

}
