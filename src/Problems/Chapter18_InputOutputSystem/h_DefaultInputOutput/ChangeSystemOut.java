package Problems.Chapter18_InputOutputSystem.h_DefaultInputOutput;

import java.io.PrintWriter;

/**
 * @author SashaKhyzhun on 8/23/17.
 */
public class ChangeSystemOut {
    public static void main(String[] args) {
        PrintWriter out = new PrintWriter(System.out, true); // true = need to print.
        out.println("Hello, world!");
    }
}
