package Problems.Chapter18_InputOutputSystem.e_BufferedReadingFromFile;

import java.io.IOException;
import java.io.StringReader;

/**
 * @author SashaKhyzhun on 8/21/17.
 * Page 745.
 */
public class MemoryInput {

    public static void main(String[] args) throws IOException {
        StringReader in = new StringReader(
                BufferedInputFile.read(
                        "MemoryInput.java"));

        int c;
        while ((c = in.read()) != -1)
            System.out.println((char)c);
    }

}
