package Problems.Chapter13_Strings.f_Hex;

import com.sun.codemodel.internal.fmt.JBinaryFile;
import sun.tools.java.BinaryClass;
import sun.tools.java.BinaryCode;

/**
 * Created by SashaKhyzhun on 3/9/17. Page 428.
 * Часто воникает необходимость просмотра содержимого двоичного файла в 16-ом формате.
 * Слудеющая программа выводит двоичный массив байтов в удобочитаемом 16-ом формате с
 * использованием метода String.format():
 */
public class Hex {

    public static String format(byte[] data) {
        StringBuilder result = new StringBuilder();
        int n = 0;

        for (byte b : data) {
            if (n % 16 == 0) {
                result.append(String.format("%05X: ", n));
            }
            result.append(String.format("%02X ", b));
            n++;

            if (n % 16 == 0) {
                result.append("\n");
            }
        }

        result.append("\n");
        return result.toString();
    }

    public static void main(String[] args) {
        JBinaryFile file = new JBinaryFile("Hex.class");
        if (args.length == 0) {
            // Тестирование на примере файла класса:
            //System.out.println(format(new JBinaryFile("Hex.class")));
        } else {
            //System.out.println(format(new JBinaryFile(String.valueOf(args[0]))));
        }
    }

}
