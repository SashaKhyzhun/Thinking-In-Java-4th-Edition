package Problems.Chapter18_InputOutputSystem.j_NewInputOutput;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author SashaKhyzhun on 8/23/17.
 * Page 762.
 *
 * Методы transferTo() и transferFrom() позволяют
 * напрямую присоединить один канал к другому:
 */
public class TransferTo {

    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("arguments: SourceFile DestFile");
            System.exit(1);
        }

        FileChannel
                in = new FileInputStream(args[0]).getChannel(),
                out = new FileInputStream(args[1]).getChannel();

        in.transferTo(0, in.size(), out);
        // или
        // out.transferFrom(in, 0, in,size());

    }


}
