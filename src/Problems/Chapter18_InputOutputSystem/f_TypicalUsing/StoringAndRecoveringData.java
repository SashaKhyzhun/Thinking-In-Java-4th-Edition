package Problems.Chapter18_InputOutputSystem.f_TypicalUsing;

import java.io.*;

/**
 * @author SashaKhyzhun on 8/22/17.
 * Page 748.
 */
public class StoringAndRecoveringData {

    public static void main(String[] args) throws Exception {
        DataOutputStream out = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("Data.txt")));

        out.writeDouble(3.14159);
        out.writeUTF("That was PI");
        out.writeDouble(1.41413);
        out.writeUTF("Square root of 2");
        out.close();

        DataInputStream in = new DataInputStream(
                new BufferedInputStream(
                        new FileInputStream("Data.txt")));

        System.out.println(in.readDouble());
        // Толко readUTF() правильно восстановит
        // объект String в кодировке UTF для Java:
        System.out.println(in.readUTF());
        System.out.println(in.readDouble());
        System.out.println(in.readUTF());
    }

}
