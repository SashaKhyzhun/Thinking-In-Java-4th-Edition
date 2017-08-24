package Problems.Chapter18_InputOutputSystem.k_DataBuffering;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

/**
 * @author SashaKhyzhun on 8/24/17.
 * Page 772.
 */
public class UsingBuffers {

    private static void symmetricScramble(CharBuffer buffer) {
        while (buffer.hasRemaining()) {
            buffer.mark();
            char c1 = buffer.get();
            char c2 = buffer.get();
            buffer.reset();
            buffer.put(c2).put(c1);
        }
    }

    public static void main(String[] args) {
        char[] data = "UsingBuffers".toCharArray();
        ByteBuffer bb = ByteBuffer.allocate(data.length * 2);
        CharBuffer cb = bb.asCharBuffer();

        cb.put(data);
        System.out.println(cb.rewind());

        symmetricScramble(cb);
        System.out.println(cb.rewind());

        symmetricScramble(cb);
        System.out.println(cb.rewind());

    }

}
