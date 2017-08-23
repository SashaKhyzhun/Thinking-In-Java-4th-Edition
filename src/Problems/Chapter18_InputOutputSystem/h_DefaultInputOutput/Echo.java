package Problems.Chapter18_InputOutputSystem.h_DefaultInputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author SashaKhyzhun on 8/23/17.
 * Page 755.
 */

public class Echo {


    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = stdin.readLine()) != null && s.length() != 0) {
            System.out.println(s);
        }
        // Пустая строка или Ctrl-Z завершает работу программы.
    }

}
