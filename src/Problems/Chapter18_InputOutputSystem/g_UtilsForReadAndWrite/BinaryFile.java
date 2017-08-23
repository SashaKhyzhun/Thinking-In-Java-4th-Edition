package Problems.Chapter18_InputOutputSystem.g_UtilsForReadAndWrite;

import java.io.*;

/**
 * @author SashaKhyzhun on 8/23/17.
 * Page 754.
 */
public class BinaryFile {

    public static byte[] read(File bFile) throws IOException {
        BufferedInputStream bf = new BufferedInputStream(new FileInputStream(bFile));
        try {
            byte[] data = new byte[bf.available()];
            bf.read(data);
            return data;
        } finally {
            bf.close();
        }
    }

    public static byte[] read(String bFile) throws IOException {
        return read(new File(bFile).getAbsoluteFile());
    }





}
