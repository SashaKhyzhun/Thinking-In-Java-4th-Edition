package Problems.Chapter12_Exceptions.l_Constructors;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by SashaKhyzhun on 3/9/17. Page 398.
 * finally блок и конструктор.
 */
public class InputFile {

    private BufferedReader in;

    public InputFile(String fileName) throws Exception {
        try {
            in = new BufferedReader(new FileReader(fileName));
            // остальной код, способный возбужать исключения
        } catch (FileNotFoundException e) {
            System.out.println("Could not open " + fileName);
            // файл не был открыт, закрывать не нужно
            throw e;
        } catch (Exception e) {
            // при других исключениях необходимо закрыть файл
            try {
                in.close();
            } catch (IOException e2) {
                System.out.println("Ошибка при выполнении in.close()");
            }
            throw e; // Rethrow
        } finally {
            // здесь файл не закрывается!!!
        }
    }

    public String getLine() {
        String s;
        try {
            s = in.readLine();
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при выполнении readLine()");
        }
        return s;
    }
    public void dispose() {
        try {
            in.close();
            System.out.println("dispose() успешен");
        } catch (IOException e2) {
            throw new RuntimeException("Ошибка при выполнении in.close()");
        }
    }

}
