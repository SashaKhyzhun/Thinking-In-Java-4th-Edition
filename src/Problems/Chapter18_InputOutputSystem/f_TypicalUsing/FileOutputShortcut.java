package Problems.Chapter18_InputOutputSystem.f_TypicalUsing;

import Problems.Chapter16_Arrays.f_CreatingTestData.RandomGenerator;
import Problems.Chapter18_InputOutputSystem.e_BufferedReadingFromFile.BufferedInputFile;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.StringReader;

/**
 * @author SashaKhyzhun on 8/22/17.
 * Page 747.
 */
public class FileOutputShortcut {

    static String file = "FileOutputShortcut.out";

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(
                new StringReader(
                        BufferedInputFile.read("FileOutputShortcut.java")));

        // Сокращенная запись:
        PrintWriter out = new PrintWriter(file);
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
