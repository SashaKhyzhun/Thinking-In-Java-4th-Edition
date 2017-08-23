package Problems.Chapter18_InputOutputSystem.i_ProcessControl;

import java.io.*;

/**
 * @author SashaKhyzhun on 8/23/17.
 * Page 757.
 * Перенаправление страндрартного ввода-вывода.
 */
public class Redirection {

    public static void main(String[] args) throws IOException {
        Redirection redirection = new Redirection();


        PrintStream console = System.out;

        BufferedInputStream in = new BufferedInputStream(
                new FileInputStream(redirection.getClass().getCanonicalName() + ".Redirecting.java"));

        PrintStream out = new PrintStream(
                new BufferedOutputStream(
                        new FileOutputStream("test.out")));

        System.setIn(in);
        System.setOut(out);
        System.setErr(out);

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
        out.close(); // Не забудьте!

        System.setOut(console);


    }

}
