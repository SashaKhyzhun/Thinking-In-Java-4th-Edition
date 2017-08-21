package Problems.Chapter18_InputOutputSystem.e_BufferedReadingFromFile;

import java.io.*;

/**
 * @author SashaKhyzhun on 8/22/17.
 * Page 746
 */
public class BasicFileOutput {

    static String file = "BasicFileOutput.out";

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new StringReader(
                BufferedInputFile.read("BasicFileOutput.java")));

        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file)));
        int lineCount = 1;
        String s;

        while ((s = in.readLine()) != null) {
            out.print(lineCount++ + ": " + s);
        }

        out.close();
        // Вывод сохраненного файла:
        System.out.println(BufferedInputFile.read(file));

    }

}
