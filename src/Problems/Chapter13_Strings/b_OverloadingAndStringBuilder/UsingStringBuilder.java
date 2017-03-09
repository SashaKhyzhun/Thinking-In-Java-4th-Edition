package Problems.Chapter13_Strings.b_OverloadingAndStringBuilder;

import java.util.Observable;
import java.util.Random;

/**
 * Created by SashaKhyzhun on 3/9/17. Page 417
 */
public class UsingStringBuilder {
    public static Random random = new Random(47);

    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < 25; i++) {
            result.append(random.nextInt(100));
            result.append(", ");
        }

        result.delete(result.length() - 2, result.length());
        result.append("]");
        return result.toString();
    }

    public static void main(String[] args) {
        UsingStringBuilder usb = new UsingStringBuilder();
        System.out.println(usb);
    }
}
