package Problems.Chapter18_InputOutputSystem.e_BufferedReadingFromFile;

import java.io.*;

/**
 * @author SashaKhyzhun on 8/21/17.
 * Page 744.
 * Чтобы открыть файл для посимвольного чтения,
 * используется класс FileInputReader.
 */
public class BufferedInputFile {

    // Вывод исключений на консоль:
    public static String read(String filename) throws IOException {
        // Чтение по строкам:
        BufferedReader in = new BufferedReader(new FileReader(filename));
        String s;
        StringBuilder sb = new StringBuilder();
        while ((s = in.readLine()) != null)
            sb.append(s + "\n");
        in.close();
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        System.out.println(read("BufferedInputFile.java"));
    }
}
