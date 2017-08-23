package Problems.Chapter18_InputOutputSystem.j_NewInputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author SashaKhyzhun on 8/23/17.
 * Page 760.
 *
 * Три класса из "старой" библиотеки ввода-вывода были изменены так, чтобы они
 * позволяли получить канал FileChannel: это FileInputStream, FileOutputStream и
 * позволяющий одновременное чтение и запись RandomAccessFile.
 *
 * Заметьте, что эти классы манипулируют байтами, что
 * согласуется с низкоуровневой направленностью nio.
 */
public class GetChannel {

    private static final int BSIZE = 1024;

    public static void main(String[] args) throws Exception {
        // Запись файла:
        FileChannel fc = new FileOutputStream("GetChannel.txt").getChannel();
        fc.write(ByteBuffer.wrap("Some text, ".getBytes()));
        fc.close();

        // Добавление в конец файла:
        fc = new RandomAccessFile("GetChannel.txt", "rw").getChannel();
        fc.position(fc.size()); // перемешение в конец
        fc.write(ByteBuffer.wrap("Some more".getBytes()));
        fc.close();

        // Чтение файла:
        fc = new FileInputStream("GetChannel.txt").getChannel();
        ByteBuffer buff = ByteBuffer.allocate(BSIZE);
        fc.read(buff);
        buff.flip(); // извлекает из буфера данные

        while (buff.hasRemaining()) {
            System.out.print((char)buff.get());
        }



    }

}
