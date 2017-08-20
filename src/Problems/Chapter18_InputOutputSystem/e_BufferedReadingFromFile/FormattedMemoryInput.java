package Problems.Chapter18_InputOutputSystem.e_BufferedReadingFromFile;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;

/**
 * @author SashaKhyzhun on 8/21/17.
 * Page 745.
 */
public class FormattedMemoryInput {

    public static void main(String[] args) throws IOException {
        try {
            DataInputStream in = new DataInputStream(
                    new ByteArrayInputStream(
                            BufferedInputFile
                                    .read("FormattedMemoryInput.java")
                                    .getBytes()));

            while (true) {
                System.out.println((char)in.readByte());
            }

        } catch (EOFException e) {
            System.err.println("End of stream");
        }
    }
}
